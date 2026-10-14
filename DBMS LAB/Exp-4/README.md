# Expected output

## Step 9

```text
NOT NULL violation: Student.name cannot be NULL.
```

## Step 10

```text
UNIQUE violation: duplicate value in Student.email.
```

## Step 11

```text
PRIMARY KEY violation: duplicate roll_no.
```

## Step 12

```text
CHECK violation: age >= 17 AND age <= 30.
```

## Step 13

```text
FOREIGN KEY violation: referenced record does not exist.
```

## Step 14

```text
Table altered.
```

## Step 15

```text
Table altered.
```

## Step 16

| Column | Type |
| --- | --- |
| roll_no | INT |
| name | VARCHAR(50) |
| age | INT |
| email | VARCHAR(50) |
| gender | VARCHAR(20) |
| dept_id | INT |

## Final Student records

| roll_no | name | age | email | gender | dept_id |
| --- | --- | --- | --- | --- | --- |
| 101 | Arun | 20 | arun@email.com | Male | 1 |
| 102 | Priya | 21 | priya@email.com | Not Specified | 2 |
