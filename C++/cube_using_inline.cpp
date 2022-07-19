#include <iostream>
using namespace std;
inline int cube(int s)
{
    return s * s * s;
}
int main()
{
    int num;
    cout << "Enter any number: "
         << endl;
    cin >> num;
    cout << "Cube of " << num << " is " << cube(num)
         << endl;
    return 0;
}