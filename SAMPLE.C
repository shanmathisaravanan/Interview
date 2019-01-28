#include<stdio.h>
#include<conio.h>
int main()
{
	int n, a[100], i, j ,t, flag[100];
	clrscr();
	scanf("%d", &n);
	for(i = 0;i < n;i++)
	{
		scanf("%d", &a[i]);
		flag[i] = 0;
	}
	for(i = 0; i < n; i++)
	{
		if(a[i] != 9999)
		{
		for(j = i+1; j < n; j++)
		{
			if(a[i] == a[j])
			{
				flag[i] = 1;
				a[j] = 9999;
			}
		}
		}
	}

	for(i = 0; i < n;i++)
	{

		if(flag[i] == 1)
		{
		for(j=i+1; j < n; j++)
		{
			if(flag[j] == 1 && a[j] != 9999)
			{
			if(a[i] > a[j])
			{


				t = a[i];
				a[i] = a[j];
				a[j] = t;
			}
			}
		}
		}
	}
	for(i = 0; i < n; i++)
	{
		if(a[i] != 9999 && flag[i] == 1)
		printf("%d ", a[i]);
	}

	getch();
}