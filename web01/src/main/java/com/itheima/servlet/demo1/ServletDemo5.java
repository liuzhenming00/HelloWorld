package com.itheima.servlet.demo1;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo5 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext servletContext = this.getServletContext();
		String mimeType = servletContext.getMimeType("aa.txt");
		System.out.println(mimeType);

		String path = servletContext.getContextPath();
		System.out.println(path);

		String username = servletContext.getInitParameter("username");
		String password = servletContext.getInitParameter("password");
		System.out.println(username + "  " + password);

		Enumeration<String> names = servletContext.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name = names.nextElement();
			String value = servletContext.getInitParameter(name);
			System.out.println(name + "  " + value);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
