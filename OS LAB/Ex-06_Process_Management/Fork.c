#include<stdio.h>
#include<unistd.h>

int main()
{
	int pid;
	pid=fork();

	if(pid<0)
		printf("fork error\n");
	else if(pid==0)
	{
		printf("i am child\n");
		printf("my pid=%d  parent=%d\n",getpid(),getppid());
	}
	else
	{
		printf("i am parent\n");
		printf("my pid=%d  child=%d\n",getpid(),pid);
	}
	return 0;
}
