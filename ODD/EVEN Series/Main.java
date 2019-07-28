#include<stdio.h>
main()
{
	int n,m;
	scanf("%d",&n);
	if(n%2==0)
	{
		m=(n/2)-1;
		printf("%d",m);
	}
	else
	{
		m=n-1;
		printf("%d",m);
	}
}