#include <iostream>
using namespace std;
class set {
    int m,n;
    public:
    void input(void);
    void display(void);
    void largest(void);
};
void set::input(void){
    cout << "Input values of M & N:"
    << endl;
    cin >> m >> n;
}
int set::largest() {
    if (m>n)
        return m; 
    else
         return n;
}
void set::display(void){
    cout << "Largest value= " << largest()<< "\n"
    << endl;
}
int main()
{
    set A;
    A.input();
    A.display();
    return 0;
}