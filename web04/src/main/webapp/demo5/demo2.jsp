<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSL的if标签的使用</h1>
<c:set var ="i" value="9" scope="page"></c:set>
<c:if test="${i>=10 }">
	<font color="red"> i 大于等于10</font>
</c:if>
<c:if  var="flag" test="${i<10 }" scope="page">
	<font color = "blue">i 小于10</font>
</c:if><br>
<c:if test="${ flag}">
flag为true
</c:if>
</body>
</html>