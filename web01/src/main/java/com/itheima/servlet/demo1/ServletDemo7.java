package com.itheima.servlet.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo7
 */
public class ServletDemo7 extends HttpServlet {
	public void init() throws ServletException {
		this.getServletContext().setAttribute("name", "张三");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = (String) this.getServletContext().getAttribute("name");
		System.out.println("姓名" + name);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
