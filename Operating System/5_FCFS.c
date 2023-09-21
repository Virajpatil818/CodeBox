#include <stdio.h>

struct process{
    int process_id;
    int arrival_time;
    int burst_time;
};

void calculateAverageTime(struct process pProcess[], int n);

int main(){
    int n;
    printf("Enter number of processes  :");
    scanf("%d",&n);

    struct process processes[n];

    for(int i=0;i<n;i++){
        processes[i].process_id=i+1;
        printf("Enter arrival time of process %d :",i+1);
        scanf("%d",&processes[i].arrival_time);
        printf("Enter burst time of process %d :",i+1);
        scanf("%d",&processes[i].burst_time);
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-i-1; j++) {
            if(processes[j].arrival_time>processes[j+1].arrival_time){
                struct process temp = processes[j];
                processes[j]=processes[j+1];
                processes[j+1]=temp;
            }
        }
    }

    calculateAverageTime(processes,n);
}

void calculateCompletionTime(struct process processes[],int n,int completion_time[]){
    completion_time[0]=processes[0].burst_time;
    for (int i = 1; i < n; i++) {
        completion_time[i]=completion_time[i-1]+processes[i].burst_time;
    }
}

void calculateTurnAroundTime(struct process processes[],int n,int turnaround_time[],const int completion_time[]){
    for (int i = 0; i < n; i++) {
        turnaround_time[i]=completion_time[i]-processes[i].arrival_time;
    }
}

void calculateWaitingTime(struct process processes[],int n,int waiting_time[],const int turnaround_time[]){
    for (int i = 0; i < n; i++) {
        waiting_time[i]=turnaround_time[i]-processes[i].burst_time;
    }
}



void calculateAverageTime(struct process processes[], int n) {
    int waiting_time[n];
    int turnaround_time[n];
    int completion_time[n];

    calculateCompletionTime(processes,n,completion_time);
    calculateTurnAroundTime(processes,n,turnaround_time,completion_time);
    calculateWaitingTime(processes,n,waiting_time,turnaround_time);


    int total_waiting_time=0,total_turnaround_time=0;
    for (int i = 0; i < n; i++) {
        total_waiting_time += waiting_time[i];
        total_turnaround_time += turnaround_time[i];
    }

    float avg_waiting_time = (float)total_waiting_time /n;
    float avg_turnaround_time = (float)total_turnaround_time /n;

    printf("Process\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n",processes[i].process_id,processes[i].arrival_time,processes[i].burst_time,waiting_time[i],turnaround_time[i]);
    }

    printf("Average Waiting Time : %.2f\n",avg_waiting_time);
    printf("Average Turnaround Time : %.2f\n",avg_turnaround_time);
}
