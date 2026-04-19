
#include<stdio.h>

int main()
{
	int n,i,j,t,pid[10],bt[10],wt[10],tat[10];
	float aw=0,at=0;

	printf("enter n : ");
	scanf("%d",&n);
	for(i=0;i<n;i++){
		printf("P%d burst : ",i+1);
		scanf("%d",&bt[i]);
		pid[i]=i+1;
	}

	// sort by burst time
	for(i=0;i<n-1;i++){
		for(j=0;j<n-1-i;j++){
			if(bt[j]>bt[j+1]){
				t=bt[j]; bt[j]=bt[j+1]; bt[j+1]=t;
				t=pid[j]; pid[j]=pid[j+1]; pid[j+1]=t;
			}
		}
	}

	wt[0]=0;
	for(i=1;i<n;i++)
		wt[i]=wt[i-1]+bt[i-1];
	for(i=0;i<n;i++)
		tat[i]=wt[i]+bt[i];

	printf("\nP  BT  WT  TAT\n");
	for(i=0;i<n;i++){
		printf("P%d %d  %d  %d\n",pid[i],bt[i],wt[i],tat[i]);
		aw+=wt[i]; at+=tat[i];
	}
	printf("avg wt=%.2f  avg tat=%.2f\n",aw/n,at/n);
	return 0;
}
