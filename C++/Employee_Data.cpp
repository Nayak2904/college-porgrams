#include <iostream>
using namespace std;
class Employee
{
private:
    string Name;
    int age;
    int salary;

public:
    void getdata();
    void putdata();
};
void Employee::putdata()
{
    cout << "Enter employee's name:"
         << endl;
    cin >> Name;
    cout << "Enter age:"
         << endl;
    cin >> age;
    cout << "Enter salary:"
         << endl;
    cin >> salary;
}
void Employee::getdata()
{
    cout << "\n"
         << endl;
    cout << "Employee's Data:-"
         << endl;

    cout << "Name:" << Name << endl;
    cout << "age.:" << age << endl;
    cout << "Salary:" << salary << endl;
}
int main()
{
    Employee myObj[2];

    for (int i = 0; i < 2; i++)
    {
        myObj[i].putdata();
    }

    for (int i = 0; i < 2; i++)
    {
        myObj[i].getdata();
    }
    return 0;
}