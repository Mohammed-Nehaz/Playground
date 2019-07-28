#include <stdio.h>
#include<math.h>
int main()
{
  int b,e;
  scanf("%d%d",&b,&e);
  if(e<0)
  {
    printf("Wrong input");
  }
  else
  {
    int p=pow(b,e);
    printf("%d",p);
  }
}