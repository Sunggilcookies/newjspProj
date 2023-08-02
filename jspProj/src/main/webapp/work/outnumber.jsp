<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
	//값 받아오기
	String[] firstNumber = request.getParameterValues("first");
	String[] secondNumber = request.getParameterValues("second");
	secondNumber=char
	String[] name = request.getParameterValues("name");
	System.out.println(Arrays.toString(secondNumber));
	//번호 집어넣기
	//생년월일 처리 년도 
	String[] first= firstNumber[0].split("");
	int ten =  Integer.parseInt(first[0]);
	int one =  Integer.parseInt(first[1]);
	int age = ten*10 +one +16; 
	System.out.println(1/2);
	//뒷번호 첫자리
	String[] number= secondNumber[0].split("");
	/* int kkey = Integer.parseInt(number[0]);

	
	if(kkey>=5){ //외국인일 경우에
		
		
		
		
	}else if(kkey<=4){ //국내
		if(kkey<=2){//성인
			
		}
			
		else{
			
		}
	}
		 */

	/*
	
	
		response.sendRedirect("""outnumber.jsp");
		
		
		
		 response.sendRedirect("outnumber.jsp"); */ 
		
	
	%>
	
</body>
</html>