#include<stdio.h>
int main()
{
 int a,b,i,small,lcm;
  scanf("%d %d",&a,&b);
  small=(a>b?b:a);
   
  for(i=small;i>=1;i--)
  {
    if(a%i==0 && b%i==0)
    {
      lcm=(a*b)/i;
      break;
    }
    
  }
  printf("%d",lcm);
   return 0;
}
