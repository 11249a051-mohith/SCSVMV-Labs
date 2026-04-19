

#include<stdio.h>

int main()
{
    int nb,np,i,j,best;
    int b[10],p[10],al[10];

    printf("blocks : "); scanf("%d",&nb);
    for(i=0;i<nb;i++){
        printf("b[%d]= ",i+1);
        scanf("%d",&b[i]);
    }
    printf("processes : "); scanf("%d",&np);
    for(i=0;i<np;i++){
        printf("p[%d]= ",i+1);
        scanf("%d",&p[i]);
        al[i]=-1;
    }

    for(i=0;i<np;i++){
        best=-1;
        for(j=0;j<nb;j++){
            if(b[j]>=p[i]){
                if(best==-1 || b[j]<b[best])
                    best=j;
            }
        }
        if(best!=-1){
            al[i]=best;
            b[best]-=p[i];
        }
    }

    for(i=0;i<np;i++){
        if(al[i]!=-1)
            printf("P%d(%d) -> block %d\n",i+1,p[i],al[i]+1);
        else
            printf("P%d(%d) -> not alloc\n",i+1,p[i]);
    }
    return 0;
}
