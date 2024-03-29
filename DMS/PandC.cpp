#include <iostream>
using namespace std;
int findFact(int n){
    return n==1 ? 1 : n * findFact(n-1);
}
int findNpR(int n, int r){
    return findFact(n) / (findFact(n-r));
}
int findNcR(int n, int r){
    return findFact(n) / (findFact(n-r) * findFact(r));
}
int main()
{
    int n, r, nPr, nCr;
    
    cout << "Enter the value of n: " << endl;
    cin >> n;

    cout << "Enter the value of r:" << endl;
    cin >> r;

    nPr = findNpR(n,r);
    nCr = findNcR(n,r);

    cout << "Permutation, nPr : "<< nPr << endl;
    cout << "Combination, nCr : "<< nCr << endl;
    return 0;
}