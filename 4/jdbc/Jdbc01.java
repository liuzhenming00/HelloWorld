package com.hspdu.jdbc;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {

    }
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        String url = "jdbc:mysql://localhost:3306/testdb useSSL=true";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","123456");
        Connection connect = driver.connect(url, properties);
        String sql = "insert into actor values(1,'刘德华','男','1970-11-11','110')";
        Statement statement = connect.createStatement();
        int row = statement.executeUpdate(sql);
        System.out.println(row > 0? "成功":"失败");
        statement.close();
        connect.close();
    }
    @Test
    public void connect02() throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }
}
