#include <iostream>
using namespace std;
    class Employee{
        private:
        string Name;
        int age;
        int salary;

        public:
        void getdata();
        void putdata();
        
    };
    void Employee::getdata(){
        cout << "Enter employee's name:"
        << endl;
        cin >> myObj[i].Name;
        cout << "Enter salary:"
        << endl;
        cin >> myObj[i].salary;
        cout << "Enter age:"
        << endl;
        cin >> myObj[i].age;

    }
    void Employee::putdata(){

        cout << "Name:" << endl;
        cout << "Salary:" << endl;
        cout << "age.:" << endl;
    }
 int main(){
     Employee myObj[3];

     for (int i = 0; i < 3; i++)
     {
            myObj->getdata();
     }

     

     for (int i = 0; i < 3; i++)
     {
            myObj->putdata();
     }
     
     return 0;
 }