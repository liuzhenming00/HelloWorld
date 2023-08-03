CREATE DATABASE  dbtest17;
USE dbtest17;
CREATE TABLE test_trigger (
id INT PRIMARY KEY auto_increment,
t_note VARCHAR(30)
);

CREATE TABLE test_trigger_log (
id INT PRIMARY KEY auto_increment,
t_log VARCHAR(30)
);

SELECT * FROM test_trigger;
SELECT *FROM test_trigger_log;

delimiter//
CREATE TRIGGER before_insert_test_tri
BEFORE INSERT ON test_trigger
FOR each ROW
BEGIN
				INSERT INTO test_trigger_log(t_log)
				VALUES('before insert...');
END//
delimiter;

INSERT INTO test_trigger(t_note)
VALUES('Tom...');

SELECT * FROM test_trigger;
SELECT * FROM test_trigger_log;

delimiter//
CREATE TRIGGER after_insert 
AFTER INSERT ON test_trigger
FOR EACH ROW
BEGIN
			INSERT INTO test_trigger_log (t_log)
			VALUES('AFTER ....');
END//

delimiter;

SELECT * FROM test_trigger;
SELECT * FROM test_trigger_log;
INSERT INTO test_trigger(t_note)
VALUES('jerry...');

CREATE TABLE employees
AS
SELECT * FROM atguigudb.employees;

CREATE TABLE departments
AS
SELECT * FROM atguigudb.departments;

DESC employees;

delimiter//
CREATE TRIGGER salary_check_trigger
BEFORE INSERT ON employees
FOR EACH ROW
BEGIN
			DECLARE mgr_sal DOUBLE;
			SELECT salary INTO mgr_sal FROM employees 
			WHERE employee_id = new.manager_id;
			IF new.salary > mgr_sal		
									THEN SIGNAL SQLSTATE 'HY000' SET message_text= '薪资高于领导薪资错误';
			END if;
END//
delimiter;

INSERT INTO employees (employee_id,last_name,email,hire_date,job_id,salary,manager_id)
VALUES(300,'Tom','tom@126.com',CURDATE(),'AD_VP',8000,103); 
DESC employees;
SELECT * FROM employees;

INSERT INTO employees (employee_id,last_name,email,hire_date,job_id,salary,manager_id)
VALUES(301,'Tom1','to1m@126.com',CURDATE(),'AD_VP',10000,103); 













