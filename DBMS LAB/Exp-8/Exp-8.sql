-- Experiment 8 — Normalization from 1NF to 5NF
--
-- AIM
-- To create normalized Oracle tables for 1NF, 2NF, 3NF, 4NF, and 5NF and verify their relationships.
--
-- PROGRAM
-- Environment: Oracle Database / SQL*Plus.
--
-- Run in a fresh Oracle schema. The 2NF example assumes Course determines Faculty. The 4NF example assumes courses and languages are independent. The 5NF example assumes the three pairwise projections form a lossless join.

-- Step 1
CREATE TABLE StudentCourse_1NF (
    SID           VARCHAR2(10),
    SName         VARCHAR2(30),
    Course        VARCHAR2(20),
    Faculty       VARCHAR2(30),
    FacultyPhone  VARCHAR2(15),
    Dept          VARCHAR2(10),
    HOD           VARCHAR2(30),
    CONSTRAINT pk_1nf PRIMARY KEY (SID, Course)
);

-- Step 2
INSERT INTO StudentCourse_1NF VALUES ('S1','Arun','DBMS','Ravi','9990001','CSE','Dr. Sharma');

-- Step 3
INSERT INTO StudentCourse_1NF VALUES ('S1','Arun','OS','Meena','9990002','CSE','Dr. Sharma');

-- Step 4
INSERT INTO StudentCourse_1NF VALUES ('S2','Bala','DBMS','Ravi','9990001','CSE','Dr. Sharma');

-- Step 5
COMMIT;

-- Step 6
SELECT * FROM StudentCourse_1NF;

-- Step 7
CREATE TABLE Student (
    SID    VARCHAR2(10) PRIMARY KEY,
    SName  VARCHAR2(30)
);

-- Step 8
CREATE TABLE Course_Faculty (
    Course        VARCHAR2(20) PRIMARY KEY,
    Faculty       VARCHAR2(30),
    FacultyPhone  VARCHAR2(15),
    Dept          VARCHAR2(10),
    HOD           VARCHAR2(30)
);

-- Step 9
CREATE TABLE Enrollment (
    SID     VARCHAR2(10),
    Course  VARCHAR2(20),
    PRIMARY KEY (SID, Course),
    FOREIGN KEY (SID) REFERENCES Student(SID),
    FOREIGN KEY (Course) REFERENCES Course_Faculty(Course)
);

-- Step 10
INSERT INTO Student VALUES ('S1','Arun');

-- Step 11
INSERT INTO Student VALUES ('S2','Bala');

-- Step 12
INSERT INTO Course_Faculty VALUES ('DBMS','Ravi','9990001','CSE','Dr. Sharma');

-- Step 13
INSERT INTO Course_Faculty VALUES ('OS','Meena','9990002','CSE','Dr. Sharma');

-- Step 14
INSERT INTO Enrollment VALUES ('S1','DBMS');

-- Step 15
INSERT INTO Enrollment VALUES ('S1','OS');

-- Step 16
INSERT INTO Enrollment VALUES ('S2','DBMS');

-- Step 17
COMMIT;

-- Step 18
CREATE TABLE Department (
    Dept  VARCHAR2(10) PRIMARY KEY,
    HOD   VARCHAR2(30)
);

-- Step 19
CREATE TABLE Faculty_Dept (
    Faculty       VARCHAR2(30) PRIMARY KEY,
    FacultyPhone  VARCHAR2(15),
    Dept          VARCHAR2(10),
    FOREIGN KEY (Dept) REFERENCES Department(Dept)
);

-- Step 20
CREATE TABLE Course_3NF (
    Course   VARCHAR2(20) PRIMARY KEY,
    Faculty  VARCHAR2(30),
    FOREIGN KEY (Faculty) REFERENCES Faculty_Dept(Faculty)
);

-- Step 21
INSERT INTO Department VALUES ('CSE','Dr. Sharma');

-- Step 22
INSERT INTO Faculty_Dept VALUES ('Ravi','9990001','CSE');

