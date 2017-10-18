#include<stdio.h>
#include<stdlib.h>
int main()
{
  int a,b,c,d;
  a=15;
  b=10;
  c=++a-b;
  printf("a=%d b=%d c=%d\n",a,b,c );
  d=++a+a;
  printf("a=%d b=%d c=%d\n",a,b,c );
  printf("a/b=%d\n",a/b);
  printf("a%%b=%d\n",a%b );
  printf("a*=b=%d\n",a*=b );
  printf("%d\n",(c>a)?1:0 );
  printf("%d\n",(c<a)?1:0 );
  return 0;
}
