select last_name,department_id,salary * 12 annual_salary
FROM employees
ORDER BY annual_salary DESC,last_name;

SELECT last_name,salary
FROM employees
WHERE salary not BETWEEN 8000 AND 17000
ORDER BY salary DESC
LIMIT 20,20;

SELECT employee_id,last_name,email,department_id
FROM employees
WHERE email like '%e%'
ORDER BY LENGTH(email) DESC,department_id;





