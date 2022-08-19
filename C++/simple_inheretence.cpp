#include <iostream>
using namespace std;
class school
{
public:
    void classs()
    {
        cout << "5th class" << endl;
    }
    void section()
    {
        cout << "B" << endl;
    }
};
class Student : public school
{
public:
    void name()
    {
        cout << "Shivajee" << endl;
    }
};
int main()
{
    Student s1;
    s1.classs();
    s1.section();
    s1.name();

    return 0;
}