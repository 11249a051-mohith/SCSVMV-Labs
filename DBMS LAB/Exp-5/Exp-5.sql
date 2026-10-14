-- Experiment 5 — ANY, ALL, IN, EXISTS and set operations
--
-- AIM
-- To retrieve related data using ANY, ALL, IN, EXISTS, NOT EXISTS, UNION, UNION ALL, INTERSECT, and EXCEPT, and demonstrate integrity constraints.
--
-- PROGRAM
-- Environment: MySQL 8.0.31 or later.
--
-- Run the final four constraint-violation INSERT statements individually; they intentionally fail.

-- Step 1
CREATE DATABASE IF NOT EXISTS DBMS_EXP5;

-- Step 2
USE DBMS_EXP5;

-- Step 3
CREATE TABLE Department ( dept_id     INT PRIMARY KEY, dept_name   VARCHAR(50) NOT NULL UNIQUE);

-- Step 4
CREATE TABLE Student ( roll_no     INT PRIMARY KEY,
    name        VARCHAR(50) NOT NULL,
    age         INT CHECK (age >= 17 AND age <= 30),
    email       VARCHAR(50) UNIQUE,
    gender      VARCHAR(20) DEFAULT 'Not Specified',
    dept_id     INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

-- Step 5
CREATE TABLE Course ( course_id   INT PRIMARY KEY,
    course_name VARCHAR(50) NOT NULL,
    credits     INT CHECK (credits BETWEEN 1 AND 6),
    dept_id     INT,
    FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
);

-- Step 6
CREATE TABLE Enrollment ( roll_no     INT, course_id   INT,
    marks       INT CHECK (marks BETWEEN 0 AND 100),
    PRIMARY KEY (roll_no, course_id),
    FOREIGN KEY (roll_no) REFERENCES Student(roll_no),
    FOREIGN KEY (course_id) REFERENCES Course(course_id)
);

-- Step 7
INSERT INTO Department VALUES
(1, 'Computer Science'), (2, 'Electronics'), (3, 'Mechanical');

-- Step 8
INSERT INTO Student (roll_no, name, age, email, gender, dept_id) VALUES
(101, 'Arun',  20, 'arun@email.com',  'Male',   1),
(102, 'Priya', 21, 'priya@email.com', 'Female', 2),
(103, 'Kumar', 22, 'kumar@email.com', 'Male',   1),
(104, 'Sita',  19, 'sita@email.com',  'Female', 3),
(105, 'Meena', 23, 'meena@email.com', 'Female', 2);

-- Step 9
INSERT INTO Course (course_id, course_name, credits, dept_id) VALUES
(1, 'Data Structures', 4, 1),
(2, 'Digital Circuits', 3, 2),
(3, 'Thermodynamics',  4, 3),
(4, 'DBMS',   4, 1);

-- Step 10
INSERT INTO Enrollment (roll_no, course_id, marks) VALUES
(101, 1, 85), (101, 4, 78),
(102, 2, 60), (102, 4, 55),
(103, 1, 90), (103, 4, 88),
(104, 3, 70),
(105, 2, 45);

-- Step 11
SELECT name, dept_id
FROM Student
WHERE dept_id IN (
    SELECT dept_id FROM Department
    WHERE dept_name IN ('Computer Science', 'Mechanical')
);

-- Step 12
SELECT name
FROM Student
WHERE roll_no NOT IN (
    SELECT roll_no FROM Enrollment WHERE course_id = 4
);

-- Step 13
SELECT DISTINCT s.name, e.marks
FROM Student s
JOIN Enrollment e ON s.roll_no = e.roll_no
WHERE e.marks > ANY (
    SELECT marks FROM Enrollment WHERE course_id = 2);

-- Step 14
SELECT DISTINCT dept_id
FROM Course
WHERE credits = ANY (
    SELECT credits FROM Course WHERE dept_id = 1
);

-- Step 15
SELECT DISTINCT s.name, e.marks
FROM Student s
JOIN Enrollment e ON s.roll_no = e.roll_no
WHERE e.marks > ALL (
    SELECT marks FROM Enrollment WHERE course_id = 2
);

-- Step 16
SELECT course_name, credits
FROM Course
WHERE credits >= ALL (
    SELECT credits FROM Course
    WHERE dept_id = (SELECT dept_id FROM Department WHERE dept_name = 'Electronics')
);

-- Step 17
SELECT dept_name
FROM Department d
WHERE EXISTS (
    SELECT 1 FROM Student s WHERE s.dept_id = d.dept_id
);

-- Step 18
SELECT name
FROM Student s
WHERE NOT EXISTS (
    SELECT 1 FROM Enrollment e WHERE e.roll_no = s.roll_no
);

-- Step 19
SELECT dept_name
FROM Department d
WHERE NOT EXISTS (
    SELECT 1 FROM Course c WHERE c.dept_id = d.dept_id
);

-- Step 20
SELECT roll_no FROM Enrollment WHERE course_id = 4 AND marks > 80
UNION
SELECT roll_no FROM Enrollment WHERE course_id = 1 AND marks > 80;

-- Step 21
SELECT roll_no FROM Enrollment WHERE course_id = 4 AND marks > 80
UNION ALL
SELECT roll_no FROM Enrollment WHERE course_id = 1 AND marks > 80;

-- Step 22
SELECT roll_no FROM Enrollment WHERE course_id = 1
INTERSECT
SELECT roll_no FROM Enrollment WHERE course_id = 4;

-- Step 23
SELECT roll_no FROM Enrollment WHERE course_id = 1
AND roll_no IN (SELECT roll_no FROM Enrollment WHERE course_id = 4);

-- Step 24
SELECT roll_no FROM Enrollment WHERE course_id = 1
EXCEPT
SELECT roll_no FROM Enrollment WHERE course_id = 4;

-- Step 25
SELECT roll_no FROM Enrollment WHERE course_id = 1
AND roll_no NOT IN (SELECT roll_no FROM Enrollment WHERE course_id = 4);

-- Step 26
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (106, NULL, 22, 'test1@email.com', 1);

-- Step 27
INSERT INTO Student (roll_no, name, age, email, dept_id)
VALUES (107, 'Ravi', 23, 'arun@email.com', 1);

-- Step 28
INSERT INTO Enrollment (roll_no, course_id, marks)
VALUES (101, 2, 150);

-- Step 29
INSERT INTO Enrollment (roll_no, course_id, marks)
VALUES (999, 1, 70);

-- RESULT
-- The queries demonstrate membership tests, quantified comparisons, existence tests, set operations, and integrity checks on related tables.
