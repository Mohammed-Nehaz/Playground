#include<stdio.h>
int main()
{
  long int n;
  long int sum=1;
  scanf("%d",&n);
  for(long int i=1;i<=n;i++)
    sum=sum*i;
  printf("%ld",sum);
}