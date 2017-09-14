#include <stdio.h>
int main()
{
    int i,j,a[50],k,t;
    for(i=1;i<=50;i++)
        scanf("%d",&a[i]);
    scanf("%d",&k);
    for(i=1;i<=50;i++)
    {
    	for(j=i+1;j<=50;j++)
    	{
    		if(a[j]>a[i])
    		{
    			t=a[i];
    			a[i]=a[j];
    			a[j]=t;
    		}
    	}
    }
	printf("%d",a[k]);
  return 0;
}