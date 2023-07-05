SELECT IF(FALSE,'北京','上海')FROM DUAL
SELECT IFNULL (NULL,'上海')
SELECT * FROM student
CREATE TABLE stu(
	id INT,
	NAME VARCHAR(32));
INSERT INTO stu VALUES(1,'jack'),(2,'tom'),(3,'kity'),(4,'nono');
SELECT * FROM stu

CREATE TABLE exam(
	id INT,
	grade INT);
INSERT INTO exam VALUES(1,56),(2,76),(11,8);
SELECT * FROM exam

SELECT NAME,stu.id,grade
	FROM stu LEFT JOIN exam
	ON  stu.`id` = exam.`id`
	
	
	
	