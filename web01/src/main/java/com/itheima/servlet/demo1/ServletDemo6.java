package com.itheima.servlet.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo6
 */
public class ServletDemo6 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		test1();

	}

	private void test1() throws IOException {
		Properties properties = new Properties();
		InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
		properties.load(is);
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
