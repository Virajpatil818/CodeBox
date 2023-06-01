#include <PIC18F4550.h>
void main(void)
{
unsigned int i, j, x;
TRISB=0; // port b as O/P
LATB=0;
i=0x04;
j=0x05;
x=i+j;
PORTB=x;
PORTC=i;
PORTD=j;
}
