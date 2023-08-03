SELECT last_name,salary
FROM employees
WHERE salary not BETWEEN 5000 AND 12000;

SELECT last_name,department_id
FROM employees
#WHERE department_id IN(20,50);
WHERE department_id =20 || department_id = 50;

SELECT last_name,job_id,manager_id
FROM employees
WHERE manager_id is NULL;

SELECT last_name,salary,commission_pct
FROM employees
WHERE commission_pct is not NULL;

SELECT last_name,salary,commission_pct
FROM employees
WHERE NOT commission_pct <=> NULL;

SELECT last_name
FROM employees
WHERE last_name LIKE '__a%';

SELECT last_name
FROM employees
-- WHERE last_name LIKE '%a%K%' || last_name like '%k%a%';
WHERE last_name LIKE '%a%' && last_name LIKE '%k%';

SELECT first_name,last_name
FROM employees
-- WHERE first_name REGEXP 'e$';
 WHERE first_name like '%e';
 
 SELECT last_name,job_id
 FROM employees
 WHERE department_id BETWEEN 80 and 100;

SELECT last_name,salary,manager_id
FROM employees
WHERE manager_id IN (100,101,110);




