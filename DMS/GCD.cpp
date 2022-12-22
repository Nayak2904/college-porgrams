#include <iostream>
using namespace std;

// int hcf(int n1, int n2);
int hcf(int n1, int n2){
    if (n2 != 0)
    {
        return hcf(n2, n1%n2);
    }
    else 
    {
        return n1;
    }
    
}
int main()
{
    int n1,n2;
    cout << "Enter two positive number: " << endl;
    cin >> n1 >> n2;
    cout << "H.C.F of "<< n1 << " & " << n2 << " is:" << hcf(n1, n2) << endl;
    return 0;
}