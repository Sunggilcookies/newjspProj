<%@page import="java.util.Arrays"%>
<%@page import="oops_p.Stud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session/view</title>
</head>
<body>
<h1>session/view</h1>
<%
int [] arr = (int [])session.getAttribute("arr");
%>
<br/>
	pname:<%=session.getAttribute("pname") %><br/>
	no:<%=session.getAttribute("no") %><br/>
	arr:<%=Arrays.toString(arr) %><br/>
	st:<%=session.getAttribute("st") %>
</body>
</html>