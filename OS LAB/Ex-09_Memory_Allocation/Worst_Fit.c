
#include<stdio.h>

int main()
{
	int nb,np,i,j,w;
	int b[10],p[10],al[10];

	printf("no.of blocks : "); scanf("%d",&nb);
	for(i=0;i<nb;i++){ printf("b%d : ",i+1); scanf("%d",&b[i]); }

	printf("no.of process : "); scanf("%d",&np);
	for(i=0;i<np;i++){ printf("p%d : ",i+1); scanf("%d",&p[i]); al[i]=-1; }

	for(i=0;i<np;i++){
		w=-1;
		for(j=0;j<nb;j++){
			if(b[j]>=p[i])
				if(w==-1 || b[j]>b[w]) w=j;
		}
		if(w!=-1){ al[i]=w; b[w]-=p[i]; }
	}

	printf("\nprocess  size  allocated\n");
	for(i=0;i<np;i++){
		if(al[i]!=-1) printf("P%d  %d  block%d\n",i+1,p[i],al[i]+1);
		else printf("P%d  %d  NA\n",i+1,p[i]);
	}
	return 0;
}
