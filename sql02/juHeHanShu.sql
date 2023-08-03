SELECT MAX(salary) max_sal,min(salary) min_sal,AVG(salary) avg_sal, SUM(salary) Sum_sal
FROM employees;

SELECT job_id, MAX(salary),MIN(salary),AVG(salary),SUM(salary)
FROM employees
GROUP BY job_id;

SELECT job_id,COUNT(*)
FROM employees
GROUP BY job_id;

SELECT MAX(salary) - MIN(salary) "difference"
FROM employees;

SELECT manager_id, MIN(salary)
FROM employees
WHERE manager_id is not  NULL
GROUP BY manager_id
HAVING MIN(salary) > 6000;

SELECT d.department_name,d.location_id,COUNT(employee_id),AVG(salary)
FROM departments d LEFT JOIN employees e 
ON d.department_id = e.department_id
GROUP BY department_name,location_id

SELECT department_name,job_id,MIN(salary)
FROM departments d join employees e 
ON d.department_id = e.department_id
GROUP BY department_name,job_id


