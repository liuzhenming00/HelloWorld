package com.itheima.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.model.UserModel;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
		
		String username =  request.getParameter("username");
		String password =  request.getParameter("password");
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		UserModel userModel = new UserModel();
		User  exisUser = userModel.login(user);
		if (exisUser == null) {
			request.setAttribute("msg", "用户名或密码错误");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else {
			request.getSession().setAttribute("exisUser", exisUser);
			response.sendRedirect(request.getContextPath()+"/jsp/success.jsp");
		}	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
