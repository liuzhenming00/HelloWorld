package com.hspdu.batch_;

import com.hspdu.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {
    public void  noBach() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into actor values (null ,'smith','男','1950-11-11','123')";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        preparedStatement.executeUpdate();
        JDBCUtils.close(null,preparedStatement,connection);


    }
    @Test
    public void bath() throws SQLException {
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into actor values (null ,'smith','男','1950-11-11','123')";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long l = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {

            preparedStatement.addBatch();
            if ((i+1)%1000 == 0){
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        JDBCUtils.close(null,preparedStatement,connection);

    }
}
