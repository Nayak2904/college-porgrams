#include <iostream>
using namespace std;
class base
{
protected:
    int age;
    char name[30];
};
class derived : public base
{
protected:
    int height;
    int weight;

public:
    void get()
    {
        cout << "Enter name:" << endl;
        cin >> name;
        cout << "Enter age" << endl;
        cin >> age;
        cout << "Enter height and weight:" << endl;
        cin >> height >> weight;
    }
    void show()
    {
        cout << "\nStudent's DATA:\n"
             << endl;
        cout << "Name:" << name << endl;

        cout << "Age" << age << endl;

        cout << "Height and Weight:" << height << weight << endl;
    }
};
int main()
{
    derived ob;
    ob.get();
    ob.show();
    return 0;
}