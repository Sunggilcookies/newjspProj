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
	/*  int input = 300;
	for (int a = 0; a < 10; a++) { //100의배수
		for (int i = 0; i < 10; i++) { //10의배수
		for (int j = 0; j < 10; j++) { //1의배수
			if (a == 3 || a == 6 || a == 9 ) {
				out.println("짝");
			} else {
		
				out.println(a);
			}
			if (i == 3 || i == 6 || i == 9 && i%3==0) {
				out.println("짝");
			}else {
				out.println(i);
			}
			if (j == 3 || j == 6 || j == 9 && j%3==0) {
				out.println("짝");
			} else {
		
				out.println(j);
			}
			
		
			out.println("<br/>");
		}
		
			}
	}   */

	/* 

		1. 1~9 에서 3의배수일때 : 369 짝넣을것
		2.0을 제외할때 and문으로 넣을것 
		





	*/
	int input = 100;
	for (int i = 1; i <= input; i++) { //0~300
		int ten = i/10;
		int one = i%3;
		
		if (one % 3 == 0) {
			out.println("짝"+"<br/>");
		}else{
			out.println(i + "<br/>");
		}
		
	}
	%>
</body>
</html>