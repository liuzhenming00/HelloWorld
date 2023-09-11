<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(request.getSession().getAttribute("existUser")==null){
	%>	
	<h1>你还没有登录！请先去<a href="/web03_login/login.jsp">登录</a>!</h1>
<% 		
	}else{
%>
<h1>用户登录成功页面</h1>
<h3>你好</h3>
<% 
	}
%>

</body>
</html>