#include <stdio.h>
#include <math.h>

int random_num()
{
    int num = (rand() % (50 - 0 + 1)) + 0;

    return num;
};
int main()
{

   printf("random num: ",random_num());
   printf("random num: ",random_num());
   printf("random num: ",random_num());
   printf("random num: ",random_num());
   printf("random num: ",random_num());
   printf("random num: ",random_num());
   printf("random num: ",random_num());
   printf("random num: ",random_num());
   printf("random num: ",random_num());
    return 0;
}