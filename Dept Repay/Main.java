#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  double inter,total,disc,final;
  cin>>x>>y>>r;
  inter=(x*y*r)/100;
  total=x+inter;
  disc=inter*2/100;
  final=x+inter-disc;
  cout<<inter<<endl;
  cout<<total<<endl;
  cout<<disc<<endl;
  cout<<final<<endl;
  return 0;
}