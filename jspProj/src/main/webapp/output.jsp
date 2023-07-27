<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String args = request.getParameter("input"); //input 텍스트값 받아오기
	
					// 스페이스
	List<String> = Arrays.asList(args.split(" "));	
	int a = str.size();
	for(int i = 0; i<=a; i++){
		out.println(str[i]);
		
	}
	
%>