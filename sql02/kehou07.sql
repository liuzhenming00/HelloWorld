SELECT NOW(),SYSDATE(),CURRENT_TIMESTAMP(),LOCALTIME(),CURDATE()
FROM DUAL;

SELECT employee_id,last_name,salary,salary * 1.2 "new salary"
FROM employees;

SELECT last_name,LENGTH(last_name)
FROM employees
ORDER BY last_name ;

SELECT CONCAT(employee_id,',',last_name,',',salary) "out_put"
FROM employees;

SELECT employee_id, DATEDIFF(CURDATE(),hire_date) / 365 "work_years",DATEDIFF(CURDATE(),hire_date) "WORK_days"
FROM employees
ORDER BY work_years DESC;

SELECT last_name,hire_date,department_id
FROM employees
WHERE department_id IN(80,90,100)
AND commission_pct is not NULL
-- AND hire_date > '1997-01-01';
-- AND DATE_FORMAT(hire_date,'%Y-%m-%d') >= '1997-01-01';
AND hire_date >= STR_TO_DATE('1997-01-01','%Y-%m-%d');

SELECT last_name,hire_date
FROM employees
WHERE DATEDIFF(CURDATE(),hire_date) >= 1000;

SELECT CONCAT(last_name,'earns',TRUNCATE(salary,0),'monthly but wants',TRUNCATE(salary * 3,0)) "dream_salary"
FROM employees;

SELECT last_name "last_name",job_id "job_id",case job_id WHEN 'AD_PRES' THEN 'A'
																												 WHEN 'ST_MAN' THEN 'B'
																												 WHEN 'IT_PROG' THEN 'C'
																												 WHEN 'SA_REP' THEN 'D'
																												 WHEN 'ST_CLERK' THEN 'E'
																												 ELSE 'define'
																												 END "GRADE"
FROM employees;																							 





