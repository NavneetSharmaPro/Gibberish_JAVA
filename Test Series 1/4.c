#include<stdio.h>
void xyz()
{
  auto int a=10;
  ++a;
  printf("\na=%d",a );
}
int main()
{
  int a=5;
  ++a;
  xyz();
  xyz();
  ++a;
  printf("\na=%d",a );
  return 0;
}
