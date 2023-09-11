package com.itheima.response.demo1;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseDemo3
 */
public class ResponseDemo3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		test2(response);
	}

	private void test2(HttpServletResponse response) throws IOException, UnsupportedEncodingException {
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().println("中文");

	}

	private void test1(HttpServletResponse response) throws IOException, UnsupportedEncodingException {
		ServletOutputStream outputStream = response.getOutputStream();
		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		outputStream.write("中文".getBytes("UTF-8"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
