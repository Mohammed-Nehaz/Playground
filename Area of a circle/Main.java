#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n;
	float pi=3.14;
	scanf("%d",&n);
	float r=(float)n/2;
	float a=pi*r*r;
	printf("%.2f",a);
}