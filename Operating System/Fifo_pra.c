#include <stdio.h>
#include <stdlib.h>14

int main()
{
   int input[100];
   int pages, frame_size, i;
   int present;
   int page_fault = 0, page_hit = 0;
   double fault_freq, hit_ratio;

   printf("Enter the total number of pages: ");
   scanf("%d", &pages);

   printf("Enter the frame size: ");
   scanf("%d", &frame_size);

   int queue[frame_size];
   int f = 0;

   printf("Enter the input string:\n");
   for (i = 0; i < pages; i++)
       scanf("%d", &input[i]);

   for (i = 0; i < frame_size; i++)
       queue[i] = 999;

   printf("\n");

   for (i = 0; i < pages; i++)
   {
       present = 0;

       for (int j = 0; j < frame_size; j++)
       {
           if (input[i] == queue[j])
           {
               present = 1;
               page_hit++;
           }
       }

       if (present == 0)
       {
           queue[f % frame_size] = input[i];
           f++;
           page_fault++;
       }

       for (int j = 0; j < frame_size; j++)
           printf("%d ", queue[j]);

       printf("\n");
   }

   printf("\nNumber of Page Faults = %d", page_fault);
   printf("\nNumber of Page Hits = %d", page_hit);

   fault_freq = ((double)page_fault / pages) * 100;
   hit_ratio = ((double)page_hit / pages) * 100;

   printf("\nFault Frequency = %lf", fault_freq);
   printf("\nHit Ratio = %lf", hit_ratio);
   
   return 0;
}
