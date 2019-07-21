#include<stdio.h>
int main()
{
  int num ;
    scanf("%d",&num);
  int first=0;
  int digit=0;
  int sum=0;
  first=num/100;
  digit=num%10;
  sum=digit+first;
  printf("%d",sum);
  return 0;
}