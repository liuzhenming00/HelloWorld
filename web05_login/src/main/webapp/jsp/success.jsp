<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>你已经登陆成功！欢迎：${existUser.username }</h1>
<a href="${pageContext.request.contextPath}/jsp/sub.jsp">提交</a>
</body>
</html>