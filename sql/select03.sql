SELECT * FROM student
WHERE NAME = '赵云'
SELECT * FROM student
WHERE enlish > 80
SELECT * FROM student
WHERE (enlish + math + chinese)>200
SELECT * FROM student
WHERE math>60 AND  id>2
SELECT * FROM student
WHERE enlish > chinese
SELECT * FROM student
WHERE (chinese + math + enlish) > 200 AND math < chinese AND NAME LIKE '关%'
SELECT * FROM student
WHERE enlish BETWEEN 70 AND 90
SELECT * FROM student
WHERE math IN (69,78,78)
SELECT * FROM student
WHERE NAME LIKE '韩%'
SELECT * FROM student 
WHERE math > 80 AND chinese > 80