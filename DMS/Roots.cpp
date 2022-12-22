#include <iostream>
#include<math.h>
using namespace std;
int floorSqrt(int a)
{
    // Base cases
    if (a== 0 || a == 1 )
        return a;
 
    // Starting from 1, try all numbers until
    // i*i is greater than or equal to x.
    int i = 1, result = 1;
    while (result <= a) {
        i++;
        result = i * i;
    }
    return i - 1;
}
void sqrt(int a, int b, int c){
    floorSqrt(a);
    floorSqrt(b);
    floorSqrt(c);
}
   

int main()
{
    // string poly = "2x^2+3x+5=0";
    // cout << poly << endl;
    int a = 100, b = 8, c = 11;
    cout << sqrt(a,b,c) << endl;
    
     

    return 0;
}