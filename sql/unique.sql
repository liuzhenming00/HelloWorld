CREATE TABLE t11 (
	 id  INT UNIQUE,
	NAME VARCHAR(32),
	email VARCHAR(32)
	)
INSERT INTO t11
	VALUES(1,'jack','jack@sohu.com');
INSERT INTO t11
	VALUES(NULL,'tom','tom@sohu.com');
SELECT * FROM t11