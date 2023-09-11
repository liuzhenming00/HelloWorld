package com.itheima.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.itheima.domain.User;

public class PrivilegeFiler implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req  = (HttpServletRequest) request;
		User existUser =  (User) req.getSession().getAttribute("exisUser");
		if (existUser == null) {
			req.setAttribute("msg", "你还没有登录！没有权限访问");
			req.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			chain.doFilter(req, response);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
