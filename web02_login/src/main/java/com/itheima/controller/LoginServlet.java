package com.itheima.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.domain.User;
import com.itheima.model.UserModel;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setCharacterEncoding("UTF-8");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			User user = new User();
			user.setUsername(username);
			user.setPassword(password);
			UserModel userModel = new UserModel();
			User existUser = userModel.login(user);
			if (existUser == null) {
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("/login.jsp").forward(request, response);

			} else {
				int count = (int) this.getServletContext().getAttribute("count");
				count++;
				this.getServletContext().setAttribute("count", count);

				response.sendRedirect("/web02_login/susses.jsp");
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
