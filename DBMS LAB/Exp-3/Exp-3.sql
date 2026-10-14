-- Experiment 3 — DCL and TCL commands
--
-- AIM
-- To practice GRANT and REVOKE permissions and control transactions using COMMIT, ROLLBACK, and SAVEPOINT.
--
-- PROGRAM
-- Environment: MySQL 8.0.31 or later.
--
-- The DCL statements require existing lab accounts user1 and student1 and an account authorized to grant and revoke privileges. Run the Employee and Book examples in order. The Book baseline is committed before its transaction demonstration.

-- Step 1
CREATE DATABASE IF NOT EXISTS DBMS_EXP3;

-- Step 2
USE DBMS_EXP3;

-- Step 3
CREATE TABLE Employee(
EmpID INT PRIMARY KEY,
Name VARCHAR(30),
Department VARCHAR(20),
Salary DECIMAL(10,2));

-- Step 4
INSERT INTO Employee VALUES
(101,'Arun','HR',35000),
(102,'Priya','IT',45000),
(103,'Kavin','Finance',50000),
(104,'Divya','IT',55000);

-- Step 5
GRANT SELECT ON Employee TO user1;

-- Step 6
GRANT SELECT, INSERT ON Employee TO user1;

-- Step 7
REVOKE INSERT ON Employee FROM user1;

-- Step 8
REVOKE ALL ON Employee FROM user1;

-- Step 9
SET AUTOCOMMIT=0;

-- Step 10
UPDATE Employee SET Salary=48000 WHERE EmpID=102;

-- Step 11
SAVEPOINT SP1;

-- Step 12
UPDATE Employee SET Salary=60000 WHERE EmpID=104;

-- Step 13
SELECT * FROM Employee;

-- Step 14
ROLLBACK TO SP1;

-- Step 15
COMMIT;

-- Step 16
DELETE FROM Employee WHERE EmpID=101;

-- Step 17
ROLLBACK;

-- Step 18
SELECT * FROM Employee;

-- Step 19
CREATE TABLE Book(
 BookID INT PRIMARY KEY,
 Title VARCHAR(50),
 Author VARCHAR(40),
 Category VARCHAR(30),
 Price DECIMAL(8,2)
);

-- Step 20
INSERT INTO Book VALUES
(101,'Database System','Korth','Database',550),
(102,'C Programming','Dennis Ritchie','Programming',450),
(103,'Java Programming','Herbert Schildt','Programming',650),
(104,'Python Basics','Mark Lutz','Programming',700),
(105,'Computer Networks','Andrew Tanenbaum','Networking',600);

-- Step 21
COMMIT;

-- Step 22
GRANT SELECT ON Book TO student1;

-- Step 23
GRANT INSERT, UPDATE ON Book TO student1;

-- Step 24
REVOKE UPDATE ON Book FROM student1;

-- Step 25
REVOKE ALL ON Book FROM student1;

-- Step 26
SET AUTOCOMMIT=0;

-- Step 27
UPDATE Book SET Price=Price*1.10 WHERE Category='Programming';

-- Step 28
SAVEPOINT SP_Book;

-- Step 29
UPDATE Book SET Price=800 WHERE BookID=104;

-- Step 30
ROLLBACK TO SP_Book;

-- Step 31
DELETE FROM Book WHERE BookID=105;

-- Step 32
ROLLBACK;

-- Step 33
COMMIT;

-- Step 34
SELECT * FROM Book;

-- RESULT
-- The programs demonstrate access control and show how commits, full rollbacks, and savepoint rollbacks affect employee and book data.
