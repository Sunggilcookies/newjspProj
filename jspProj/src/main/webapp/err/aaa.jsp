<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>aaa</title>
</head>
<body>
	<h2>aaa입니다. 정상실행2</h2>
	<%
	try{int a =10/2;
		out.println("정상실행"+ a);
		int [] arr = {11,22,33,44};
		out.println("정상실행2"+arr[2]);
		a = Integer.parseInt("123a4");
		out.println("정상실행3"+a);
	
	}catch(ArithmeticException e){
		out.println("수학적 에러 처리:"+e.getMessage());
	}catch(ArrayIndexOutOfBoundsException e){
		out.println("인덱스 에러 처리:"+e.getMessage());
	}catch(Exception e){
		out.println("일반적 에러 처리:"+e.getMessage());
	}
	//(Exception e)가 부모이기에 가장 아래에 놔야함;
	%>
	
</body>
</html>