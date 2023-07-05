CREATE DATABASE mhl
CREATE TABLE employee(
	id INT PRIMARY KEY AUTO_INCREMENT,
	empId VARCHAR(50) UNIQUE NOT NULL DEFAULT '',
	pwd CHAR(32) NOT NULL DEFAULT '',
	NAME VARCHAR(50) NOT NULL DEFAULT '',
	job VARCHAR(50) NOT NULL DEFAULT ''
	)CHARSET=utf8
	DROP TABLE employee


INSERT INTO employee VALUES (NULL, '6668612',MD5('123456'),'张三丰','经理');
INSERT INTO employee VALUES (NULL, '6668622',MD5('123456'),'小龙女','服务员');
INSERT INTO employee VALUES (NULL, '6668633',MD5('123456'),'张无忌','收银员');
INSERT INTO employee VALUES (NULL, '666666',MD5('123456'),'老韩','经理');

SELECT * FROM employee
SELECT * FROM employee WHERE empId='6668622' AND pwd = MD5('123456')



CREATE TABLE diningTable(
	id INT PRIMARY KEY AUTO_INCREMENT,
	state VARCHAR(20) NOT NULL DEFAULT '',
	orderName VARCHAR(50) NOT NULL DEFAULT '',
	orderTel VARCHAR(20) NOT NULL DEFAULT ''
	)CHARSET=utf8;
	insert into diningTable values(null,'空','','');
	INSERT INTO diningTable VALUES(NULL,'空','','');
	INSERT INTO diningTable VALUES(NULL,'空','','');
select * from diningTable
select id, state from diningTable
select * from diningTable where id = 2
update diningTable set state = '空',orderName = '',orderTel= ''where id = 1
update diningTable set state = '已经预定',orderName = 'jack',orderTel= '112'where id = 1
	
	
	
create table menu(
	id int primary key auto_increment,
	name varchar(50) not null default '',
	type varchar(50) not null default'',
	price double not null default 0
	)charset=utf8;
	
insert into menu values(null,'八宝粥','主食',10);
INSERT INTO menu VALUES(NULL,'叉烧包','主食',20);
INSERT INTO menu VALUES(NULL,'宫保鸡丁','热菜',30);
INSERT INTO menu VALUES(NULL,'山药鲅鱼','凉菜',14);
INSERT INTO menu VALUES(NULL,'银丝卷','甜食',9);
INSERT INTO menu VALUES(NULL,'水煮鱼','热菜',26);
INSERT INTO menu VALUES(NULL,'甲鱼汤','汤类',100);
INSERT INTO menu VALUES(NULL,'鸡蛋汤','汤类',16);


select * from menu

create table bill(
	id int primary key auto_increment,
	billId varchar(50) not null default '',
	menuId int not null default 0,
	nums int not null default 0,
	money double not null default 0,
	diningTableId int not null default 0,
	billDate datetime not null,
	state varchar(50) not null default ''
	)charset=utf8;
select * from bill
drop table bill

	
	