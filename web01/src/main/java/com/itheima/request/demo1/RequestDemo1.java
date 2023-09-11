package com.itheima.request.demo1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestDemo1
 */
public class RequestDemo1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("请求方式:" + request.getMethod());
		System.out.println("客户机ip地址" + request.getRemoteAddr());
		System.out.println("请求参数的字符串" + request.getQueryString());
		System.out.println("请求路径的URL" + request.getRequestURL());
		System.out.println("请求路径的URI" + request.getRequestURI());
		System.out.println("获得客户机浏览器类型:" + request.getHeader("User-Agent"));

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
