#include<stdio.h>
int main()
{
  int i=0,n,a[10];
  scanf("%d",&n);
  while(n!=0)
  {
    a[i]=n%8;
    i++;
    n=n/8;
  }
  for(int j=i-1;j>=0;j--)
  {
    printf("%d",a[j]);
  }
}