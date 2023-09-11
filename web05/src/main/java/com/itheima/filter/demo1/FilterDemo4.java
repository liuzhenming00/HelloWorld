package com.itheima.filter.demo1;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo4 implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

		String filterName = filterConfig.getFilterName();
		System.out.println(filterName);
		String username = filterConfig.getInitParameter("username");
		String password = filterConfig.getInitParameter("password");
		System.out.println(username);
		System.out.println(password);
		Enumeration<String> names = filterConfig.getInitParameterNames();
		while (names.hasMoreElements()) {
			String name =  names.nextElement();
			String value = filterConfig.getInitParameter(name);
			System.out.println(name+"   "+value);
		}
	}

}
