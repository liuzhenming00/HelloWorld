ALTER TABLE t6
ADD image VARCHAR(32) NOT NULL DEFAULT ''
AFTER RESUME
DESC t66
ALTER TABLE t6
MODIFY job VARCHAR(60)NOT NULL DEFAULT ''
ALTER TABLE t6
DROP sex
RENAME TABLE t6 TO t66
ALTER TABLE t66 CHARACTER SET utf8
ALTER TABLE t66
CHANGE `id` `name_user` VARCHAR(64)NOT NULL DEFAULT ''