int main()
{
  int n,arr[124],i,count;
  scanf("%d",&n);
  while(n!=0)
  {
    arr[count++]=n%8;
    n=n/8;
  }
  for(i=count-1;i>=0;i--)
  {
    printf("%d",arr[i]);
  }
  return 0;
}