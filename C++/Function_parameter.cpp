#include <iostream>
using namespace std;
    int Multiply(int n1, int n2){
        return n1*n2;
    }
    double Multiply(){
        double n3, n4;
        cin >> n3 >> n4;
        cout << n3 << " multiplied by " << n4 << " is "
        << endl;
        return n3*n4;
    }
int main()
{
    int num1, num2;
    cout << "Enter two integer to multiply:"
    << endl;
    cin >> num1 >> num2;
    cout << num1 << " multiplied by " << num2 << " is " << Multiply(num1, num2)
    << endl;

    cout << "Enter two decimal number: " 
    << endl;
    cout << Multiply()
    << endl;

    return 0;
}