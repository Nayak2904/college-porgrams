#include <iostream>
using namespace std;
class worker
{
    protected: 
    int age;
    char name[20];

public:
    void get();
    void show();
};
void worker ::get()
{
    cout << "Your name please:" << endl;
    cin >> name;
    cout << "Your age please:" << endl;
    cin >> age;
}
void worker ::show()
{
    cout << "My name is:" << name << endl;
    cout << "My age is:" << age << endl;
}
class manager : protected worker
{
    int now;
    public:
    void get();
    void show();
};
void manager ::get()
{
    cout << "Please enter your name:";
    cin >> name;
    cout << "Please enter your age:";
    cin >> age;
    cout << "Please enter the no. of workers under you:";
    cin >> now;
}
void manager ::show()
{
    cout << "Your name is: " << name << " and age is: " << age;
    cout << "\nNo. of worker under you are:" << now;
}
int main()
{
    manager m1;
    m1.get();
    m1.show();

    return 0;
}