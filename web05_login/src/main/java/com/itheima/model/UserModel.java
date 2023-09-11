package com.itheima.model;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;

public class UserModel {

	public static User login(User user) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		String sql = "select * from user where username=? and password=?";
		User exisUser =	queryRunner.query(sql, new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
		return exisUser;
	}

}
