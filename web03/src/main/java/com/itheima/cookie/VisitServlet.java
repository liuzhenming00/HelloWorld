package com.itheima.cookie;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itheima.utils.CookieUtils;

public class VisitServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		Cookie cookie = CookieUtils.findCookie(cookies, "lastVisit");
		if (cookie == null) {

			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>你好，欢迎来到本网站</h1>");
		} else {
			String value = cookie.getValue();
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>你好，你的上次访问时间为:" + value + "</h1>");

		}
		Date d = new Date(0);
		Cookie c = new Cookie("lastVisit", d.toLocaleString());
		c.setPath("/web03");
		c.setMaxAge(60 * 60);
		response.addCookie(c);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
