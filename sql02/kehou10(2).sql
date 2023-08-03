CREATE DATABASE test01_office CHARACTER SET 'utf8';
USE test01_office;

CREATE TABLE if NOT EXISTS dept01(
id INT(7),
NAME VARCHAR(25)
);

CREATE TABLE dept02 
AS
SELECT *
FROM atguigudb.departments;

CREATE TABLE emp01(
id INT(7),
first_name VARCHAR(25),
last_name VARCHAR(25),
dept_id INT(7)
);

DESC emp01

ALTER TABLE emp01 
MODIFY last_name VARCHAR(50);

CREATE TABLE emp02 
AS
SELECT *
FROM atguigudb.employees;

SHOW TABLES

DROP TABLE emp01;

RENAME TABLE emp02 TO emp01;

ALTER TABLE emp01 ADD test_column VARCHAR(10);

DESC emp01

ALTER TABLE dept02 ADD test_column VARCHAR(10);

DESC dept02

ALTER TABLE emp01 
DROP COLUMN department_id;

CREATE DATABASE test02_market CHARACTER SET 'utf8';

USE test02_market;

SHOW CREATE DATABASE test02_market;

CREATE TABLE customers (
c_num INT,
c_name VARCHAR(50),
c_contact VARCHAR(50),
c_city VARCHAR(50),
c_birth DATE
);

SHOW TABLES

DESC customers;

ALTER TABLE customers 
MODIFY c_contact VARCHAR(50) AFTER c_birth;

ALTER TABLE customers
MODIFY c_name VARCHAR(70);

ALTER TABLE customers 
CHANGE c_contact c_phone VARCHAR(50);

ALTER TABLE customers 
ADD c_gender CHAR(1) AFTER c_name;

RENAME TABLE customers 
to  customers_info;
test01_office

DESC customers_info;

ALTER  TABLE customers_info
DROP COLUMN c_city;

CREATE DATABASE test03_company CHARACTER SET 'utf8'

use test03_company;

CREATE TABLE offices (
officeCode INT,
city VARCHAR(30),
address VARCHAR(50),
country VARCHAR(50),
postalCode VARCHAR(25)
);

DESC offices;

CREATE TABLE employees(
empNum INT,
lastName VARCHAR(50),
firstName  VARCHAR(50),
mobile VARCHAR(25),
code INT,
jobTitle VARCHAR(50),
birth date,
note VARCHAR(255),
sex VARCHAR(5)
);
DESC employees;

ALTER TABLE employees 
MODIFY mobile VARCHAR(20) AFTER code;

ALTER TABLE employees 
CHANGE birth birthday DATE;

ALTER TABLE employees 
MODIFY sex char(1);

ALTER  TABLE employees 
DROP COLUMN note;

ALTER TABLE employees 
ADD favorite_activity VARCHAR(100);

RENAME TABLE employees to employees_info;












