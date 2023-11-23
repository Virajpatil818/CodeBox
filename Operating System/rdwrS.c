#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

#define R 5
#define W 5

int sharedData = 5;
int readCount = 0;
sem_t mutex, wsem, rsem;

void *reader(void *arg);
void *writer(void *arg);

int main() {
    pthread_t threads[R + W];
    sem_init(&mutex, 0, 1);
    sem_init(&wsem, 0, 1);
    sem_init(&rsem, 0, 1);

    int i;

    for (i = 0; i < R; ++i)
        pthread_create(&threads[i], NULL, reader, (void *)(intptr_t)i);

    for (i = R; i < R + W; ++i)
        pthread_create(&threads[i], NULL, writer, (void *)(intptr_t)(i - R));

    for (i = 0; i < R + W; ++i)
        pthread_join(threads[i], NULL);

    sem_destroy(&mutex);
    sem_destroy(&wsem);
    sem_destroy(&rsem);

    return 0;
}

void *reader(void *arg) {
    int id = (intptr_t)arg;
    int i;

    for (i = 0; i < 5; ++i) {
        sem_wait(&rsem);
        sem_wait(&mutex);
        readCount++;
        if (readCount == 1)
            sem_wait(&wsem);
        sem_post(&mutex);
        sem_post(&rsem);

        // Reading
        printf("Reader %d is reading: %d\n", id, sharedData);
        usleep(rand() % 1000000);  // Simulate reading

        sem_wait(&mutex);
        readCount--;
        if (readCount == 0)
            sem_post(&wsem);
        sem_post(&mutex);

        usleep(rand() % 1000000);  // Simulate other work
    }

    pthread_exit(NULL);
}

void *writer(void *arg) {
    int id = (intptr_t)arg;
    int i;

    for (i = 0; i < 2; ++i) {
        sem_wait(&wsem);
        sharedData += 10;
        printf("Writer %d is writing: %d\n", id, sharedData);
        sem_post(&wsem);

        usleep(rand() % 1000000);  // Simulate writing
    }

    pthread_exit(NULL);
}
