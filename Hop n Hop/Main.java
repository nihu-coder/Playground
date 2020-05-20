#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  cin>>b;
  int c=abs(a-3);
  int d=abs(b-4);
  if(c<d)
    cout<<d;
  else
    cout<<c;
  return 0;
  //Type your code here.
}