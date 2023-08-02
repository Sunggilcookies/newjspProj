<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect > b</title>
</head>
<body>
	<h1>redirect > a</h1>
	<script type="text/javascript">
		alert("돌아왔구나 오~태식E~")
		location.href="b.jsp";
	
	</script> 
<%
	//위에 redirect location 실행이 안됌
	request.setAttribute("pname", "aaa");
	response.sendRedirect("b.jsp?age=27");
%>
</body>
</html>