#include <stdio.h>
int
main () 
{
  
int n, t, i;
  
printf ("Enter size of array: ");
  
scanf ("%d", &n);
  
printf ("Enter target: ");
  
scanf ("%d", &t);
  
int A[n], S[n], R[n], NSR[n];
  
printf ("Enter the candidates: ");
  
for (i = 0; i < n; i++)
    
    {
      
scanf ("%d", &A[i]);
    
}
  
int val = 0, s = 0, r = 0, nsr = 0;
  
for (i = 0; i < n; i++)
    
    {
      
if (val + A[i] <= t)
	
	{
	  
val += A[i];
	  
S[s] = A[i];
	  
s++;
	  
if (val == t)
	    
break;
	
}
      
      else
	
	{
	  
R[r] = A[i];
	  
r++;
	
}
    
}
  
for (int j = i + 1; j < n; j++)
    
    {
      
NSR[nsr] = A[j];
      
nsr++;
    
} 
printf ("Selected Candidates: ");
  
 
for (i = 0; i < s; i++)
    
    {
      
printf ("%d ", S[i]);
    
}
  
printf ("\n");
  
printf ("Rejected Candidates: ");
  
for (i = 0; i < r; i++)
    
    {
      
printf ("%d ", R[i]);
    
}
  
printf ("\n");
  
printf ("Neither Selected nor Rejected Candidates: ");
  
for (i = 0; i < nsr; i++)
    
    {
      
printf ("%d ", NSR[i]);
    
}
  
printf ("\n");
  
return 0;

}
