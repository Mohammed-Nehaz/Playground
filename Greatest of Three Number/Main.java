#include <stdio.h>

int main()
{ 
  int a,b,c;
  scanf("%d%*c %d%*c %d%*c",&a,&b,&c);
  if(a>b)
  {
    if(a>c)
    {
      printf("%d",a);
    }
    else
    {
      printf("%d",c);
    }
  }
  else
  {
    if(b>c)
    {
      printf("%d",b);
    }
    else
    {
      printf("%d",c);
    }
  }
  return 0;
}