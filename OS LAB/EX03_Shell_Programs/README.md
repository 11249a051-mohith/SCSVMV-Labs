# Ex No: 4 — Linux Pipes and Filters

## Aim
To study and practice Linux pipes and filter commands — grep, awk, and sed — for
processing and manipulating text data.

---

## a) Linux Pipe ( | )
A pipe passes the output of one command as input to the next.

```bash
# List only .txt files
ls -l | grep ".txt"

# Count running processes
ps -ef | wc -l
```

---

## b) grep — Search for Patterns

```bash
# Search for the word "Linux" in a file
grep "Linux" file.txt

# Case-insensitive search
grep -i "os" file.txt

# Show line numbers
grep -n "error" file.txt

# Show processes owned by root (using pipe)
ps -ef | grep root

# Recursive search in all files
grep -r "main" /home/user/
```

---

## c) awk — Pattern Scanning and Processing

```bash
# Print first column of a file
awk '{print $1}' file.txt

# Print first and third columns
awk '{print $1, $3}' file.txt

# Print lines where second field > 50
awk '$2 > 50 {print $0}' file.txt

# Display filesystem name and usage (with pipe)
df -h | awk '{print $1, $5}'

# Print number of lines in file
awk 'END {print NR}' file.txt
```

---

## d) sed — Stream Editor

```bash
# Replace first occurrence of "Linux" with "UNIX" per line
sed 's/Linux/UNIX/' file.txt

# Replace all occurrences globally
sed 's/Linux/UNIX/g' file.txt

# Delete second line
sed '2d' file.txt

# Delete blank lines
sed '/^$/d' file.txt

# Replace .txt with .doc in ls output (pipe)
ls | sed 's/.txt/.doc/'
```

---

## e) Combined Pipes and Filters

```bash
# Search for lines containing "OS"
cat file.txt | grep "OS"

# Get PIDs of root processes
ps -ef | grep root | awk '{print $2}'

# Replace "error" with "ERROR" in file output
cat file.txt | sed 's/error/ERROR/g'

# Count occurrences of a word
grep -o "Linux" file.txt | wc -l
```

---

## Result
Linux pipes and filter commands — grep, awk, and sed — were successfully practiced
to process and manipulate text data.
