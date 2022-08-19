#include <iostream>
using namespace std;
class worker{
    int age;
    char name[20];
    public:
    void get();
    void show();
};
void worker ::get(){
    cout << "Your name please: " ;
    cin >> name;
    cout << "Your age please: " ;
    cin >> age;
}
void worker ::show(){
    cout << "My name is " << name << " and my age is " << age ;
}
class manager : public worker {
    int now;
    public:
    void get();
    void show();
};
void manager ::get(){
    worker ::get();
    cout << "No. of worker under you: " ;
    cin >> now;
}
void manager ::show(){
    worker::show();
    cout << "\n no. of workers under me are:" << now ;
}
class ceo : public manager {
    int nom;
    public:
    void get();
    void show();

};
void ceo ::get(){
    manager ::get();
    cout << "\nNo of managers under you are: " ;
    cin >> nom;
}
void ceo::show(){
    manager::show();
    cout << "\nNo of maagers under me are: " << nom ;
    
}
int main()
{
    ceo c1;
    c1.get();
    cout << "\n" << endl;
    c1.show();
    return 0;
}