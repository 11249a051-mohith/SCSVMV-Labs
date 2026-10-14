-- Experiment 2 — Insertion, deletion, updating, altering and viewing records
--
-- AIM
-- To perform insertion, deletion, modification, updating, alteration, and conditional retrieval of table records.
--
-- PROGRAM
-- Environment: MySQL 8.0.31 or later.
--
-- Run once in the experiment database with no existing tables of these names.

-- Step 1
CREATE DATABASE IF NOT EXISTS DBMS_EXP2;

-- Step 2
USE DBMS_EXP2;

-- Step 3
CREATE TABLE Employee (EmpID INT PRIMARY KEY, Name VARCHAR(50), Department VARCHAR(30), Salary DECIMAL(10,2), JoinDate DATE );

-- Step 4
INSERT INTO Employee (EmpID, Name, Department, Salary, JoinDate) VALUES (101, 'Anjali Sharma', 'IT', 45000.00, '2023-06-15');

-- Step 5
INSERT INTO Employee (EmpID, Name, Department, Salary, JoinDate) VALUES (102, 'Ravi Kumar', 'HR', 38000.00, '2022-03-10'), (103, 'Priya Singh', 'Finance', 52000.00, '2021-11-01'), (104, 'Karthik Iyer', 'IT', 47000.00, '2023-01-20');

-- Step 6
SELECT * FROM Employee;

-- Step 7
SELECT * FROM Employee WHERE Department = 'IT';

-- Step 8
SELECT Name, Salary FROM Employee
WHERE Salary > 40000;

-- Step 9
SELECT * FROM Employee WHERE Department = 'IT' AND Salary >= 45000;

-- Step 10
SELECT * FROM Employee WHERE Salary BETWEEN 40000 AND 50000;

-- Step 11
SELECT * FROM Employee WHERE Department IN ('IT', 'Finance');

-- Step 12
SELECT * FROM Employee WHERE Name LIKE 'A%';

-- Step 13
SELECT * FROM Employee WHERE Department = 'IT' ORDER BY Salary DESC;

-- Step 14
UPDATE Employee
SET Salary = 48000.00
WHERE EmpID = 101;

-- Step 15
UPDATE Employee
SET Salary = Salary + 2000, Department = 'Systems'
WHERE Department = 'IT';

-- Step 16
DELETE FROM Employee
WHERE EmpID = 102;

-- Step 17
DELETE FROM Employee
WHERE Salary < 40000;

-- Step 18
DELETE FROM Employee;

-- Step 19
TRUNCATE TABLE Employee;

-- Step 20
ALTER TABLE Employee ADD Email VARCHAR(100);

-- Step 21
ALTER TABLE Employee
MODIFY COLUMN Name VARCHAR(80);

-- Step 22
ALTER TABLE Employee RENAME COLUMN Email TO ContactEmail;

-- Step 23
ALTER TABLE Employee DROP COLUMN ContactEmail;

-- Step 24
ALTER TABLE Employee RENAME TO Staff;

-- RESULT
-- The program demonstrates DML operations and DDL changes on employee records and table structure.
