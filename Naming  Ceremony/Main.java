#include <iostream>
using namespace std;

int main()
{
	char name[100]={0};
	
	//read name
	
	cin.getline(name,100);
	
	//print name
	cout<<name;
	
	return 0;
}