#include <stdio.h>
int main() {
	int n,i,sum=1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    printf("%d\n",sum);
    sum=sum+2;
  }
	return 0;
}