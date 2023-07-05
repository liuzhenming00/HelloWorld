CREATE TABLE student(
id INT NOT NULL DEFAULT 1,
NAME VARCHAR(20) NOT NULL DEFAULT '',
chinese FLOAT NOT NULL DEFAULT 0.0,
enlish FLOAT NOT NULL DEFAULT 0.0,
math FLOAT NOT NULL DEFAULT 0.0
)
INSERT INTO student (id,NAME,chinese,enlish,math) VALUES (1,'韩顺平',89,78,40);
INSERT INTO student (id,NAME,chinese,enlish,math) VALUES (2,'张飞',69,78,40);
INSERT INTO student (id,NAME,chinese,enlish,math) VALUES (3,'宋江',49,58,80);
INSERT INTO student (id,NAME,chinese,enlish,math) VALUES (4,'关于',49,58,80);
INSERT INTO student (id,NAME,chinese,enlish,math) VALUES (5,'赵云',39,48,60);
INSERT INTO student (id,NAME,chinese,enlish,math) VALUES (6,'韩信',33,45,80);
SELECT * FROM student
SELECT id FROM student
SELECT NAME,enlish FROM student
SELECT DISTINCT enlish FROM student
SELECT DISTINCT id,NAME,chinese,enlish,math FROM student