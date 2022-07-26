#include <iostream>
using namespace std;
class student
{
    int roll;
    string name;

public:
    student();
    void display();
};
student::student()
{
    cout << "Enter roll no:";
    cin >> roll;

    cout << "Enter name:";
    cin >> name;
}
void student::display()
{
    cout << "\nDisplaying Data" << endl;
    cout << "Roll:" << roll << endl;
    cout << "Name:" << name << endl;
}
int main()
{
    student s;
    s.display();

    return 0;
}