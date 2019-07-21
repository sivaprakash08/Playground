#include<stdio.h>
int main()
{
 int num;
  scanf("%d",&num);
  int sum=0;
  int digit=0;
  sum=num%100;
  digit=sum/10;
  printf("%d",digit);
  return 0;
}