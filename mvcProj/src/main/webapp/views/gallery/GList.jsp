<%@page import="java.util.ArrayList"%>
<%@page import="model_p.GalleryDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<h2> GLIST입니다</h2>

<%-- <table border="">
	<tr align="center">
		<td>번호</td>
		<td>사진</td>
		<td>제목 </td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
	
	
	
<%

int i=0;
for(GalleryDTO dto : (ArrayList<GalleryDTO>)request.getAttribute("mainData")){
i++;
%>
	<tr>
		<td><%=i%></td>
		<td><%=dto.getUpfile() %></td>
		<td><%=dto.getTitle() %></td>
		<td><%=dto.getPname() %></td>
		<td><%=dto.getReg_dateStr()%></td>
	</tr>
	<%} %>
</table>
 --%>

</body>
</html>