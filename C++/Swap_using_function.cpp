#include <iostream>
using namespace std;
    void swap(int, int);

int main()
{
    int a,b;
    cout << "Enter the two number to swap"
    << endl;
    cin >> a >> b;

    cout << "After swapping of two numbers:"
    << endl;
    swap(a,b);
    return 0;
}
void swap(int x, int y){
    int z;
    z = x;
    x = y;
    y = z;

    cout << " " <<x << " " <<y
    << endl;
}