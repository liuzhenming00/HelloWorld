CREATE DATABASE test04_emp;

use test04_emp;

CREATE TABLE emp2(
id INT,
emp_name VARCHAR(15)
);

CREATE TABLE dept2(
id INT,
dept_name VARCHAR(15)
);

ALTER TABLE emp2
ADD CONSTRAINT PRIMARY KEY(id);

ALTER TABLE dept2 
ADD PRIMARY KEY(id);

ALTER TABLE emp2
ADD dept_id INT;

DESC emp2;

ALTER TABLE emp2 
ADD CONSTRAINT fk_emp2_deptid FOREIGN KEY(dept_id) REFERENCES dept2(id);

use testdb01_library;
 
 DESC books;

ALTER TABLE books 
ADD PRIMARY KEY(id);

ALTER TABLE books 
MODIFY id INT auto_increment;

ALTER TABLE books 
MODIFY NAME VARCHAR(50) NOT NULL;

ALTER TABLE books 
MODIFY AUTHORS VARCHAR(100) NOT NULL;

ALTER TABLE books 
MODIFY price FLOAT NOT NULL;

ALTER TABLE books 
MODIFY pubdate YEAR NOT NULL;

ALTER TABLE books 
MODIFY num INT NOT NULL;

CREATE DATABASE IF NOT EXISTS test04_company CHARACTER SET 'utf8';

USE test04_company;

CREATE TABLE IF NOT EXISTS offices(
officeCode INT(10) PRIMARY KEY,
city VARCHAR(50) NOT NULL,
address VARCHAR(50),
county VARCHAR(50) NOT NULL,
postalCode VARCHAR(15) UNIQUE

);

DESC offices;

CREATE TABLE employees(
employeeNumber INT PRIMARY KEY auto_increment,
lastName VARCHAR(50) NOT NULL,
firstName VARCHAR(50) NOT NULL,
mobile VARCHAR(25) UNIQUE,
officeCode INT(10)  NOT NULL,
jobTitle VARCHAR(50) NOT NULL,
birth DATETIME NOT NULL,
note VARCHAR(255),
sex VARCHAR(5),
CONSTRAINT fk_emp_offcode FOREIGN KEY (officeCode) REFERENCES offices(officeCode)
);

DESC employees;

ALTER TABLE employees
MODIFY  mobile VARCHAR(25) AFTER officeCode ;

ALTER table employees
CHANGE  birth employee_birth DATETIME;

ALTER TABLE employees
MODIFY sex CHAR(1) NOT NULL;

ALTER TABLE employees
ADD favoriate_activity VARCHAR(100);

RENAME TABLE employees
TO employees_info;

DESC employees_info;



