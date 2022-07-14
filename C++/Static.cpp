#include <iostream>
using namespace std;
class item
{
    static int count; // count is static
    int number;

public:
    void getdata()
    {
        // number = a;
        count++;
    }
    void get_count(void)
    {
        cout << "count :";
        cout << count << endl;
    }
};
int item ::count; // count defined
int main()
{
    item a, b, c;
    a.getdata();
    a.getdata();
    a.getdata();
    a.get_count();
    b.get_count();
    c.get_count();
    a.getdata();
    a.get_count();
    b.getdata();
    b.get_count();
    c.getdata();
    c.get_count();

    return (0);
}