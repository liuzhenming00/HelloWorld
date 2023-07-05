CREATE TABLE t9(
	id INT PRIMARY KEY,
	NAME VARCHAR(32),
	email VARCHAR(32))
DESC t9

INSERT INTO t9 
	VALUES ( 1, 'jack','jack@sohu.com');
INSERT INTO t9 
	VALUES (2,'tom','tom@sohu.com');
INSERT INTO t9 
	VALUES (3,'hsp','hsp@sohu.com');
SELECT * FROM t9;

CREATE TABLE t10(
	id INT ,
	NAME VARCHAR(32),
	email VARCHAR(32),
	PRIMARY KEY (id,NAME)
	)
INSERT INTO t10 
	VALUES(1,'tom','tom@sohu.com');
INSERT INTO t10 
	VALUES(1,'jack','tom@sohu.com');
	SELECT * FROM t10
DESC t10
	