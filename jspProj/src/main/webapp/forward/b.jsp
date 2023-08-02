<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward</title>
</head>
<body>
	<h1>forward</h1>
	pname:<%= request.getAttribute("pname") %>
	age <%= request.getAttribute("age") %>
	nick <%= request.getAttribute("nick") %>
</body>
</html>