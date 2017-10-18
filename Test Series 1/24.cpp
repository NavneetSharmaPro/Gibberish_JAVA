#include<iostream>
#include<cstring>
#define MAX 1000
using namespace std;
int main()
{
  int t;
  cin>>t;
  char str[MAX];
  for(int i=0;i<t;i++)
  {
    cin>>str;
    if((strlen(str)-1)%4==0)
    {
      cout<<"YES";
    }
    else
      cout<<"NO";
  }
  return 0;
}
