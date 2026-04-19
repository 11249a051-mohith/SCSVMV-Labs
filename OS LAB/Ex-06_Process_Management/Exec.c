#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>

int main()
{
    int pid=fork();

    if(pid==0){
        printf("child: execing ls\n");
        execl("/bin/ls","ls","-l",NULL);
    }
    else{
        wait(0);
        printf("parent: done\n");
    }
    return 0;
}
