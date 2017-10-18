#include<stdio.h>
#include<stdlib.h>
int main()
{
  int a=8/4;
  switch(a)
  {
    case 1+2:printf("A"); break;
    case 5%3:printf("B"); break;
    case 2+2:printf("C"); break;
    default: printf("D");
  }
  return 0;
}
