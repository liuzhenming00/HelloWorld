package com.itheima.servlet.demo1;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo4
 */
public class ServletDemo4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletConfig config = this.getServletConfig();
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println(username + "  " + password);

		Enumeration<String> names = config.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + " " + value);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
