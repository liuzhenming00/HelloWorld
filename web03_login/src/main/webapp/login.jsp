<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
		function changeImg(){
			document.getElementById("img1").src="/web03_login/CheckImgServlet?time="+new Date().getTime();
		}
</script>
</head>
<body>
<%
String msg="";
if(request.getAttribute("msg")!=null){
	msg = (String)request.getAttribute("msg");
}
%>
<h1>登陆页面</h1>
<h3><font color="red"> <%= msg %></font></h3>
<form action="/web03_login/LoginServlet" method="post">
	<table  border="1" width="500">
	<tr>
	<td>用户名</td>
	<td><input type = "text" name="username"value="${cookie.remember.value }"/></td>
	</tr>
	
	<tr>
	<td>密码</td>
	<td><input type = "password" name="password"></td>
	</tr>
	<tr>
	<td>验证码</td>
	<td><input type = "text" name="checkcode" size ="6"/><img id="img1"  src="/web03_login/CheckImgServlet"/>
	<a href="#" onclick="changeImg()">看不清，换一张</a>
	</td>
	</tr>
	
	<tr>
	
	<td><input type = "checkbox" name="remeber" value = "true"></td>
	<td>记住用户名</td>
	</tr>
	
	<tr>
	<td colspan="2"><input type = "submit"value = "登录"></td>
	</tr>
	</table>


</form>
</body>
</html>