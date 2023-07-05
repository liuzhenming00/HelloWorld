CREATE TABLE t25(
	id INT,
	NAME VARCHAR(32)
	)
SHOW INDEXES FROM t25
CREATE UNIQUE INDEX id_index ON t25 (id)
CREATE INDEX in_index ON t25(id)
 
CREATE TABLE t26(
	id INT,
	NAME VARCHAR(32)
	)
ALTER TABLE t26 ADD PRIMARY KEY (id)
ALTER TABLE t26 ADD INDEX id_index(id)
SHOW INDEXES FROM t26
DROP INDEX id_index ON t25
ALTER TABLE t26 DROP PRIMARY KEY

SHOW INDEX FROM t25
SHOW INDEXES FROM t26
SHOW KEYS FROM t25



