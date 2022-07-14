#include<iostream>
using namespace std;
int main(){
    int a,b,quo,rem;
    cout<< "Enter any two integer value: ";

    cin>> a>>b;

    quo=a/b;
    rem=a%b; 

    cout<< "Quotient is= "<<quo <<endl;
    cout<< "Reminder is= "<<rem;
    return 0;
}