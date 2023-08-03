USE test02_market

CREATE TABLE emps 
AS
SELECT * FROM atguigudb.employees;

DESC emps;

CREATE OR REPLACE VIEW emp_vl 
AS
SELECT last_name,salary,email 
FROM emps 
WHERE phone_number LIKE '011%';

CREATE OR REPLACE VIEW emp_vl 
AS
SELECT last_name,email,phone_number,salary 
FROM emps 
WHERE phone_number LIKE '011%'
AND email LIKE '%e%';

SELECT * FROM emp_vl;

SELECT *
FROM emp_vl

UPDATE emp_vl 
SET salary = salary + 1000;

DELETE FROM emp_vl
WHERE last_name='Olsen';

CREATE OR REPLACE VIEW emp_v2 
AS
SELECT department_id,max(salary)
FROM emps 
GROUP BY department_id
HAVING max(salary) > 12000;

SELECT * FROM emp_v2;

DROP VIEW IF EXISTS emp_vl,emp_v2;

show TABLES;

