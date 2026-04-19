#include<stdio.h>
#include<sys/stat.h>

void main()
{
	struct stat s;
	char f[50];
	printf("filename: ");
	scanf("%s",f);

	if(stat(f,&s)<0){
		printf("error\n");
		return;
	}
	printf("size     : %ld\n",s.st_size);
	printf("inode    : %ld\n",(long)s.st_ino);
	printf("mode     : %o\n",s.st_mode);
}