-- Step 23
INSERT INTO Faculty_Dept VALUES ('Meena','9990002','CSE');

-- Step 24
INSERT INTO Course_3NF VALUES ('DBMS','Ravi');

-- Step 25
INSERT INTO Course_3NF VALUES ('OS','Meena');

-- Step 26
COMMIT;

-- Step 27
SELECT c.Course, f.Faculty, f.FacultyPhone, f.Dept, d.HOD
FROM Course_3NF c
JOIN Faculty_Dept f ON c.Faculty = f.Faculty
JOIN Department d ON f.Dept = d.Dept;

-- Step 28
CREATE TABLE Faculty_Course (
    Faculty  VARCHAR2(30),
    Course   VARCHAR2(20),
    PRIMARY KEY (Faculty, Course)
);

-- Step 29
CREATE TABLE Faculty_Language (
    Faculty   VARCHAR2(30),
    Language  VARCHAR2(20),
    PRIMARY KEY (Faculty, Language)
);

-- Step 30
INSERT INTO Faculty_Course VALUES ('Ravi','DBMS');

-- Step 31
INSERT INTO Faculty_Course VALUES ('Ravi','OS');

-- Step 32
INSERT INTO Faculty_Language VALUES ('Ravi','English');

-- Step 33
INSERT INTO Faculty_Language VALUES ('Ravi','Hindi');

-- Step 34
COMMIT;

-- Step 35
CREATE TABLE Faculty_Course_5NF (
    Faculty  VARCHAR2(30),
    Course   VARCHAR2(20),
    PRIMARY KEY (Faculty, Course)
);

-- Step 36
CREATE TABLE Course_Textbook_5NF (
    Course     VARCHAR2(20),
    Textbook   VARCHAR2(30),
    PRIMARY KEY (Course, Textbook)
);

-- Step 37
CREATE TABLE Faculty_Textbook_5NF (
    Faculty    VARCHAR2(30),
    Textbook   VARCHAR2(30),
    PRIMARY KEY (Faculty, Textbook)
);

-- Step 38
INSERT INTO Faculty_Course_5NF VALUES ('Ravi','DBMS');

-- Step 39
INSERT INTO Faculty_Course_5NF VALUES ('Meena','OS');

-- Step 40
INSERT INTO Course_Textbook_5NF VALUES ('DBMS','Korth');

-- Step 41
INSERT INTO Course_Textbook_5NF VALUES ('DBMS','Navathe');

-- Step 42
INSERT INTO Course_Textbook_5NF VALUES ('OS','Silberschatz');

-- Step 43
INSERT INTO Faculty_Textbook_5NF VALUES ('Ravi','Korth');

-- Step 44
INSERT INTO Faculty_Textbook_5NF VALUES ('Ravi','Navathe');

-- Step 45
INSERT INTO Faculty_Textbook_5NF VALUES ('Meena','Silberschatz');

-- Step 46
COMMIT;

-- Step 47
SELECT fc.Faculty, fc.Course, ct.Textbook
FROM Faculty_Course_5NF fc
JOIN Course_Textbook_5NF ct ON fc.Course = ct.Course
JOIN Faculty_Textbook_5NF ft ON fc.Faculty = ft.Faculty AND ct.Textbook = ft.Textbook;

-- Step 48
SELECT table_name FROM user_tables;

-- Step 49
DESC Faculty_Dept;

-- Step 50
SELECT constraint_name, constraint_type, table_name
FROM user_constraints
WHERE table_name IN ('STUDENT','COURSE_3NF','FACULTY_DEPT','DEPARTMENT');

-- Step 51
SELECT a.table_name, a.column_name, c.constraint_type
FROM user_cons_columns a
JOIN user_constraints c ON a.constraint_name = c.constraint_name
WHERE c.constraint_type IN ('P','R')
ORDER BY a.table_name;

-- RESULT
-- The program demonstrates normalized table decompositions and reconstructs the supplied sample relationships using joins. The 5NF example assumes the stated join dependency; sample rows alone do not establish it for every possible dataset.
