package com.itheima.response.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseDemo1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.setStatus(404);
//		response.setStatus(302);
//		response.setHeader("Location", "/web01/ResponseDemo2");

		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("5秒以后页面跳转");
		response.setHeader("Refresh", "5;url=/web01/ResponseDemo2");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
