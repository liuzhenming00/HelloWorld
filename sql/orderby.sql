SELECT * FROM student
ORDER BY math DESC
SELECT NAME,(math + enlish + chinese) AS total_score FROM student
ORDER BY total_score DESC
SELECT NAME , (math +enlish + chinese)AS total_score FROM student
WHERE NAME LIKE ('韩%')
ORDER BY total_score 