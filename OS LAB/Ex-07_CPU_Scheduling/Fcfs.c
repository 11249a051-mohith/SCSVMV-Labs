#include<stdio.h>

int main()
{
	int n,bt[10],wt[10],tat[10],i;
	float awt=0,atat=0;

	printf("no of process : ");
	scanf("%d",&n);

	for(i=0;i<n;i++){
		printf("bt[%d] = ",i+1);
		scanf("%d",&bt[i]);
	}

	wt[0]=0;
	for(i=1;i<n;i++)
		wt[i]=wt[i-1]+bt[i-1];

	for(i=0;i<n;i++)
		tat[i]=wt[i]+bt[i];

	printf("\nP  BT  WT  TAT\n");
	for(i=0;i<n;i++){
		printf("P%d %d  %d  %d\n",i+1,bt[i],wt[i],tat[i]);
		awt+=wt[i];
		atat+=tat[i];
	}
	printf("\navg wt=%.2f  avg tat=%.2f\n",awt/n,atat/n);
	return 0;
}
