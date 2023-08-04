<!-- 중간에 이름이 바뀌면 안됌 -->
<%@page import="model_p.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    BoardDTO dto = (BoardDTO)request.getAttribute("mainData");
    
    %>
<table border="">

	<tr align="center">
		<td width="200px">번호</td><td width="700px"><%=dto.getId() %></td>
		</tr><tr>
		<td>제목</td><td><%=dto.getTitle() %></td>
		</tr><tr>
		<td>작성자</td><td><%=dto.getPname()%></td>
		</tr><tr>
		<td>작성일</td><td><%=dto.getReg_date()%></td>
		</tr><tr>
		<td>조회수</td><td><%=dto.getCnt()%></td>
		</tr><% if(!dto.getUpfile().equals("")){ %><tr>
		<td>파일</td><td>
		<% if(dto.isImg()){ %>
		<img src="/mvcProj/up/<%=dto.getUpfile()%>"/>
		<%} else { %>
			<a href="/mvcProj/noneJsp/FileDown?fname=<%=dto.getUpfile()%>"><%=dto.getUpfile()%></a>
		<% } %>
		</td>
		<%} %>
		</tr><tr>
		<td>내용</td><td><%=dto.getContentBr()%></td>
		</tr>
	

	<tr>
		<td colspan="2" align="right">
			<a href="BList">목록으로</a>
			<a href="BDeleteForm?id=<%=dto.getId()%>">삭제</a>
			<a href="BModifyForm?id=<%=dto.getId()%>">수정</a>
			<a href="BReplyForm?id=<%=dto.getId()%>">답변</a>
		</td>
	</tr>
</table>