<%@page import="oops_p.Stud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session/make2</title>
</head>
<body>
<h1>session/make2</h1>
<%
	session.setAttribute("pname", "장서건");
	session.setAttribute("age", "38");
%>
	
	

</body>
</html>