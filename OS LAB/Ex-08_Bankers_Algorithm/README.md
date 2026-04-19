# Ex No: 8 — Deadlock Avoidance using Banker's Algorithm

## Aim
To write and execute a C program to avoid deadlock using Banker's Algorithm and
determine whether the system is in a safe state.

## Compilation
```bash
gcc bankers.c -o bankers
./bankers
```

---

## Sample Input
```
Processes : 5
Resources : 3

Allocation Matrix:
P0: 0 1 0
P1: 2 0 0
P2: 3 0 2
P3: 2 1 1
P4: 0 0 2

Maximum Matrix:
P0: 7 5 3
P1: 3 2 2
P2: 9 0 2
P3: 2 2 2
P4: 4 3 3

Available Resources: 3 3 2
```

## Sample Output
```
Need Matrix:
P0: 7 4 3
P1: 1 2 2
P2: 6 0 0
P3: 0 1 1
P4: 4 3 1

System is in a SAFE state.
Safe Sequence: P1 -> P3 -> P4 -> P0 -> P2
```

---

## Result
Deadlock was successfully avoided using Banker's Algorithm and the system
was found to be in a safe state.
