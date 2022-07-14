#include <iostream>
using namespace std;
class Marks
{
private:
    int mk1, mk2;

public:
    void getdata();
    void displaydata();
};
void Marks::getdata()
{
    cout << "Enter first subject mark:"
         << endl;
    cin >> mk1;
    cout << "Enter second subject mark:"
         << endl;
    cin >> mk2;
}
void Marks::displaydata()
{
    cout << "First subject mark:" << mk1
         << endl;
    cout << "Second subject mark:" << mk2
         << endl;
}
int main()
{
    Marks x;
    x.getdata();
    x.displaydata();
    return 0;
}