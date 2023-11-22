#include <stdio.h>
#include <stdlib.h>

int isPageInFrame(int page, int frame[], int frameSize) {
   for (int i = 0; i < frameSize; i++) {
       if (frame[i] == page) {
           return 1;
       }
   }
   return 0;
}

void printFrame(int frame[], int frameSize) {
   for (int i = 0; i < frameSize; i++) {
       printf("%d\t\t", frame[i]);
   }
}

int main() {
   int pageSequence[100];
   int totalPages, frameSize;

   printf("Enter the total number of pages: ");
   scanf("%d", &totalPages);

   printf("Enter the frame size: ");
   scanf("%d", &frameSize);
  
   int frame[frameSize];
   int frameIndex = 0;
   int pageFaults = 0;

   printf("Enter the page sequence:\n");
   for (int i = 0; i < totalPages; i++) {
       scanf("%d", &pageSequence[i]);
   }

   printf("\nPage\t Frame1 \t Frame2 \t Frame3\n");

   for (int i = 0; i < totalPages; i++) {
       printf("%d:\t\t", pageSequence[i]);

       if (!isPageInFrame(pageSequence[i], frame, frameSize)) {
           if (frameIndex < frameSize) {
               frame[frameIndex] = pageSequence[i];
               frameIndex++;
           } else{
               int oldestPageIndex = 0;
               for (int j = 1; j < frameSize; j++) {
                   if (frame[j] == frame[oldestPageIndex]) {
                       oldestPageIndex = j;
                   }
               }
               frame[oldestPageIndex] = pageSequence[i];
           }
           pageFaults++;
       }
       printFrame(frame, frameSize);
       printf("\n");
   }
   printf("\nNumber of Page Faults = %d\n", pageFaults);
   return 0;
}
