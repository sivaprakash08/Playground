#include <stdio.h>
int main() {
	int sum=0,n,rem,fir;
  scanf("%d",&n);
   rem=n%10;
  while(n>0)
  {
   fir=n%10;
    n=n/10;
  }
  printf("%d",fir+rem);
	return 0;
}