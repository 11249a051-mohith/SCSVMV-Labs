-- Experiment 7 — Views, sequences, indexes and savepoints
--
-- AIM
-- To create and use a view, sequence, index, and savepoint in Oracle.
--
-- PROGRAM
-- Environment: Oracle Database / SQL*Plus.
--
-- Run in a fresh Oracle schema or one without these object names. Sequence values are consumed by each NEXTVAL call, including calls made before an INSERT.

-- Step 1
CREATE TABLE STUDENT (
    ROLLNO NUMBER(5) PRIMARY KEY,
    NAME VARCHAR2(30),
    DEPARTMENT VARCHAR2(20),
    MARKS NUMBER(3)
);

-- Step 2
INSERT INTO STUDENT VALUES (101, 'ARUN', 'CSE', 85);

-- Step 3
INSERT INTO STUDENT VALUES (102, 'PRIYA', 'ECE', 90);

-- Step 4
INSERT INTO STUDENT VALUES (103, 'KUMAR', 'CSE', 78);

-- Step 5
INSERT INTO STUDENT VALUES (104, 'DIVYA', 'IT', 88);

-- Step 6
INSERT INTO STUDENT VALUES (105, 'RAHUL', 'CSE', 92);

-- Step 7
COMMIT;

-- Step 8
CREATE VIEW CSE_STUDENTS AS
SELECT ROLLNO, NAME, MARKS
FROM STUDENT
WHERE DEPARTMENT = 'CSE';

-- Step 9
SELECT * FROM CSE_STUDENTS;

-- Step 10
DROP VIEW CSE_STUDENTS;

-- Step 11
CREATE SEQUENCE STUDENT_SEQ
START WITH 106
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Step 12
SELECT STUDENT_SEQ.NEXTVAL FROM DUAL;

-- Step 13
SELECT STUDENT_SEQ.NEXTVAL FROM DUAL;

-- Step 14
INSERT INTO STUDENT
VALUES (STUDENT_SEQ.NEXTVAL, 'SNEHA', 'CSE', 89);

-- Step 15
COMMIT;

-- Step 16
SELECT * FROM STUDENT;

-- Step 17
DROP SEQUENCE STUDENT_SEQ;

-- Step 18
CREATE INDEX IDX_STUDENT_NAME
ON STUDENT(NAME);

-- Step 19
SELECT * FROM STUDENT WHERE NAME = 'ARUN';

-- Step 20
DROP INDEX IDX_STUDENT_NAME;

-- Step 21
INSERT INTO STUDENT VALUES (106, 'MOHAN', 'IT', 80);

-- Step 22
SAVEPOINT SP1;

-- Step 23
INSERT INTO STUDENT VALUES (107, 'LATHA', 'ECE', 87);

-- Step 24
SELECT * FROM STUDENT;

-- Step 25
ROLLBACK TO SP1;

-- Step 26
COMMIT;

-- Step 27
SELECT * FROM STUDENT ORDER BY ROLLNO;

-- RESULT
-- The program demonstrates a filtered view, generated sequence values, an index, and partial transaction rollback using a savepoint.
