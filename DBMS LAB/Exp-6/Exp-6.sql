-- Experiment 6 — Aggregate functions, GROUP BY and HAVING
--
-- AIM
-- To summarize, group, and filter employee data using COUNT, SUM, AVG, MIN, MAX, GROUP BY, and HAVING.
--
-- PROGRAM
-- Environment: MySQL 8.0.31 or later.
--
-- Run once in the experiment database with no existing tables of these names.

-- Step 1
CREATE DATABASE IF NOT EXISTS DBMS_EXP6;

-- Step 2
USE DBMS_EXP6;

-- Step 3
CREATE TABLE Employee (
    EmpID       INT PRIMARY KEY,
    EmpName     VARCHAR(50),
    Department  VARCHAR(30),
    Designation VARCHAR(30),
    Salary      DECIMAL(10,2),
    City        VARCHAR(30),
    DOJ         DATE
);

-- Step 4
INSERT INTO Employee VALUES
(1, 'Aarav Sharma',   'IT',      'Developer',      55000, 'Chennai',   '2021-03-15'),
(2, 'Priya Nair',     'IT',      'Team Lead',       75000, 'Chennai',   '2019-06-10'),
(3, 'Rohit Verma',    'HR',      'Executive',       35000, 'Bangalore', '2022-01-20'),
(4, 'Sneha Iyer',     'HR',      'Manager',         65000, 'Bangalore', '2018-11-05'),
(5, 'Karthik Raj',    'Finance', 'Analyst',         45000, 'Chennai',   '2020-07-01'),
(6, 'Divya Menon',    'Finance', 'Manager',         70000, 'Mumbai',    '2017-09-25'),
(7, 'Arjun Das',      'IT',      'Developer',       58000, 'Mumbai',    '2021-12-12'),
(8, 'Fatima Khan',    'HR',      'Executive',       36000, 'Chennai',   '2023-02-18'),
(9, 'Vikram Singh',   'Finance', 'Analyst',         47000, 'Bangalore', '2022-05-30'),
(10,'Meera Pillai',   'IT',      'Developer',       59000, 'Bangalore', '2020-08-14');

-- Step 5
SELECT COUNT(*) AS TotalEmployees FROM Employee;

-- Step 6
SELECT SUM(Salary) AS TotalSalary FROM Employee;

-- Step 7
SELECT AVG(Salary) AS AverageSalary FROM Employee;

-- Step 8
SELECT MAX(Salary) AS HighestSalary, MIN(Salary) AS LowestSalary FROM Employee;

-- Step 9
SELECT Department, COUNT(*) AS EmpCount
FROM Employee
GROUP BY Department;

-- Step 10
SELECT Department, AVG(Salary) AS AvgSalary
FROM Employee
GROUP BY Department
ORDER BY AvgSalary DESC;

-- Step 11
SELECT Department, COUNT(*) AS EmpCount
FROM Employee
GROUP BY Department
HAVING COUNT(*) > 3;

-- Step 12
SELECT Department, AVG(Salary) AS AvgSalary
FROM Employee
GROUP BY Department
HAVING AVG(Salary) > 50000;

-- Step 13
SELECT Department, City, COUNT(*) AS EmpCount
FROM Employee
WHERE Salary > 40000
GROUP BY Department, City
HAVING COUNT(*) >= 2
ORDER BY Department;

-- Step 14
SELECT City, SUM(Salary) AS TotalSalary
FROM Employee
GROUP BY City
HAVING SUM(Salary) > 100000;

-- RESULT
-- The queries summarize employee data and filter grouped results using aggregate functions and HAVING.
