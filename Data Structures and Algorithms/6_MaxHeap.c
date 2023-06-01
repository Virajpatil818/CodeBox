#include <stdio.h>
int size = 0;

void
swap (int *a, int *b) 
{
  
int temp;
  
temp = *a;
  
*a = *b;
  
*b = temp;

} 
void

heapify (int a[], int size, int i) 
{
  
int max = i;
  
int l = 2 * i + 1;
  
int r = 2 * i + 2;
  
if (l < size && a[max] < a[l])
    
    {
      
max = l;
    
}
  
if (r < size && a[max] < a[r])
    
    {
      
max = r;
    
}
  
if (max != i)
    
    {
      
int temp = a[i];
      
a[i] = a[max];
      
a[max] = temp;
      
// swap(&a[i], &a[max]);
	heapify (a, size, max);
    
}

} 
void

insert (int d, int a[]) 
{
  
if (size == 0)
    
    {
      
 
a[size++] = d;
    
}
  
  else
    
    {
      
a[size++] = d;
      
for (int i = (size / 2) - 1; i >= 0; i--)
	
	{
	  
heapify (a, size, i);

} 
} 
} 
void

heap_Sort (int a[], int size) 
{
  
int i;
  
for (i = size - 1; i >= 0; i--)
    
    {
      
int temp = a[0];
      
a[0] = a[i];
      
a[i] = temp;
      
// wap(&a[0],&a[i]);
	heapify (a, i, 0);
      
// for(int j = 0;j<size;j++){
// printf("%d",a[j]);
// }
// printf("\n");
} 
} 
void

main () 
{
  
int a[10];
  
insert (3, a);
  
insert (4, a);
  
insert (5, a);
  
insert (2, a);
  
insert (7, a);
  
// for(int i=0;i<size;i++)
// {
// printf("%d ",a[i]);
// }
    printf ("\n");
  
heap_Sort (a, size);
  
printf ("Sorted Array : \n");
  
 
for (int i = 0; i < size; i++)
    
    {
      
printf ("%d", a[i]);
      
printf ("\n");

} 
}
