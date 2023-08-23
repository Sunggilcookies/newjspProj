<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>쀼</h2>
<!-- 쿠키를 보는것은 쿠키배열을 return하는 request로부터 getcookies로 받아온다 -->
	<%
	Cookie [] coos = request.getCookies();
	
	for(Cookie co: coos){ %>

	
	<%=co.getName() %> : <%=URLDecoder.decode(co.getValue(),"utf-8") %><br/>
<% }%>

</body>
</html>