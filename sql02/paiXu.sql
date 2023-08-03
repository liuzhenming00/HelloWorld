SELECT * FROM employees;

SELECT employee_id,last_name,salary
FROM employees
ORDER BY salary DESC;

SELECT employee_id,salary,salary * 12 annual_sal 
FROM employees
ORDER BY annual_sal;

SELECT employee_id,salary,department_id
FROM employees
ORDER BY department_id DESC,salary;

SELECT employee_id,last_name
FROM employees
LIMIT 20,20

 SELECT employee_id,last_name,salary
 FROM employees
 WHERE salary > 6000
 ORDER BY salary DESC
 LIMIT 0,10;

SELECT employee_id,last_name
FROM employees
LIMIT 31,2;

SELECT employee_id,last_name,salary
FROM employees
ORDER BY salary DESC
LIMIT 0,1














