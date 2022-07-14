#include <iostream>
using namespace std;

int main()
{
    int n, n1, rev=0, rem;
    cout << "Enter a positive number:\n"
    << endl;
    cin >> n;
    n1=n;
    while (n != 0)
    {
        rem = n%10;
        rev = rev *10 + rem;
        n = n/10;
    }
    cout << " The reverse of the number is: " << rev << endl;
    if (n1 == n)
    {
        cout << "It is a palindrome number\n"
        << endl;
    }
    else
    {
        cout << "it is not a palindrome number"
        << endl;
    }
  
    
    return 0;
}