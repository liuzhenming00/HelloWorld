<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
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
<h1>jstl的foreach标签的使用</h1>
<h3>遍历数组</h3>
<%
String[] args = {"aa","bb","cc"};
pageContext.setAttribute("arrs", args);
%>
<c:forEach var="s" items = "${arrs }">
	${s }
</c:forEach>
<h3>便利list集合</h3>
<%
List<String> list = new ArrayList<String>();
list.add("11");
list.add("22");
list.add("33");
pageContext.setAttribute("list", list);
%>
<c:forEach var="s" items="${list }">
${s }
</c:forEach>
<h3>遍历map集合</h3>
<%
Map<String,Integer> map = new HashMap();
map.put("aaa", 111);
map.put("bbb", 222);
map.put("ccc", 333);
pageContext.setAttribute("map", map);

%>
<c:forEach var= "s" items ="${map }">
	${s.key }--${s.value }
</c:forEach><br>
<c:forEach var="i" begin="1" end="10" step="1">
 ${i }
</c:forEach>
<h3>遍历从100到200</h3>
<c:forEach var ="i" begin ="100" end="200" step="2" varStatus="status">
	<c:if test="${status.count % 3 == 0 }">
	<font color="blue">${ i} </font>
	</c:if>
	
	<c:if test="${status.count % 3 != 0 }">
	<font >${ i} </font>
	</c:if>

</c:forEach>
</body>
</html>