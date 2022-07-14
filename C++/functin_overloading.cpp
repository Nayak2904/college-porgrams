#include <iostream>
using namespace std;
    int plusFunc(int x, int y) {
  return x + y;
}

double plusFunc(double x, double y) {
  return x + y;
}
int main()
{
    int num1, num2;
    double num3, num4;
    cout << "Enter two integer:"
    << endl;
    cin >> num1 >> num2;
    cout << "sum of " << num1 << " + " << num2 << " is " << plusFunc(num1,num2)
    << endl;
    
    cout << "Enter two decimal number:"
    << endl;
    cin >> num3 >> num4;
    cout << "Sum of " << num3 << " + " << num4 << " is " << plusFunc(num3,num4)
    << endl;
    return 0;
}