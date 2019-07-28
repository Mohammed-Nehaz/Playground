#include<stdio.h>
int main()
{
  int i=0,n,a[100];
  scanf("%d",&n);
  while(n)
  {
    a[i]=n%2;
    i++;
    n=n/2;
  }
  for(int j=i-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
}