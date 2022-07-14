#include<stdio.h>
void main(){
     int i,j;
    int a[5];
    printf("\n Enter the element of an array:\n");
    for ( i = 0; i < 5; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("\n This element has:\n");
    for ( i = 0; i < 5; i++)
    {
            if (a[i] == 3)
            {
                printf("%d", a[i]);
                break;
            }
            
            
            
    }
    
    
}