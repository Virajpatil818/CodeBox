#include <stdio.h>
#include <math.h>
#include <stdlib.h>

#define MAX_QUEENS 20

int positions[MAX_QUEENS];

// Function prototypes
void placeQueens(int);
int isValidPosition(int);
void printSolution(int);

// Check if placing a queen at a given position is valid
int isValidPosition(int pos)
{
    for (int i = 1; i < pos; i++)
    {
        // Check if there is a conflict with previously placed queens
        if (positions[pos] == positions[i] || abs(positions[i] - positions[pos]) == abs(i - pos))
            return 0; // Invalid position
    }

    return 1; // Valid position
}

// Print the solution (chessboard with queens placed)
void printSolution(int n)
{
    printf("\n*** Solution ***\n");

    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= n; j++)
        {
            if (positions[i] == j)
                printf("Q\t"); // Queen is placed at this position
            else
                printf("-\t"); // Empty position
        }
        printf("\n");
    }
}

// Recursive function to find and print all solutions for the N-Queens problem
void placeQueens(int n)
{
    int queenIndex = 1;
    positions[queenIndex] = 0;

    while (queenIndex != 0)
    {
        positions[queenIndex] = positions[queenIndex] + 1;

        while ((positions[queenIndex] <= n) && !isValidPosition(queenIndex))
        {
            positions[queenIndex]++;
        }

        if (positions[queenIndex] <= n)
        {
            if (queenIndex == n)
            {
                printSolution(n);
            }
            else
            {
                queenIndex++;
                positions[queenIndex] = 0;
            }
        }
        else
        {
            queenIndex--;
        }
    }
}

int main()
{
    int numQueens;

    printf("Enter the number of Queens: ");
    scanf("%d", &numQueens);

    placeQueens(numQueens);

    return 0;
}
