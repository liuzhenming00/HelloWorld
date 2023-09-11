<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL执行运算</h1>
<h3>执行算数运算</h3>
<%
pageContext.setAttribute("n1", 10);
pageContext.setAttribute("n2", 20);
%>
${n1+n2}
<h3>执行关系运算</h3>
${n1>n2 }
${n1<n2 }
${n1==n2 }
${n1>=n2 }
${n1<=n2 }
${n1!=n2 }
<h3>执行逻辑运算</h3>
<%
 	pageContext.setAttribute("n3", "30");
 	pageContext.setAttribute("n4", "40");
%>
${(n1<n2)&&(n3<n4) }
${(n1<n2)||(n3<n4) }
${!(n1<n2) }

<h3>执行三元运算符</h3>

${n1<n2? "n1小于n2":"n1大于n2" }


</body>
</html>