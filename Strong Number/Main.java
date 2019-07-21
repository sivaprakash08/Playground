#include <stdio.h>
int main() {
	int num,n,rem,i,fac=1,sum=0;
  scanf("%d",&num);
  n=num;
  while(n>0)
  {
    rem=n%10;
    for(i=1;i<=rem;i++)
      fac*=i;
    n=n/10;
    sum=sum+fac;
    fac=1;
  }
 if(num==sum)
   printf("Yes");
   else
    printf("No");
    return 0;
}