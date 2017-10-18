#include<stdio.h>
#include<conio.h>
int main()
{
  int arr[]={3,13,23,33,43};
  int *ptr=arr;
  ++ptr;
  --*ptr;
  --ptr;
  ++*ptr;
  printf("%d%d%d",arr[0],arr[1],arr[2] );
  return 0;
}
