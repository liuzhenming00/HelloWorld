SELECT e.last_name,e.department_id,d.department_name
FROM employees e LEFT JOIN departments d 
ON e.department_id = d.department_id;

SELECT e.job_id,d.location_id
FROM employees e JOIN departments d 
on e.department_id = d.department_id
WHERE d.department_id = 90

SELECT e.last_name,e.commission_pct,d.department_name,d.location_id,l.city
FROM employees e LEFT JOIN departments d
ON e.department_id = d.department_id
left JOIN locations l 
ON d.location_id = l.location_id
WHERE e.commission_pct is not null;

SELECT e.last_name,e.job_id,e.department_id,d.department_name
FROM employees e JOIN departments d 
ON e.department_id = d.department_id
JOIN locations l 
ON d.location_id = l.location_id
WHERE l.city = 'Toronto';

SELECT emp.last_name "employees",emp.employee_id "Emp#",mgr.last_name "manager",mgr.employee_id "Mgr#"
FROM employees emp left join employees mgr 
ON emp.manager_id = mgr.employee_id;

SELECT d.department_id,e.employee_id
FROM departments d left JOIN employees e 
on d.department_id = e.department_id
WHERE e.department_id is NULL;

SELECT l.city, d.location_id
FROM locations l left join departments d 
ON l.location_id = d.location_id
WHERE d.location_id IS NULL;

SELECT last_name
FROM employees e JOIN departments d 
ON e.department_id = d.department_id
WHERE d.department_name IN ('Sales','IT');














