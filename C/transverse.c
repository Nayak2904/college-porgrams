#include<stdio.h>
void main(){
    int i,j;
    int a[5];
    printf("\n Ente the element of an array");
    for ( i = 0; i < 5; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("\n Array elements are:\n");
    for ( i = 0; i < 5; i++)
    {
        printf("\n a[%d]= %d", i, a[i]);
    }
    
    
}