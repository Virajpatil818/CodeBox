#include <stdio.h>
#include <stdlib.h>
#define infi 9999
struct edge 
{
  

int u;
   

int v;
   

int w;
 

};

 
struct graph 
{
  

int vert;
   

int edge;
   

struct edge *ed;
 

};

 
void 
display (int arr[], int size) 
{
  
 
int i;
  
 
for (i = 0; i < size; i++)
    
 
    {
      
 
printf ("%d ", arr[i]);
    
 
}
  
 
printf ("\n");

 
}


 
 
void 
ballamanford (struct graph *g, int source) 
{
  
 
int i, j, u, v, w, vertex, edge;
  
 
vertex = g->vert;
  
 
edge = g->edge;
  
 
int distance[vertex];
  
 
for (i = 0; i < vertex; i++)
    
 
    {
      
 
distance[i] = infi;
    
 
}
  
 
 
distance[source] = 0;
  
 
for (i = 0; i <= (vertex - 1); i++)
    
 
    {
      
 
for (j = 0; j < edge; j++)
	
 
	{
	  
 
u = g->ed[j].u;
	  
 
v = g->ed[j].v;
	  
 
w = g->ed[j].w;
	  
 
if (distance[v] > distance[u] + w)
	    
 
	    {
	      
 
distance[v] = distance[u] + w;
	    
 
}
	
 
}
    
 
}
  
 
printf ("Distance array: ");
  
 
display (distance, vertex);

 
}


 
 
int 
main () 
{
  
 
int i, source;
  
 
struct graph *g = (struct graph *) malloc (sizeof (struct graph));
  
 
g->edge = 9;
  
 
g->vert = 5;
  
 
g->ed = (struct edge *) malloc (g->edge * sizeof (struct edge));
  
 
for (int j = 0; j < (g->edge); j++)
    
 
    {
      
 
printf ("Enter data for %d row\n", j);
      
 
scanf ("%d", &g->ed[j].u);
      
 
scanf ("%d", &g->ed[j].v);
      
 
scanf ("%d", &g->ed[j].w);
    
 
} 
printf ("Enter Source Vertex : ");
  
 
scanf ("%d", &source);
  
 
 
ballamanford (g, source);
  
 
return 0;

 
}


