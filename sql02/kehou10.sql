CREATE DATABASE IF NOT EXISTS testdb01_library CHARACTER SET 'utf8';
USE testdb01_library;
CREATE TABLE books(
id   INT,
NAME VARCHAR(50),
AUTHORS VARCHAR(100),
price FLOAT,
pubdate YEAR,
note VARCHAR(100),
num INT
);
DESC books;
SELECT * FROM books;
INSERT INTO books 
VALUES(1,'tal of AAA ','Dickes',23,'1995','novel',11);

INSERT INTO books(id,NAME,AUTHORS,price,pubdate,note,num)
VALUES (2,'EmmaT','jane lura',35,'1993','joke',22);

INSERT into books(id,NAME,AUTHORS,price,pubdate,note,num)
VALUES
(3,'Emma','jane lura',35,'1993','novel',22),
(4,'Emm','jane lura',35,'1993','novel',22),
(5,'Em','jane lura',35,'1993','joke',22),
(6,'E','jane lura',35,'1993','joke',22),
(7,'EE','jane lura',35,'1993','joke',22);
UPDATE books 
SET price = price + 5
WHERE note = 'novel';

UPDATE books 
SET price = 40,note = 'drama'
WHERE NAME = 'EmmaT';

DELETE FROM books 
WHERE num = 11;

SELECT COUNT(*),SUM(num)
FROM books 
WHERE NAME LIKE '%a%';

SELECT *
FROM books 
ORDER BY num DESC, note ;

SELECT COUNT(*),note 
FROM books 
GROUP BY note;

SELECT note,SUM(num)
FROM books 
GROUP BY note 
HAVING SUM(num) > 30;

SELECT *
FROM books 
LIMIT 5,5;

SELECT note,SUM(num)
FROM books 
GROUP BY note 
ORDER BY SUM(num) DESC
limit 0,1



SELECT NAME
FROM books 
WHERE  CHAR_LENGTH(REPLACE(NAME,' ','')) >= 10;


SELECT NAME "书名",num "库存",case WHEN num > 30 THEN '滞销'
											WHEN num >0 AND num < 10 THEN '畅销'
											WHEN num = 0 THEN '无货'
											ELSE '正常'
											END "显示正常"
FROM books;

SELECT  IFNULL(note,'合计'),SUM(num)
FROM books 
GROUP BY note WITH ROLLUP;

SELECT note,count(*)
FROM books 
GROUP BY note WITH ROLLUP;  

SELECT *
FROM books 
ORDER BY num DESC
limit 0,3;

SELECT *
FROM books 
ORder BY pubdate
LIMIT 0,1;

SELECT *
FROM books 
WHERE note = 'novel'
ORDER BY price  DESC
LIMIT 0,1;

SELECT *
FROM books 
ORDER BY CHAR_LENGTH(REPLACE(NAME,' ','')) DESC
LIMIT 0,1;



