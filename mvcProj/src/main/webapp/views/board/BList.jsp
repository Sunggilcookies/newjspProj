<%@page import="model_p.PageData"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model_p.BoardDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="">

	<tr align="center">
		<td width="50px">번호</td>
		<td width="500px">제목</td>
		<td width="100px">작성자</td>
		<td width="200px">작성일</td>
		<td width="50px">조회수</td>
	</tr>
	
<%
//페이지값을 갖고있어~
PageData pd = (PageData)request.getAttribute("pd");
int i=pd.start;
//이게 어렵누..
for(BoardDTO dto : (ArrayList<BoardDTO>) request.getAttribute("mainData")) {
i++;
%>
	<tr align="center">
		<td><%=i %></td> 
		<td align="left">
		<!-- list 답글 처리 lv은 답글 단계를 표시 sq는 순서  -->
		<%for(int n=0;n<dto.getLev();n++) { %>
			&nbsp;&nbsp;
		<%} if(dto.getLev() > 0){%>
			└
		 <% } %>
		 <!-- list 본문 제목 -->
		<a href="BDetail?id=<%=dto.getId()%>&page=<%=pd.page%>"><%=dto.getTitle()%></a>
		</td>
		<td><%=dto.getPname() %></td>
		<td><%=dto.getReg_date() %></td>
		<td><%=dto.getCnt() %></td>
	</tr>
	<% } %>
	<tr>
		<td colspan="5" align="center">
		<%if(pd.pageStart > 1) {%>
			<a href="?page=<%=pd.pageStart-1%>">[이전]</a>
			
		<%} %>
		<%if(pd.page> 1) {%>
			<a href="?page=<%=pd.page-1%>">&lt;</a>
		<%} %>
			<%for(int p=pd.pageStart;p<=pd.pageEnd;p++){%>
				
			<%if(pd.page==p){%>
						<span style="font-size: 16px; color: red;">[<%= p %>]</span>
			<%}else{ %> 
				
				<a href="?page=<%=p%>"><%=p%></a>
				
			<%}} if(pd.pageEnd < pd.pageTotal){%>
				<a href="?page=<%=pd.page+1%>">></a>
				<a href="?page=<%=pd.pageEnd+1%>">[다음]</a>
			<%} %>
		</td>
	</tr>
	<tr>
		<td colspan="5" align="right">
			<a href="BWriteForm?page=<%=pd.page%>">글쓰기</a>
		</td>
	</tr>
</table>