#include <stdio.h>
void display(int arr[], int n){
    for (int i = 0; i < n; i++)
    {
        printf("%d\n", arr[i]);
    }
    
}
void insert(int arr[], int size, int element, int index){
    for (int i = size -1 ; i >= index; i--){
        arr[i+1] = arr[i];
    }
    arr[index] = element;
}
int main()
{
    int arr[] = {0,1,2,3,4,5,6,7,8,9};
    int size = sizeof(arr)/sizeof(int);
    int element = 20;
    int index = 2;
    printf("Before insertion:\n");
    display(arr , size); 
    printf("\nAfter insertion:\n");
    insert(arr, size,element,index);
    size += 1;
    display(arr , size); 
    
    return 0;
}