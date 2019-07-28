#include<stdio.h>
int main()
{
  int t;
  float p,r,i;
  scanf("%f%d%f",&p,&t,&r);
  i=(float)p*t*r/100;
  printf("%f",i);
  return 0;
}