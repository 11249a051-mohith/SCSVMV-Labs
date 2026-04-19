#include<stdio.h>

int main()
{
    int n,q,i,t=0,flag;
    int bt[10],rt[10],wt[10],tat[10];
    float sw=0,st=0;

    printf("processes : ");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        printf("bt P%d : ",i+1);
        scanf("%d",&bt[i]);
        rt[i]=bt[i];
    }
    printf("quantum : ");
    scanf("%d",&q);

    do{
        flag=1;
        for(i=0;i<n;i++){
            if(rt[i]>0){
                flag=0;
                if(rt[i]>q){
                    t+=q;
                    rt[i]-=q;
                }else{
                    t+=rt[i];
                    wt[i]=t-bt[i];
                    rt[i]=0;
                }
            }
        }
    }while(!flag);

    printf("\nP\tBT\tWT\tTAT\n");
    for(i=0;i<n;i++){
        tat[i]=wt[i]+bt[i];
        printf("P%d\t%d\t%d\t%d\n",i+1,bt[i],wt[i],tat[i]);
        sw+=wt[i]; st+=tat[i];
    }
    printf("avg wt=%.2f  tat=%.2f\n",sw/n,st/n);
    return 0;
}
