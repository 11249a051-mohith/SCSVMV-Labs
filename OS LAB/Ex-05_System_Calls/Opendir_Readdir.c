#include<stdio.h>
#include<dirent.h>

int main()
{
	DIR *dp;
	struct dirent *ep;
	char path[100];

	printf("enter path : ");
	scanf("%s",path);

	dp=opendir(path);
	if(dp==NULL) {
		printf("cant open\n");
		return 1;
	}

	while((ep=readdir(dp))!=NULL)
		printf("%s\n",ep->d_name);

	closedir(dp);
	return 0;
}
