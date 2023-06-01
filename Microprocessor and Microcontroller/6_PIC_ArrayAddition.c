#include<stdio.h>
#include<xc.h>
//#include<PIC18F4550.h>
int main(void){
unsigned int i, sum=0;
TRISB = 0;
LATB = 0;
unsigned char arr[5] = {1,2,3,4,5};
for(i=0;i<5;i++){
sum +=arr[i];
}
PORTB = sum;
PORTC = i;
PORTD = arr;
return 0;
}
