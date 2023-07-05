package com.hspdu.transation_;

import com.hspdu.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
@Test
    public  void noTransaction(){
        Connection connection = null;
        String sql = "update account set balance = balance - 100  where id = 1";
        String sql2 = "update account set balance = balance + 100  where id = 2";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
    public void useTransaction(){
        Connection connection = null;
        String sql = "update account set balance = balance - 100  where id = 1";
        String sql2 = "update account set balance = balance + 100  where id = 2";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);


            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();
            connection.commit();

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
