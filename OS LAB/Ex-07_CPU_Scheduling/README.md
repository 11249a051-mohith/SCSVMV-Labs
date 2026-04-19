
# Ex No: 7 — CPU Scheduling Algorithms

## Aim
To implement FCFS, Round Robin, and SJF CPU scheduling algorithms using C.

## Compilation
```bash
gcc a_fcfs.c        -o fcfs && ./fcfs
gcc b_round_robin.c -o rr   && ./rr
gcc c_sjf.c         -o sjf  && ./sjf
```

---

## a) FCFS (First Come First Serve) — `a_fcfs.c`

**Sample Input:** 3 processes, burst times: 5 3 8

**Sample Output:**
```
Process  Burst Time  Waiting Time  Turnaround Time
P1       5           0             5
P2       3           5             8
P3       8           8             16

Average Waiting Time    : 4.33
Average Turnaround Time : 9.67
```

---

## b) Round Robin — `b_round_robin.c`

**Sample Input:** 3 processes, burst times: 10 5 8, time quantum: 2

**Sample Output:**
```
Process  Burst Time  Waiting Time  Turnaround Time
P1       10          13            23
P2       5           8             13
P3       8           10            18

Average Waiting Time    : 10.33
Average Turnaround Time : 18.00
```

---

## c) SJF (Shortest Job First) — `c_sjf.c`

**Sample Input:** 3 processes, burst times: 6 2 8

**Sample Output:**
```
Process  Burst Time  Waiting Time  Turnaround Time
P2       2           0             2
P1       6           2             8
P3       8           8             16

Average Waiting Time    : 3.33
Average Turnaround Time : 8.67
```

---

## Result
FCFS, Round Robin, and SJF scheduling algorithms were successfully implemented.
