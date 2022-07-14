#include<iostream>
using namespace std;
int main(){
    int a,b,c,d,e,sum,avg;
    cout<< "Enter any five numbers\n";
    cin>> a>> b>> c>> d>> e;
    sum= a+b+c+d+e;
    avg= sum/5;
    cout<< "sum is= "<<sum<<"\n";
    cout<< "average is= "<<avg;
    return 0;
}
