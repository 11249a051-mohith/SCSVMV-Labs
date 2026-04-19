#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>

int main()
{
	int pid;
	pid=fork();
	if(pid==0)
	{
		printf("child  pid=%d\n",getpid());
	}
	else
	{
		wait(NULL);
		printf("parent pid=%d  child done\n",getpid());
	}
	return 0;
}
