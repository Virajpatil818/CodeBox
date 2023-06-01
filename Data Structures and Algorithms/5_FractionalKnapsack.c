#include <stdio.h>
int n, capacity;

float basedonProfit (float[], float[], float[]);

float basedonWeight (float[], float[], float[]);

float basedonpiwi (float[], float[], float[]);

void
main () 
{
  
printf ("Enter Objects :");
  
scanf ("%d", &n);
  
float p[10], w[10], x[10];
  
printf ("Enter Profits :");
  
for (int i = 0; i < n; i++)
    
    {
      
scanf ("%f", &p[i]);
    
} 
printf ("Enter Weights :");
  
for (int i = 0; i < n; i++)
    
    {
      
scanf ("%f", &w[i]);
  
} 
for (int i = 0; i < n; i++)
    
    {
      
x[i] = 0;
    
} 
printf ("Enter Capacity :");
  
scanf ("%d", &capacity);
  
float tp = basedonProfit (p, w, x);
  
printf ("Based on Profit %.2f", tp);
  
printf ("\n");
  
float tpw = basedonWeight (p, w, x);
  
printf ("Based on Weight%.2f", tpw);
  
printf ("\n");
  
float tppiwi = basedonpiwi (p, w, x);
  
 
printf ("Based on Pi/Wi %.2f", tppiwi);

} 
float

basedonProfit (float p[], float w[], float x[]) 
{
  
float temp;
  
for (int i = 0; i < n; i++)
    
    {
      
for (int j = 0; j < n; j++)
	
	{
	  
if (p[j] < p[j + 1])
	    
	    {
	      
temp = p[j];
	      
p[j] = p[j + 1];
	      
p[j + 1] = temp;
	      
temp = w[j];
	      
w[j] = w[j + 1];
	      
w[j + 1] = temp;
	    
}
	
}
    
}
  
// for (int i = 0; i < n; i++)
// {
// printf("%f\n",p[i]);
// }
  float tp = 0, W = 0;
  
for (int i = 0; i < n; i++)
    
    {
      
if (W + w[i] <= capacity)
	
	{
	  
x[i] = 1;
	  
W = W + w[i];
	
}
      
      else
	
	{
	  
x[i] = (capacity - W) / w[i];
	  
break;
	
}
    
}
  
for (int i = 0; i < n; i++)
    
 
    {
      
tp = tp + p[i] * x[i];
    
} 
return tp;

}


float
basedonWeight (float p[], float w[], float x[]) 
{
  
float temp = 0;
  
for (int i = 0; i < n; i++)
    
    {
      
for (int j = 0; j < n - 1; j++)
	
	{
	  
if (w[j] > w[j + 1])
	    
	    {
	      
temp = p[j];
	      
p[j] = p[j + 1];
	      
p[j + 1] = temp;
	      
temp = w[j];
	      
w[j] = w[j + 1];
	      
w[j + 1] = temp;
	    
}
	
}
    
}
  
// for (int i = 0; i < n; i++)
// {
// printf("%f\n",p[i]);
// }
  float tp = 0, W = 0;
  
for (int i = 0; i < n; i++)
    
    {
      
if (W + w[i] <= capacity)
	
	{
	  
x[i] = 1;
	  
W = W + w[i];
	
}
      
      else
	
	{
	  
x[i] = (capacity - W) / w[i];
	  
break;
	
 
}
    
}
  
for (int i = 0; i < n; i++)
    
    {
      
tp = tp + p[i] * x[i];
    
} 
return tp;

}


float
basedonpiwi (float p[], float w[], float x[]) 
{
  
float piwi[10];
  
for (int i = 0; i < n; i++)
    
    {
      
piwi[i] = p[i] / w[i];
    
} 
float temp = 0;
  
for (int i = 0; i < n; i++)
    
    {
      
for (int j = 0; j < n - 1; j++)
	
	{
	  
if (piwi[j] < piwi[j + 1])
	    
	    {
	      
temp = piwi[j];
	      
piwi[j] = piwi[j + 1];
	      
piwi[j + 1] = temp;
	      
temp = p[j];
	      
p[j] = p[j + 1];
	      
p[j + 1] = temp;
	      
temp = w[j];
	      
w[j] = w[j + 1];
	      
w[j + 1] = temp;
	    
}
	
}
    
}
  
// for (int i = 0; i < n; i++)
// {
// printf("%f\n",p[i]);
// }
  
float tp = 0, W = 0;
  
for (int i = 0; i < n; i++)
    
    {
      
if (W + w[i] <= capacity)
	
	{
	  
x[i] = 1;
	  
W = W + w[i];
	
}
      
      else
	
	{
	  
x[i] = (capacity - W) / w[i];
	  
break;
	
}
    
}
  
for (int i = 0; i < n; i++)
    
    {
      
tp = tp + p[i] * x[i];
    
} 
return tp;

}
