CREATE TABLE department (
	departmentid VARCHAR(32) PRIMARY KEY,
	deptname VARCHAR(32) UNIQUE NOT NULL
	)
	
CREATE TABLE class(
	classid INT PRIMARY KEY,
	SUBJECT VARCHAR(32)NOT NULL DEFAULT '',
	deptname VARCHAR(32),
	enrolltime INT NOT NULL DEFAULT 2000,
	num INT NOT NULL DEFAULT 0,
	FOREIGN KEY(deptname) REFERENCES department(deptname)
	)
	
CREATE TABLE student (
	`studentid` INT PRIMARY KEY,
	`name` VARCHAR(32) NOT NULL DEFAULT '',
	`age` INT NOT NULL DEFAULT 0,
	`classid` INT,
	FOREIGN KEY(classid) REFERENCES `class`(classid)
	)
	
INSERT INTO department VALUES('001','数学');
INSERT INTO department VALUES('002','计算机');
INSERT INTO department VALUES('003','化学');
INSERT INTO department VALUES('004','中文');
INSERT INTO department VALUES('005','经济');

INSERT INTO class VALUES('101','软件','计算机',1995,20);
INSERT INTO class VALUES('102','微电子','计算机',1995,20);
INSERT INTO class VALUES('103','无机化学','化学',1995,20);
INSERT INTO class VALUES('104','高分子化学','化学',1995,20);
INSERT INTO class VALUES('105','统计数学','数学',1995,20);
INSERT INTO class VALUES('106','现代语言','中文',1995,20);
INSERT INTO class VALUES('107','国际贸易','经济',1995,20);
INSERT INTO class VALUES('108','国际金融','经济',1995,20);

INSERT INTO student VALUES(8101,'张',18,101);
INSERT INTO student VALUES(8102,'钱',16,121);
INSERT INTO student VALUES(8103,'王',17,131);
INSERT INTO student VALUES(8105,'李',19,102);
INSERT INTO student VALUES(8109,'赵',18,141);
INSERT INTO student VALUES(8110,'李',20,142);
INSERT INTO student VALUES(8201,'张',18,111);
INSERT INTO student VALUES(8302,'周',16,112);
INSERT INTO student VALUES(8203,'王',17,111);
INSERT INTO student VALUES(8305,'董',19,102);
INSERT INTO student VALUES(8409,'赵',18,101);

SELECT * FROM department
SELECT * FROM class
SELECT * FROM student

SELECT * FROM student
	WHERE NAME LIKE '王%'
	
SELECT COUNT(*) AS num,deptname
	FROM class
	GROUP BY deptname
	HAVING num > 1
	
SELECT SUM(num) AS num,deptname
	FROM CLASS
	GROUP BY deptname
	HAVING num >= 30
	
SELECT tmp.*,department.`departmentid`
	FROM department,(
	SELECT SUM(num) AS num,deptname
	FROM CLASS
	GROUP BY deptname
	HAVING num >= 30
	)tmp
	where department.deptname = tmp.deptname
	

INSERT INTO department VALUES('006','物理系');



	