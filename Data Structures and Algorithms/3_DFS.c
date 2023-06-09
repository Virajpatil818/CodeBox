#include <stdio.h>
#define n 3
int a[n][n];
int visited[n];
int stack[20];
int top=-1;

void DFS(int v){
    visited[v]=1;
    
   for(int i=0;i<n;i++){ 
    if(a[v][i]==1 && !visited[i]){
        top++;
        stack[top]=i;
        DFS(i);
        break;
       }
    }
     while(top!=-1){
         for(int i=0;i<n;i++){
             if(a[stack[top]][i]==1 && !visited[i]){
                
                 DFS(i);
             }
             else{
                 pop();
             }
         }
     }
        printf("%d ",v);
}

void pop(){
    top--;
}
void  main()
{
    int v;
    printf("Enter the graph\n");
    
    for(int i=0;i<n;i++){
        
        for(int j=0;j<n;j++){
            scanf("%d",&a[i][j]);
        }
    }
    for(int i=0;i<n;i++){
        visited[i]=0;
    }
    printf("Enter the starting vertex of graph\n");
    scanf("%d",&v);
    printf("The DFS Traversal is :-\n");
    top++;
    stack[top]=v;
    DFS(v);
}


