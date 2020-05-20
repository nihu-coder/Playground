#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  cin>>b;
  cin>>c;
  double intrest=(a*b*c)/100;
  cout<<intrest<<endl;
  double amount=(a+intrest);
  cout<<amount<<endl;
  double discount=(intrest*2)/100;
  cout<<discount<<endl;
  double finals=(amount-discount);
  cout<<finals;
  return 0;
  //Type your code here.
}