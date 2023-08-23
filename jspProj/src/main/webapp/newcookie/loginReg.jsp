<%@page import="java.util.ArrayList"%>
<%@page import="oops_p.UserList"%>
<%@page import="oops_p.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인처리</title>
</head>
<body>
<h1>로그인처리</h1>
<%
	
	
	User user1 = new User("aaa","장동건","1111");
	User user2 = new User("bbb","장서건","2222");
	User user3 = new User("ccc","장동건","3333");
	User user4 = new User("ddd","장남건","1111");
	User user5 = new User("eee","북두신건","3333");
	ArrayList<User> userlist = new ArrayList<>();
	userlist.add(user1);
	userlist.add(user2);
	userlist.add(user3);
	userlist.add(user4);
	userlist.add(user5);
	
	
	String pid=request.getParameter("pid");
	String pw=request.getParameter("pw");
	String msg = "로그인실패";
	for(user)
	if(pid.equals(dbid)&&pw.equals(dbpw)){
		msg=dbPname+"로그인성공";
		response.addCookie(new Cookie("pid",pid));
		response.addCookie(new Cookie("pname",dbPname));
	}


%>
<script type="text/javascript">
	alert("<%=msg%>")
	location.href="logMain.jsp"

</script>

</body>
</html>