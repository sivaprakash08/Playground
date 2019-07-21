#include <stdio.h>
int main() {
	int i,num,a,n,sum=1,rem,fnl=0,count=0;
  scanf("%d",&num);
  n=num;
  a=num;
  while(n>0)
  {
    n=n/10;
    count+=1;
  }
  while(a>0)
  {
    rem=a%10;
    for(i=1;i<=count;i++)
    {
      sum=sum*rem;
    }
    fnl=fnl+sum;
    sum=1;
    a=a/10;
  }
  if(fnl==num)
  printf("Armstrong Number");
else
   printf("Not an Armstrong Number");
	return 0;
}
