
# Ex No: 5 — System Calls using C

## Aim
To write and execute C programs using various UNIX/Linux system calls for file handling,
process management, and directory operations.

## Compilation
```bash
gcc filename.c -o output
./output
```

---

## a) stat() — `a_stat.c`
Gets file metadata (size, inode, permissions).

**Sample Output:**
```
Enter file name: test.txt
File Name   : test.txt
File Size   : 120 bytes
Inode Number: 256874
Permissions : 100644
```

---

## b) wait() — `b_wait.c`
Parent waits for child process to complete.

**Sample Output:**
```
Child Process: PID = 3451
Child Process: Executing...
Parent Process: PID = 3450
Parent Process: Resumed after child finished.
```

---

## c) getpid() — `c_getpid.c`
Displays current and parent process IDs.

**Sample Output:**
```
Current Process ID  : 3456
Parent Process ID   : 3400
```

---

## d) opendir() and readdir() — `d_opendir_readdir.c`
Lists all files in a given directory.

**Sample Output:**
```
Files in '.':
------------------------
.
..
a_stat.c
b_wait.c
```

---

## e) open(), read(), write() — `e_open_read_write.c`
Reads a file using low-level system calls and writes to stdout.

**Sample Output:**
```
--- Contents of test.txt ---
Hello, this is a test file.
----------------------------
```

---

## Result
All system call programs were successfully implemented and executed.
