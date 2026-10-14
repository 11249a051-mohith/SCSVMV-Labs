-- Experiment 4 — SQL constraints
--
-- AIM
-- To create tables with PRIMARY KEY, FOREIGN KEY, UNIQUE, NOT NULL, CHECK, and DEFAULT constraints, test violations, and add or remove a constraint.
--
-- PROGRAM
-- Environment: MySQL 8.0.31 or later.
--
-- Run the constraint-violation INSERT statements one at a time; they intentionally fail. Continue with the remaining statements afterward.

-- Step 1
CREATE DATABASE IF NOT EXISTS DBMS_EXP4;

-- Step 2
USE DBMS_EXP4;

-- Step 3
CREATE TABLE Department ( dept_id     INT PRIMARY KEY,  dept_name VARCHAR(50) NOT NULL UNIQUE);

-- Step 4
CREATE TABLE Student (
    roll_no INT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    age INT CHECK (age >= 17 AND age <= 30),
    email VARCHAR(50) UNIQUE,
    gender VARCHAR(20) DEFAULT 'Not Specified',
    dept_id INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

-- Step 5
INSERT INTO Department VALUES (1, 'Computer Science');

-- Step 6
INSERT INTO Department VALUES (2, 'Electronics');

-- Step 7
INSERT INTO Student (roll_no, name, age, email, gender, dept_id)
VALUES (101, 'Arun', 20, 'arun@email.com', 'Male', 1);

-- Step 8
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (102, 'Priya', 21, 'priya@email.com', 2);

-- Step 9
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (103, NULL, 22, 'test1@email.com', 1);

-- Step 10
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (104, 'Kumar', 23, 'arun@email.com', 1);

-- Step 11
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (101, 'Ravi', 22, 'ravi@email.com', 1);

-- Step 12
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (105, 'Sita', 35, 'sita@email.com', 1);

-- Step 13
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (106, 'Meena', 20, 'meena@email.com', 9);

-- Step 14
ALTER TABLE Student
ADD CONSTRAINT chk_name CHECK (LENGTH(name) >= 3);

-- Step 15
ALTER TABLE Student
DROP CHECK chk_name;

-- Step 16
DESC Student;

-- RESULT
-- The tables enforce the specified constraints, apply default values, and reject the demonstrated invalid records.
