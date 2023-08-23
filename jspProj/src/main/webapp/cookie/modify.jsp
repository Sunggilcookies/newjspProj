<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>modify</h2>
		<%
	
	Cookie coo1 = new Cookie("pname","aaa");
	Cookie coo2 = new Cookie("marriage","true");
	
	response.addCookie(coo1);
	response.addCookie(coo2);
			
	%>
	
</body>
</html>