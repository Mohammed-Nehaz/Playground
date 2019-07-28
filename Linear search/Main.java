#include<stdio.h>
int main()
{
  int n,ele,result=0;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&ele);
  for(int i=0;i<n;i++)
  {
    if(a[i]==ele)
    {
      printf("%d",i+1);
      result++;
    }
    else if(i==(n-1) && result==0)
    {
      printf("%d isn't present in the array.",ele);
    }
  }  
  return 0;
}