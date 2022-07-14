#include <iostream>
using namespace std;
class Student
{
public:
     string Name;
     int Roll_no;
};
int main()
{
     Student myObj[3];

     for (int i = 0; i < 3; i++)
     {
          cout << "Enter student's name:"
               << endl;
          cin >> myObj[i].Name;
          cout << "Enter roll no.:"
               << endl;
          cin >> myObj[i].Roll_no;
     }

     cout << "\n"
          << endl;
     cout << "Student's Data"
          << endl;

     for (int i = 0; i < 3; i++)
     {
          cout << "Name:" << myObj[i].Name
               << endl;

          cout << "Roll_no.:" << myObj[i].Roll_no
               << endl;
     }

     return 0;
}