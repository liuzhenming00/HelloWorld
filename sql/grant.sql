CREATE USER 'shunping'@'localhost' IDENTIFIED BY '123'
CREATE DATABASE testdb 
CREATE TABLE news(
	id INT,
	content VARCHAR(32)
	)
INSERT INTO news VALUES (100,'北京新闻')
SELECT * FROM news
GRANT SELECT ,INSERT 
	ON testdb.news
	TO 'shunping'@'localhost'
GRANT UPDATE 
	ON testdb.news
	TO 'shunping'@'localhost'
ALTER USER 'shunping'@'localhost' IDENTIFIED BY 'abc'
REVOKE SELECT,INSERT,UPDATE ON testdb.`news`FROM 'shunping'@'localhost'
DROP USER 'shunping'@'localhost'

