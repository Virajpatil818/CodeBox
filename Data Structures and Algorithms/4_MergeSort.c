#include<stdio.h>

 void Merge_sort (int[], int, int);

void Merge (int[], int, int, int);

void
main () 
{
  
int n;
  
printf ("\nEnter Size of Array :");
  
scanf ("%d", &n);
  
int Array[n];
  
int b = 0;
  
printf ("\nEnter Array :");
  
for (int i = 0; i < n; i++)
    
    {
      
scanf ("%d", &Array[i]);
    
} 
 
Merge_sort (Array, b, n - 1);
  
printf ("Sorted Array :\n");
  
for (int l = 0; l < n; l++)
    
    {
      
if (l != n - 1)
	
printf ("%d,", Array[l]);
      
      else
	
printf ("%d", Array[l]);
    
}
  
printf ("\n");

}


void
Merge_sort (int Array[], int b, int e) 
{
  
int mid;
  
if (b < e)
    
 
    {
      
mid = (b + e) / 2;
      
Merge_sort (Array, b, mid);
      
Merge_sort (Array, mid + 1, e);
      
Merge (Array, b, mid, e);
    
}

}


void
Merge (int Array[], int b, int mid, int e) 
{
  
int i, j, k;
  
int n1 = mid - b + 1;
  
int n2 = e - mid;
  
int left[n1], right[n2];
  
// printf("%d %d\n",n1,n2);
    for (i = 0; i < n1; i++)
    
    {
      
left[i] = Array[b + i];
    
}
  
for (j = 0; j < n2; j++)
    
    {
      
right[j] = Array[mid + 1 + j];
    
}
  
i = 0;
  
j = 0;
  
k = b;
  
while (i < n1 && j < n2)
    
    {
      
if (left[i] > right[j])
	
	{
	  
Array[k] = right[j];
	  
k++;
	  
j++;
	
}
      
      else
	
	{
	  
Array[k] = left[i];
	  
k++;
	  
i++;
	
}
    
 
}
  
while (i < n1)
    
    {
      
Array[k] = left[i];
      
i++;
      
k++;
    
}
  
while (j < n2)
    
    {
      
Array[k] = right[j];
      
j++;
      
k++;
    
}

}
