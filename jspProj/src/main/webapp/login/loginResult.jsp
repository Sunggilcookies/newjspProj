<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인폼</title>
</head>
<body>
	<h2>로그인폼</h2>
	

	
	
	<%=	session.getAttribute("sid")%>님 안녕하세요
	<button onclick="logout()">로그아웃</button>
	
<script type="text/javascript">

 function logout(){
	<% session.removeAttribute("sid");
	session.removeAttribute("spw");%>
	alert("로그아웃완료")
	
}
</script> 
</body>
</html>