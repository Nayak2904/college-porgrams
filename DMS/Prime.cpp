#include <iostream>
using namespace std;

int main()
{
    int n;
    bool is_prime = true;
    cout << "Enter a positive number: " << endl;
    cin >> n;
    //0 and 1 are not prime numbers.
    if (n == 0 || n == 1)
    {
        is_prime = false;
    }
    // Loop to check if n is prime or not
    for (int i = 2; i <= n/2; ++i)
    {
        if (n%i == 0)
        {
            is_prime = false;
            break;
        }
        
    }
    if (is_prime)
    cout << n << " is a prime number." << endl;
    else
    cout << n << " is not a prime number." << endl;
    
    return 0;
}