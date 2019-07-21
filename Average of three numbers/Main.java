#include<stdio.h>
int main()
{
 int a[3],i,avg,sum=0;
  for(i=0;i<3;i++)
  {
    scanf("%d",&a[i]);
    sum=sum+a[i];
  }
  avg=sum/3;
  printf("%d",avg);
  return 0;
}