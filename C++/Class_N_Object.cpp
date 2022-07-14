#include <iostream>
using namespace std;
    class Student{
        public:
        
        string Name;
        int Roll_no;
    };
int main()
{
    Student myObj;

    cout << "Enter student's name: "
    << endl;

    getline(cin,myObj.Name);

    cout << "Enter student's roll no.: "
    << endl;
    cin >> myObj.Roll_no;

    cout << "\n"
    << endl;
    cout << "Student's Data:-"
    << endl;
     cout << "Name: " << myObj.Name
     << endl;

     cout << "Roll no.: " << myObj.Roll_no
     << endl;

    return 0;
}