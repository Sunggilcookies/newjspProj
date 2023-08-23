<%@page import="org.apache.naming.HandlerRef"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Redirect"%>
<%@page import="oops_p.Map"%>

<%@page import="oops_p.User"%>
<%@page import="java.util.HashMap"%>
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
	<%
	/* 회원목록 */
	HashMap<String, User> map = new HashMap<String, User>();
	map.put("aaa", new User("aaa", "김민석", "1111"));
	map.put("bbb", new User("bbb", "김민훈", "2222"));
	map.put("ccc", new User("ccc", "김민준", "3333"));
	map.put("ddd", new User("ddd", "김민적", "2222"));
	map.put("eee", new User("eee", "김민식", "1111"));
	%>


	<form action="" method="post">
		<table>
			<tr>
				<td>아이디<input type="text" name="id" /></td>
				<td>비번<input type="text" name="pw" /></td>

			</tr>
			<tr>
				<td><button type="submit" />로그인</td>
			</tr>

		</table>

	</form>



	<%
	String userid = request.getParameter("id");
	String userpw = request.getParameter("pw");

	if (map.containsKey(userid) && map.get(userid).getPw().equals(userpw)) {

		session.setAttribute("sid", map.get(userid).getId());
		session.setAttribute("spw", map.get(userid).getPw());
		session.setAttribute("sname", map.get(userid).getName());
		out.print("쿠키생성");
	%>
	<%=	session.getAttribute("sname")%>님 안녕하세요
	<button onclick="logout()">로그아웃</button>

	<%
	}
	%>




<script type="text/javascript">

 function logout(){
	<% 
	session.removeAttribute("sid");
	session.removeAttribute("spw");
	session.removeAttribute("sname");
	
	%>
	alert("로그아웃완료")
	
}
</script> 
</body>
</html>
