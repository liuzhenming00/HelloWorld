CREATE TABLE my_class(
	id INT PRIMARY KEY,
	NAME VARCHAR(32) NOT NULL DEFAULT ''
	)
CREATE TABLE my_stu(
	id INT PRIMARY KEY,
	NAME VARCHAR(32) NOT NULL DEFAULT '',
	class_id INT,
	FOREIGN KEY (class_id) REFERENCES my_class(id)
	)
INSERT INTO my_class
	VALUES(100,'java'),(200,'web'),(300,'jsop');
SELECT * FROM my_class
INSERT INTO my_stu
	VALUES(1,'tom',100),(2,'jack',200)
SELECT *  FROM my_stu
INSERT INTO  my_stu
	VALUES(3,'hsp',300)
INSERT INTO  my_stu
	VALUES(4,'hp',NULL)