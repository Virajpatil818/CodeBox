#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <limits.h>

#define MAX_PROCESSES 100

struct process{
    int process_id;
    int arrival_time;
    int burst_time;
    int remaining_time;
};

void shortest_job_first(struct process processes[], int n);

int main(){
    int n;
    printf("Enter the number of processes :");
    scanf("%d",&n);

    struct process processes[n];

    for (int i=0;i<n;i++){
        processes[i].process_id=i+1;
        printf("Enter Arrival time of Process %d :",i+1);
        scanf("%d",&processes[i].arrival_time);
        printf("Enter Burst time of Process %d :",i+1);
        scanf("%d",&processes[i].burst_time);
        processes[i].remaining_time = processes[i].burst_time;
    }

   shortest_job_first(processes,n);

    return 0;
}

void shortest_job_first(struct process processes[], int n) {
    int time = 0;
    int completed = 0;
    int completion_time[n];
    int turnaround_time[n];
    int waiting_time[n];

    while(completed <n){
        int minimum_bt = INT_MAX;
        int selected_process = -1;

        for(int i=0;i<n;i++){
            if(processes[i].arrival_time<=time && processes[i].remaining_time < minimum_bt && processes[i].remaining_time>0){
                minimum_bt = processes[i].remaining_time;
                selected_process = i;
            }
        }

        if(selected_process ==-1){
            time++;
        }else{
            processes[selected_process].remaining_time--;
            time++;

            if(processes[selected_process].remaining_time == 0){
                completed++;
                completion_time[selected_process] = time;
                turnaround_time[selected_process] = completion_time[selected_process] - processes[selected_process].arrival_time;
                waiting_time[selected_process] = turnaround_time[selected_process] - processes[selected_process].burst_time;
            }
        }
    }

    int total_turnaround_time = 0;
    int total_waiting_time = 0;

    for(int i=0;i<n;i++){
        total_turnaround_time += turnaround_time[i];
        total_waiting_time += waiting_time[i];
    }

    float average_turnaround_time = (float)total_turnaround_time /n;
    float average_waiting_time = (float)total_waiting_time /n;

    printf("Process\tArrival Time\tBurst Time\tTurnaround Time\tWaiting Time\n");
    for(int i=0;i<n;i++){
        printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n",processes[i].process_id,processes[i].arrival_time,processes[i].burst_time,turnaround_time[i],waiting_time[i]);
    }

    printf("Average Turnaround Time : %.2f\n",average_turnaround_time);
    printf("Average Waiting Time : %.2f",average_waiting_time);
}
