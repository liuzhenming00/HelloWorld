<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv ="Content-Type" content = "text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>登陸的成功</h1>
<%
Integer count = 0;
if(this.getServletContext().getAttribute("count")!=null){
	count = (Integer)this.getServletContext().getAttribute("count");
}

%>
<h1>登陸的成功縂人數<%= count %></h1>
</body>
</html>