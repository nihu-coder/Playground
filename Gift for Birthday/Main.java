#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  if((a%4==0)&&(a%100!=0)||(a%400==0))
    cout<<a<<" is a leap year";
  else
    cout<<a<<" is not a leap year";
  return 0;
  //Type your code here.
}