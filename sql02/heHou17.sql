CREATE DATABASE test16_var_cursor;

use test16_var_cursor;

CREATE TABLE employees
AS
SELECT * FROM atguigudb.employees;

CREATE TABLE departments
AS 
SELECT * FROM atguigudb.departments;

delimiter//
CREATE FUNCTION get_count()
RETURNS INT
BEGIN
			DECLARE emp_count INT;
			SELECT COUNT(*) INTO emp_count FROM employees;
			RETURN emp_count;
END//
delimiter;

SELECT get_count();

delimiter//
CREATE FUNCTION ename_salary(emp_name VARCHAR(15))
RETURNS DOUBLE
BEGIN
		 SET @sal = 0;
		 SELECT salary INTO @sal FROM employees WHERE last_name = emp_name;
		 RETURN @sal;
END//
delimiter;
DROP FUNCTION ename_salary;
SELECT ename_salary('Abel');

SELECT @sal;

delimiter//
CREATE FUNCTION test_if_case(sorce DOUBLE)
RETURNS CHAR
BEGIN
			DECLARE sorce_level CHAR;
			IF sorce > 90
								THEN SET sorce_level = 'A';
			ELSEIF sorce > 80
								THEN SET sorce_level = 'B';
			ELSEIF sorce > 60
								THEN SET sorce_level = 'C';
			ELSE
								SET sorce_level = 'D';
			END IF;
			RETURN sorce_level;
END//
delimiter;
DROP FUNCTION test_if_case;
SELECT test_if_case(60);


delimiter//
CREATE FUNCTION test_if_case2(sorce DOUBLE)
RETURNS CHAR
BEGIN
			DECLARE sorce_level CHAR;
			case
			WHEN sorce > 90
								THEN SET sorce_level = 'A';
			WHEN sorce > 80
								THEN SET sorce_level = 'B';
			WHEN sorce > 60
								THEN SET sorce_level = 'C';
			ELSE
								SET sorce_level = 'D';
			END case;
			RETURN sorce_level;
END//
delimiter;
SELECT test_if_case2(60);

delimiter//
CREATE PROCEDURE test_if_pro(in sal DOUBLE)
BEGIN
			IF sal < 3000
							THEN DELETE FROM employees WHERE salary = sal;
			ELSEIF sal <= 5000
							THEN UPDATE employees SET salary = salary + 1000 WHERE salary = sal;
			ELSE
							UPDATE employees SET salary = salary + 500 WHERE salary = sal;
			END IF;
			
END//
delimiter;
CALL test_if_pro(2900);

CREATE TABLE admin(
id INT PRIMARY KEY auto_increment,
use_name VARCHAR(25) not NULL,
user_pwd VARCHAR(35) NOT NULL
);
SELECT * FROM admin;

delimiter//
CREATE PROCEDURE insert_data(IN insert_count INT)
BEGIN
			DECLARE init_count INT DEFAULT 1;
			WHILE init_count <= insert_count DO
					INSERT into admin(use_name,user_pwd)VALUES (CONCAT('atguigu-',init_count),ROUND(RAND()*1000000));
					set init_count = init_count + 1;
					END WHILE;
		
END//
delimiter;
DROP PROCEDURE insert_data;
CALL insert_data(100);

delimiter//
CREATE PROCEDURE UPDATE_salary(IN dept_id INT,IN change_sal_count INT)
BEGIN
			DECLARE emp_id INT;
			DECLARE emp_hire_date DATE;
			DECLARE init_count INT DEFAULT 1;
			DECLARE add_sal_rate DOUBLE ;
			
			DECLARE emp_cursor CURSOR FOR SELECT employee_id,hire_date FROM employees
			WHERE department_id = dept_id ORDER BY salary ASC;
			
			OPEN emp_cursor;
			
			WHILE  init_count <= change_sal_count DO
				FETCH emp_cursor into emp_id ,emp_hire_date;
				IF(YEAR(emp_hire_date) < 1995)
													THEN SET add_sal_rate = 1.2;
				ELSEIF(YEAR(emp_hire_date) <= 1998)
													THEN SET add_sal_rate = 1.15;
				ELSEIF(YEAR(emp_hire_date) <= 2001)
													THEN SET add_sal_rate = 1.10;
				ELSE 
								SET add_sal_rate = 1.05;
				END IF;
		   	UPDATE employees SET salary = salary * add_sal_rate
		  	WHERE employee_id = emp_id;
			  SET init_count = init_count + 1;
     END WHILE;

		 CLOSE emp_cursor;

END//
delimiter;

CALL update_salary(50,2);














