CREATE DATABASE test15_pro_func;
USE test15_pro_func;

CREATE TABLE admin(
id INT PRIMARY KEY auto_increment,
user_name VARCHAR(15) NOT NULL,
pwd VARCHAR(25) NOT NULL
);

delimiter $
CREATE PROCEDURE INSERT_user(IN user_name VARCHAR(15),IN pwd VARCHAR(25))
BEGIN
			INSERT INTO admin(user_name,pwd)
			VALUES(user_name,pwd);

END $

delimiter;

CALL INSERT_user('Tom','abc123');

SELECT * FROM admin;

CREATE TABLE beauty(
id INT PRIMARY KEY auto_increment,
NAME  VARCHAR(15) NOT NULL,
phone  VARCHAR(15) UNIQUE,
birth DATE
);

INSERT into beauty (NAME,phone,birth)
VALUES
('朱茵','13256674655','1989-03-04'),
('孙燕姿','1322245655','1949-05-04'),
('反发','1328989655','1988-12-07'),
('网点','1325345655','1957-12-23'),
('弹语音','165676674655','1987-02-24'),
('让人','14568574655','1984-02-23');

SELECT * FROM beauty;

delimiter// 
CREATE PROCEDURE get_phone(IN id INT,out NAME VARCHAR(15),OUT phone VARCHAR(15))

BEGIN
			SELECT b.NAME,b.phone INTO NAME,phone
			FROM beauty b 
			WHERE b.id = id;
END//
delimiter;

CALL get_phone(1,@name,@phone);
SELECT @name,@phone;

delimiter // 
CREATE PROCEDURE date_diff(IN birth1 DATE,IN birth2 DATE,OUT sum_date INT )

BEGIN
			SELECT DATEDIFF(birth1,birth2) INTO sum_date;
			
END //
delimiter;

CALL date_diff('1989-03-04','1949-05-04',@sum_date);
SELECT @sum_date;

delimiter//
CREATE PROCEDURE date_format (IN my_date DATE,OUT str_date VARCHAR(25))
BEGIN
			SELECT DATE_FORMAT(my_date,'%Y年%m月%d日')INTO str_date;
END//
delimiter;

CALL date_format('1993-03-22',@str_date);
SELECT @str_date;

delimiter//
CREATE PROCEDURE beauty_limit (IN start_index INT,IN size INT)
BEGIN
			SELECT * FROM beauty LIMIT start_index,size;
END//
delimiter;

CALL beauty_limit(1,3);

DELIMITER//
CREATE PROCEDURE add_double(INOUT a INT,INOUT b INT)
BEGIN
			SET a = a * 2;
			SET b = b * 2;
END//
DELIMITER;

 SET @a = 3, @b = 5;
CALL add_double(@a,@b);
SELECT @a,@b;

DROP PROCEDURE IF EXISTS beauty_limit;

SHOW CREATE PROCEDURE add_double;

USE test15_pro_func;

CREATE TABLE employees
AS
SELECT * FROM atguigudb.employees;

CREATE TABLE departments 
AS
SELECT * FROM atguigudb.departments;

delimiter $
SET GLOBAL log_bin_trust_function_creators = 1;
CREATE FUNCTION get_count()
RETURNS INT
BEGIN
			RETURN (SELECT count(*) FROM employees);
END $
delimiter;

SELECT get_count();

delimiter//
CREATE FUNCTION ename_salary(emp_name VARCHAR(15))
RETURNS DOUBLE
BEGIN
			RETURN (SELECT salary FROM employees WHERE last_name = emp_name);
END//
delimiter;

SELECT ename_salary('Abel');

delimiter//
CREATE FUNCTION dept_sal(dept_name VARCHAR(15))
RETURNS DOUBLE
BEGIN
			RETURN(SELECT avg(salary) 
							FROM employees e JOIN departments d 
							ON e.department_id = d.department_id
							WHERE d.department_name = dept_name);
END//
delimiter;

SELECT dept_sal('Marketing');

delimiter//
CREATE FUNCTION add_float(value1 FLOAT,value2 FLOAT)
RETURNS FLOAT
BEGIN
			RETURN(SELECT value1+value2);
END//
delimiter;

SELECT add_float (12.2,2.3);






