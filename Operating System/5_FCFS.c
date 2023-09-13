#include<stdio.h>

struct process {
	int processID;
	int ArrivalTime;
	int BurstTime;
	int CompletionTime;
	int TurnaroundTime;
	int WaitingTime;
};

void main(){

  int n;
  printf("Enter number of processes : ");
  scanf("%d",&n);

  struct process processes[n];

  for(int i=0;i<n;i++){
	  processes[i].processID = i+1;
	  printf("Enter Arrival Time of Process %d :",(i+1));
	  scanf("%d",&processes[i].ArrivalTime);
	  printf("Enter Burst Time of Process %d :",(i+1));
	  scanf("%d",&processes[i].BurstTime);
  }

  printf("\n");

  for(int i=0;i<n;i++){
	  printf("Process ID : %d  ",processes[i].processID);
	  printf("Arrival Time : %d  ",processes[i].ArrivalTime);
	  printf("Burst Time : %d  ",processes[i].BurstTime);
	  printf("\n");
  }
	

 
  struct process temp;
   for (int i = 0; i <n; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (processes[j].ArrivalTime > processes[j + 1].ArrivalTime) {
                temp=processes[j];
                processes[j]=processes[j+1];
                processes[j+1]=temp;
               
            }
        }

    }


  int currentTime = 0;
   printf("\nProcess Execution Order: ");
    for (int i = 0; i < n; i++) {
        if (processes[i].ArrivalTime > currentTime) {
            currentTime = processes[i].ArrivalTime;
        }
        printf("P%d ", processes[i].processID);
        currentTime += processes[i].BurstTime;
    }
                    
    printf("%d",currentTime);

    processes[0].CompletionTime = processes[0].TurnaroundTime;

    for(int i=1;i<n;i++){
	    processes[i].CompletionTime = processes[i-1].CompletionTime-processes[i].BurstTime;
    }

    int sumTT = 0;
    int sumWT = 0;

    for(int i=0;i<n;i++){
	    processes[i].TurnaroundTime = processes[i].CompletionTime-processes[i].ArrivalTime;
	    processes[i].WaitingTime = processes[i].TurnaroundTime-processes[i].BurstTime;
            sumTT += processes[i].TurnaroundTime;
	    sumWT += processes[i].WaitingTime;
    }

    printf("Average Turn Around Time : %d",sumTT/n);
    printf("Average Waiting Time : %d",sumWT/n);

}
