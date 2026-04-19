
#include<stdio.h>

int main()
{
	int b[10],p[10],alloc[10];
	int nb,np,i,j;

	printf("no of blocks : "); scanf("%d",&nb);
	for(i=0;i<nb;i++){
		printf("block[%d] : ",i); scanf("%d",&b[i]);
	}
	printf("no of process : "); scanf("%d",&np);
	for(i=0;i<np;i++){
		printf("process[%d] : ",i); scanf("%d",&p[i]);
		alloc[i]=-1;
	}

	for(i=0;i<np;i++){
		for(j=0;j<nb;j++){
			if(b[j]>=p[i]){
				alloc[i]=j;
				b[j]-=p[i];
				break;
			}
		}
	}

	printf("\nprocess  size  block\n");
	for(i=0;i<np;i++){
		if(alloc[i]!=-1)
			printf("P%d       %d     B%d\n",i+1,p[i],alloc[i]+1);
		else
			printf("P%d       %d     --\n",i+1,p[i]);
	}
	return 0;
}
