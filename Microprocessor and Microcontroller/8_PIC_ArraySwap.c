#include<PIC18F4550.h>
#include<stdio.h>
void main(){
int array[5]={1,2,3,4,5};
int array2[5]={6,7,8,9,10};
for(int i=0;i<5;i++) {
int temp=array[i];
array[i]=array2[i];
array2[i]=temp;
}
}
