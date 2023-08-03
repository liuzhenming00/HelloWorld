SELECT last_name,salary
FROM employees
WHERE department_id IN (
												SELECT department_id
												FROM employees
												WHERE last_name = 'Zlotkey'
												);
												
SELECT employee_id,last_name,salary
FROM employees
WHERE salary > (
								SELECT AVG(salary)
								FROM employees
								);
												
SELECT last_name,job_id,salary
FROM employees
WHERE salary >ALL (
								SELECT salary
								FROM employees
								WHERE job_id = 'SA_MAN'
								);
								
SELECT employee_id,last_name
FROM employees
WHERE department_id IN(
												SELECT DISTINCT department_id
												FROM employees
												WHERE last_name LIKE '%u%'
												);
								
SELECT employee_id
FROM employees
WHERE department_id IN (
												SELECT department_id
												FROM departments
												WHERE location_id = 1700
												);
				
SELECT last_name,salary,manager_id
FROM employees
WHERE manager_id IN(
										SELECT manager_id
										FROM employees
										WHERE last_name = 'King'	
											);								
								
SELECT last_name,salary
FROM employees
WHERE salary =(
									SELECT MIN(salary)
									FROM employees
									);
		
		
SELECT *
FROM departments
WHERE department_id =(SELECT department_id
												FROM employees
												GROUP BY department_id
												HAVING AVG(salary) = (
																							SELECT MIN(avg_sal)							
																							FROM(
																										SELECT AVG(salary) avg_sal
																										FROM employees
																										GROUP BY department_id								
																										)t_dept_avg_sal			
																							)
												)	;
		

SELECT *
FROM jobs
WHERE job_id = (
								SELECT job_id
								FROM employees
								GROUP BY job_id
								HAVING AVG(salary) >=ALL (
																					SELECT AVG(salary)
																					FROM employees
																					GROUP BY job_id
																					)
								);																
								
								
SELECT department_id
FROM employees
GROUP BY department_id
HAVING 	AVG(salary) > (
												SELECT AVG(salary)
												FROM employees
												);
								
SELECT *
FROM employees
WHERE employee_id IN (
										SELECT manager_id
										FROM employees
										);
										
SELECT MIN(salary)
FROM employees
WHERE department_id IN (
												SELECT department_id
												FROM employees
												GROUP BY department_id
												HAVING MAX(salary) <=ALL (
																							    SELECT max(salary)
																									FROM employees
																									GROUP BY department_id
																									)
																									);
																									
								 
SELECT last_name,department_id,email,salary
FROM employees
WHERE employee_id = ANY (
											SELECT DISTINCT manager_id
											FROM employees
											WHERE department_id = (
																							SELECT department_id
																							FROM employees
																							GROUP BY department_id
																							HAVING AVG(salary) >=ALL (
																																				SELECT AVG(salary)
																																				FROM employees
																																				GROUP BY 																																					department_id
																																				)
																							
																							)


										);

SELECT department_id
FROM departments
WHERE department_id not IN (
														SELECT DISTINCT department_id
														FROM employees
														WHERE job_id = 'ST_CLERK'
														);		
														
								
								
SELECT last_name
FROM employees emd
WHERE not EXISTS (
									SELECT *
									FROM employees mgr 
									WHERE emd.employee_id = mgr.manager_id
									)
								
SELECT department_name
FROM departments d 
WHERE 5 < (
						SELECT COUNT(employee_id)
						FROM employees e
					  WHERE d.department_id = e.department_id
								);
								
								
								
								
								
								
								
								