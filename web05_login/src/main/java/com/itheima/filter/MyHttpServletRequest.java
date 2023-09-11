package com.itheima.filter;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class MyHttpServletRequest extends HttpServletRequestWrapper{

	private HttpServletRequest request;

	public MyHttpServletRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getParameter(String name) {
		// TODO Auto-generated method stub
		String method = request.getMethod();
		if ("GET".equalsIgnoreCase(method)) {
			String value =  super.getParameter(name);
			try {
				value = new String(value.getBytes("ISO-8859-1"),"UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return value;
			
		}else if("POST".equalsIgnoreCase(method)) {
			try {
				request.setCharacterEncoding("UTF-8");
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return super.getParameter(name);
	}

}
