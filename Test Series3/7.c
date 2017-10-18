#include<stdio.h>
#include<stdlib.h>
int main()
{
  char str[10]="abcdxyz";
  printf("%s\n",str );
  printf("%s\n",str+4 );
  str[3]=0;
  printf("%s\n",str );
  printf("%s\n",str+4 );
  str[3]='0';
  str[4]='\0';
  printf("%s\n",str );
  printf("%s\n",str+5 );
  return 0;
}
