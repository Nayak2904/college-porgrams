#include <iostream>
using namespace std;
class worker{
    int age;
    char name[10];
    public:
    void get();
    void show();
};
void worker :: get(){
    cout << "Your name:" ;
    cin >> name;
    cout << "Your age:" ;
    cin >> age;
}
void worker::show(){
    cout << "My name is:" << name << " and my age is:" << age;
}
class manager : worker{
    int now;
    public:
    void get();
    void show();

};
void manager ::get(){
    worker::get();
    cout << "\nNumber of worker under you:";
    cin >> now;
}
void manager ::show(){
    worker ::show();
    cout << "\nNo. of worker under me are:" << now ;
}
int main()
{
    worker w1;
    manager m1;
    m1.get();
    m1.show();
    return 0;
}