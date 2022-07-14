// program to display 10 employees info(name, dep. salary,add)
#include <iostream>
using namespace std;
class Employee
{
public:
    string name, department, address;
    int salary;
};
int main()
{

    Employee oB[2];
    for (int i = 0; i < 2; i++)
    {

        cout << "Enter Empolyee's name:"
             << endl;
        cin >> oB[i].name;
        cout << "Department name:"
             << endl;
        cin >> oB[i].department;

        cout << "Enter salary:"
             << endl;
        cin >> oB[i].salary;

        cout << "Enter address:"
             << endl;
        cin >> oB[i].address;
        cout << "\n"
             << endl;
    }
    cout << "\n"
         << endl;
    cout << "Employee's Data:-"
         << endl;
    for (int i = 0; i < 2; i++)
    {

        cout << "Name:" << oB[i].name
             << endl;
        cout << "Dept.:" << oB[i].department
             << endl;
        cout << "Salary:" << oB[i].salary
             << endl;
        cout << "Address:" << oB[i].address
             << endl;
        cout << "\n"
             << endl;
    }

    return 0;
}