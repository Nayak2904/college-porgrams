#include <iostream>
using namespace std;

class demo
{
    int num;

public:
    demo()
    {
        num = 0;
    }

    int operator++() // For Increment.
    {
        return num += 5;
    }
    int operator--() // For Decrement.
    {
        return num -= 5;
    }

    void display()
    {
        cout << "num = " << num << endl;
    }
};

int main()
{
    demo ob;
    int arr[5];

    // Increment.
    for (int i = 0; i < 5; i++)
    {
        arr[i] = ++ob;
    }

    cout << "displaying Auto Generated Increasing Array:" << endl;

    for (int i = 0; i < 5; i++)
    {
        cout << arr[i] << " ";
    }

    // Decrement
    for (int i = 0; i < 5; i++)
    {
        arr[i] = --ob;
    }

    cout << "\ndisplaying Auto Generated Decreasing Array:" << endl;

    for (int i = 0; i < 5; i++)
    {
        cout << arr[i] << " ";
    }

    // demo ob(5);
    // ob.display();

    // ++ob;
    // ob.display();

    return 0;
}