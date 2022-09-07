#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int randomNum()
{
    int num = rand() % 101;
    return num;
}

void swap(int *xp, int *yp)
{
    int temp = *xp;
    *xp = *yp;
    *yp = temp;
}

int main()
{
    int arr[10];

    for (int i = 0; i < 10; i++)
    {
        arr[i] = randomNum();
    }

    printf("AI generated Random Array: \n");

    for (int j = 0; j < 10; j++)
    {
        printf("%d ", arr[j]);
    }

    int min;

    printf("\nSorting the array in Ascending order: \n");

    for (int k = 0; k < sizeof arr / sizeof arr[0]; k++)
    {
        min = k;
        for (int l = 0; l < sizeof arr / sizeof arr[0]; l++)
        {
            if (arr[k] < arr[l])
            {
                min = l;
            }
           
        }
        swap(&arr[min], &arr[k]);
    }

    for (int m = 0; m < 10; m++)
    {
        printf("%d ", arr[m]);
    }

    return 0;
}