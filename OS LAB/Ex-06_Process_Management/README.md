# Ex No: 6 — Process Management

## Aim
To implement process management in Linux using fork() and exec() system calls and
to understand process creation and program execution.

## Compilation
```bash
gcc a_fork.c -o fork_demo && ./fork_demo
gcc b_exec.c  -o exec_demo  && ./exec_demo
```

---

## a) fork() — `a_fork.c`
Creates a child process; both parent and child run concurrently after the fork.

**Sample Output:**
```
--- Parent Process ---
Parent PID : 3450
Child PID  : 3451
--- Child Process ---
Child PID  : 3451
Parent PID : 3450
```

---

## b) exec() — `b_exec.c`
Replaces the child process image with a new program (ls -l).

**Sample Output:**
```
Child process: replacing with 'ls' command output:
--------------------------------------------------
total 12
-rw-r--r-- 1 user user 412 Apr 17 a_fork.c
-rw-r--r-- 1 user user 398 Apr 17 b_exec.c
--------------------------------------------------
Parent process: child has finished execution.
```

---

## Result
Process creation using fork() and program replacement using exec() were successfully demonstrated.
