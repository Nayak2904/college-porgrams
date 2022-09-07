// C++ program to demonstrate
// the use of rand()
#include <cstdlib>
#include <iostream>
using namespace std;

int randNum(){

    int num =  rand();
    return num;
}

int main()
{
    cout <<randNum();

     
    return 0;
}
