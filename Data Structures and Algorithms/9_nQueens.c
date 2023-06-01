#include <stdio.h>
#include <math.h>
#include <stdlib.h>
int a[20];

 
void queen (int);

 
int place (int);

 
void print_sol (int);

 
int 
place (int pos) 
{
  
 
int i;
  
 
for (int i = 1; i < pos; i++)
    
 
    {
      
 
if (a[pos] == a[i] || ((abs (a[i] - a[pos]) == abs (i - pos))))
	
 
return 0;
    
 
}
  
 
return 1;

 
}


 
 
void 
print_sol (int n) 
{
  
 
printf ("\n***solution***\n");
  
 
for (int i = 1; i <= n; i++)
    
 
    {
      
 
for (int j = 1; j <= n; j++)
	
 
	{
	  
 
if (a[i] == j)
	    
 
printf ("%d\t", i);
	  
 
	  else
	    
 
printf ("-\t");
	
 
}
      
 
printf ("\n");
    
 
}

 
}


 
 
void 
queen (int n) 
{
  
 
int k = 1;
  
 
a[k] = 0;
  
 
 
while (k != 0)
    
 
    {
      
 
a[k] = a[k] + 1;
      
 
while ((a[k] <= n) && !place (k))
	
 
	{
	  
 
a[k]++;
	
 
}
      
 
if (a[k] <= n)
	
 
	{
	  
 
if (k == n)
	    
 
	    {
	      
 
print_sol (n);
	    
 
}
	  
 
	  else
	    
 
	    {
	      
 
k++;
	      
 
a[k] = 0;
	    
 
}
	
 
}
      
 
      else
	
 
k--;
    
 
}

 
}


 
 
void 
main () 
{
  
 
int n;
  
 
printf ("Enter the number of Queens\n");
  
 
scanf ("%d", &n);
  
 
queen (n);

 
} 
