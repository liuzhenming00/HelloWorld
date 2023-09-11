<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSP的四个作用范围</h1>
<h3>page范围(pageContext)</h3>
<%
pageContext.setAttribute("name","张三");
request.setAttribute("name","李四");
session.setAttribute("name","王五");
application.setAttribute("name","赵六");
%>
<h1>当前页面获取值</h1>
<%= pageContext.getAttribute("name") %>
<%= request.getAttribute("name") %>
<%= session.getAttribute("name") %>
<%= application.getAttribute("name") %>

<%
	//request.getRequestDispatcher("/demo1/demo2.jsp").forward(request, response);
%>
	<h1>findAttribute方法</h1>
	<%= pageContext.findAttribute("name") %>

	<a href="/web04/demo1/demo2.jsp">跳转</a>
	


</body>
</html>