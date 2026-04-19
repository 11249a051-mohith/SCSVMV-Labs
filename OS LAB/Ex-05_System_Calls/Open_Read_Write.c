#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>

int main()
{
    int fd,n;
    char buf[200],fname[50];

    printf("enter file : ");
    scanf("%s",fname);

    fd=open(fname,O_RDONLY);
    if(fd==-1){
        printf("file open error\n");
        return 1;
    }

    while((n=read(fd,buf,200))>0)
        write(1,buf,n);

    close(fd);
    return 0;
}
