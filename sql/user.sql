CREATE USER 'hsp_edu'@'localhost' IDENTIFIED BY '12345678'
SELECT HOST, USER,authentication_string
	FROM mysql.user
DROP USER 'hsp_edu'@'localhost'
ALTER USER 'hsp_edu'@'localhost' IDENTIFIED BY '12345678'