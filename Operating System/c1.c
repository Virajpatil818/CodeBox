#include <stdio.h>
#include <stdlib.h>
#include <errno.h>
#include <string.h>
#include <fcntl.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>

#define FIFO_NAME1 "comm_pipe1"
#define FIFO_NAME2 "comm_pipe2"

int main(){
    char s1[300],s2[300];
    int num,fd1,fd2,byt;
    mknod(FIFO_NAME1, S_IFIFO | 0666, 0);
    mknod(FIFO_NAME2, S_IFIFO | 0666, 0);

    printf("Waiting for consumer ......\n");
    fd1 = open(FIFO_NAME1, O_WRONLY);
    fd2 = open(FIFO_NAME2, O_RDONLY);

    printf("Got a consumer -- type some stuff\n");
    gets(s1);

    if((num = write(fd1,s1,strlen(s1)))==-1){
        perror("Write");
    }else{
        printf("Speak : wrote %d bytes tp file \n",num);
        byt = read(fd2,s2,300);
        s2[byt]='\0';
        printf("%s\n",s2);
    }

    close(fd1);
    close(fd2);
    return 0;
}
