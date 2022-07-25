#include <iostream>
using namespace std;
class student
{
    int rno;
    string name;

public:
    student()
    {
        cout << "Enter roll no.:" << endl;
        cin >> rno;
        cout << "Enter name:" << endl;
        cin >> name;
    }
    void display()
    {
        cout << "\n"
             << endl;
        cout << "Diaplaying Data" << endl;
        cout << "\n"
             << endl;
        cout << "Roll:" << rno << endl;
        cout << "Name:" << name << endl;
    }
};
int main()
{
    student s;
    s.display();
    return 0;
}