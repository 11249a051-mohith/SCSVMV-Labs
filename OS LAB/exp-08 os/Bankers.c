#include<stdio.h>

int main()
{
    int n,m,i,j,k;
    int alloc[10][10],maxm[10][10],need[10][10],avail[10];
    int finish[10],safeseq[10],cnt=0;

    printf("processes : "); scanf("%d",&n);
    printf("resources : "); scanf("%d",&m);

    printf("allocation matrix :\n");
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            scanf("%d",&alloc[i][j]);

    printf("max matrix :\n");
    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            scanf("%d",&maxm[i][j]);

    printf("available : ");
    for(i=0;i<m;i++) scanf("%d",&avail[i]);

    for(i=0;i<n;i++)
        for(j=0;j<m;j++)
            need[i][j]=maxm[i][j]-alloc[i][j];

    printf("\nneed matrix :\n");
    for(i=0;i<n;i++){
        for(j=0;j<m;j++) printf("%d ",need[i][j]);
        printf("\n");
    }

    for(i=0;i<n;i++) finish[i]=0;

    for(k=0;k<n;k++){
        for(i=0;i<n;i++){
            if(finish[i]==0){
                int ok=1;
                for(j=0;j<m;j++)
                    if(need[i][j]>avail[j]){ ok=0; break; }
                if(ok){
                    for(j=0;j<m;j++) avail[j]+=alloc[i][j];
                    safeseq[cnt++]=i;
                    finish[i]=1;
                }
            }
        }
    }

    int safe=1;
    for(i=0;i<n;i++) if(!finish[i]){ safe=0; break; }

    if(safe){
        printf("safe state\nsafe seq : ");
        for(i=0;i<n;i++) printf("P%d ",safeseq[i]);
        printf("\n");
    }else
        printf("unsafe state - deadlock\n");

    return 0;
}
