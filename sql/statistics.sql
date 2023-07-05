
SELECT COUNT(*) FROM student
WHERE math > 80
SELECT COUNT(*) FROM student
WHERE (math+ chinese + enlish) >250
CREATE TABLE t8(
NAME VARCHAR(20))
INSERT INTO t7 VALUES('tom');
INSERT INTO t7 VALUES('jack');
INSERT INTO t7 VALUES('mary');
INSERT INTO t7 VALUES(NULL);
SELECT * FROM t7
SELECT COUNT(*) FROM t7
SELECT COUNT(NAME) FROM t7
SELECT SUM(math) FROM student
SELECT SUM(math)AS math_tatal_score, SUM(enlish),SUM(chinese) FROM student
SELECT SUM(math + chinese + enlish) FROM student
SELECT SUM(chinese) / COUNT(*) FROM student;

SELECT AVG(math + chinese+enlish)FROM student;
SELECT MAX(math + enlish + chinese),MIN(math+enlish+chinese) FROM student;
SELECT MAX(math)AS high_score,MIN(math)AS low_score FROM student;
