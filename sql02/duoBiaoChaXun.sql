DESC employees;
desc departments;
DESC locations;

SELECT employee_id,department_name
FROM employees,departments
WHERE employees.department_id = departments.department_id;

SELECT emp.employee_id,dept.department_name,emp.department_id
FROM employees emp,departments dept
WHERE emp.department_id = dept.department_id

SELECT e.employee_id,e.last_name,d.department_name,l.city
FROM employees e,departments d,locations l
WHERE e.department_id = d.department_id 
&& d.location_id = l.location_id;

SELECT *
FROM job_grades;

SELECT e.last_name,e.salary,j.grade_level 
FROM employees e,job_grades j
WHERE e.salary BETWEEN j.lowest_sal and j.highest_sal

SELECT emp.employee_id,emp.last_name,mgr.employee_id,mgr.last_name
FROM employees emp,employees mgr
WHERE emp.manager_id = mgr.employee_id;

SELECT last_name,department_name
FROM employees e JOIN departments d
ON e.department_id = d.department_id;

SELECT last_name,department_name,city
FROM employees e JOIN departments d
ON e.department_id = d.department_id
JOIN locations l  
ON d.location_id = l.location_id;

SELECT last_name,department_name
FROM employees e LEFT JOIN departments d
ON e.department_id = d.department_id;

SELECT last_name,department_name
FROM employees e RIGHT JOIN departments d
ON e.department_id = d.department_id;

SELECT employee_id,department_name
FROM employees e LEFT JOIN departments d
ON e.department_id = d.department_id
WHERE d.department_id is NULL;

SELECT employee_id,department_name
FROM employees e RIGHT JOIN departments d
ON e.department_id = d.department_id
WHERE e.department_id is NULL;

SELECT last_name,department_name
FROM employees e RIGHT JOIN departments d
USING (department_id);














