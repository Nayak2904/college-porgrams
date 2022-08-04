#include <iostream>
#include <string.h>
using namespace std;

int main(){
 char ch[] = "Rajendra University\n\0"; 
 int l = strlen(ch);
 cout << l << endl;

 return 0;
}
