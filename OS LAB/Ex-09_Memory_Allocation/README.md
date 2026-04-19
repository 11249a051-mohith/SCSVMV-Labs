# Ex No: 9 — Memory Allocation Methods

## Aim
To implement First Fit, Best Fit, and Worst Fit memory allocation strategies using C.

## Compilation
```bash
gcc a_first_fit.c -o first_fit && ./first_fit
gcc b_best_fit.c  -o best_fit  && ./best_fit
gcc c_worst_fit.c -o worst_fit && ./worst_fit
```

---

## Sample Input (common for all three)
```
Blocks : 5  →  sizes: 100  500  200  300  600
Processes : 4  →  sizes: 212  417  112  426
```

---

## a) First Fit — `a_first_fit.c`
Allocates the **first** block large enough to fit the process.

**Sample Output:**
```
Process  Size   Allocated Block
P1       212    Block 2
P2       417    Block 5
P3       112    Block 2
P4       426    Not Allocated
```

---

## b) Best Fit — `b_best_fit.c`
Allocates the **smallest** block that is still large enough.

**Sample Output:**
```
Process  Size   Allocated Block
P1       212    Block 4
P2       417    Block 2
P3       112    Block 3
P4       426    Block 5
```

---

## c) Worst Fit — `c_worst_fit.c`
Allocates the **largest** available block.

**Sample Output:**
```
Process  Size   Allocated Block
P1       212    Block 5
P2       417    Block 2
P3       112    Block 5
P4       426    Not Allocated
```

---

## Result
First Fit, Best Fit, and Worst Fit memory allocation methods were successfully implemented.
