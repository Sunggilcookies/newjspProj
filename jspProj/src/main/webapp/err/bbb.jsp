<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="/excep/ex02.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbb</title>
</head>
<body>
	<h2>bbb입니다. 정상실행2</h2>
<%
	int a = 10/0;
	out.println("정상실행 1"+a+"<br/>");
	

%>
</body>
</html>