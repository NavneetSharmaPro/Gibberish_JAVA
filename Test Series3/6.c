#include<stdio.h>
#include<stdlib.h>
union abc
{
  int i;
  char ch;
};

int main()
{
  union abc obj;
  obj.i=788;
  obj.ch=10;
  printf("%d %d\n",obj.i,obj.ch);
  return 0;
}
