#include <stdio.h>
void main()
{
    int LA[] = {1, 3, 5, 7, 8};
    int item = 10, position = 3, n = 5;
    int i = 0, j = n;

    printf("The original array elements are :\n");

    for (i = 0; i < n; i++)
    {
        printf("LA[%d] = %d \n", i, LA[i]);
    }

    n = n + 1;

    while (j >= position)
    {
        LA[j + 1] = LA[j];
        j = j - 1;
    }

    LA[position] = item;

    printf("The array elements after insertion :\n");

    for (i = 0; i < n; i++)
    {
        printf("LA[%d] = %d \n", i, LA[i]);
    }
}