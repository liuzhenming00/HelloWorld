CREATE TABLE actor(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(32) NOT NULL DEFAULT '',
	sex CHAR(1) NOT NULL DEFAULT '女',
	borndate DATETIME,
	phone VARCHAR(12)
	)
SELECT * FROM actor

INSERT INTO actor
	VALUES (NULL, '刘德华','男','1970-11-11','110')
INSERT INTO actor
	VALUES (NULL, 'jack','男','1990-11-11','112')


CREATE TABLE ACCOUNT(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(32) NOT NULL DEFAULT'',
	balance DOUBLE NOT NULL DEFAULT 0)CHARACTER SET utf8
	
INSERT INTO ACCOUNT VALUES(NULL,'马云',3000);
INSERT INTO ACCOUNT VALUES(NULL,'马化腾',10000);
SELECT * FROM ACCOUNT






