<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃처리</title>
</head>
<body>
<%
	Cookie [] coos = request.getCookies();
	String pname=null;
	for(Cookie co: coos){		
		if(co.getName().equals("pname")){
			pname = co.getName();
		}
	}
	Cookie coo = new Cookie("pid","");
	coo.setMaxAge(0);
	response.addCookie(coo);
	coo = new Cookie("pname","");
	coo.setMaxAge(0);
	
%>
<script type="text/javascript">
	alert("로그아웃되었습니다")
	location.href="logMain.jsp"

</script>
</body>
</html>