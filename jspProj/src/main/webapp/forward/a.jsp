<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forward > b</title>
</head>
<body>
	<h1>forward > a</h1>
	<script type="text/javascript">
		alert("돌아왔구나 육~태식E~")
	
	
	</script> 
<%
	//위에 redirect location 실행이 안됌
	request.setAttribute("pname", "ddd");

%>
<jsp:forward page ="b.jsp?age=34" />
</body>
</html>