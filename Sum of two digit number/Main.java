#include<stdio.h>
int main()
{
  int num,sum;
  int first,last;
    scanf("%d",&num);
  first=num/10;
  last=num%10;
  sum=first+last;
  printf("%d",sum);
  return 0;
}