<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Arrays"%>
<%@page import="oops_p.Nums"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numReg</title>
</head>
<body>
	<%
	//입력부
	//	 form에서 값 받아오기
	String[] names = request.getParameterValues("name"); //form의 이름값
	String[] kor = request.getParameterValues("korea"); //국어
	String[] eng = request.getParameterValues("english"); //영어
	String[] mat = request.getParameterValues("math"); //수학
	String[] mic = request.getParameterValues("music"); //음악
	Nums[] arr = new Nums[names.length];
	for (int i = 0; i < names.length; i++) {		
	/* Nums[] jum = new Nums(names[i], kor[i], eng[i], mat[i], mic[i]);
	} */
	//	Nums 배열 새로 생성
/* 	Nums[][] arr = new Nums[names.length][jum.length]; */
	for (int i = 0; i < arr.length; i++) {			
		arr[i] = new Nums(names[i], kor[i], eng[i], mat[i], mic[i]);
		
	}
	
	
	
/* 	float[] Sum = new float[Name.length]; //length는 1 인덱스 4가 5로
	String [] Arg = new String[Name.length];
	int[] Ranking = new int[Name.length];
	int count = 0;
	float arg = 0;
	String argstring;
	//랭킹별 추가 점수

	// 연산부분
	 for (int i = 0; i < Korea.length; i++) {
		count++;
		Sum[i] = Float.parseFloat(Korea[i]) + Float.parseFloat(English[i]) + Float.parseFloat(Math[i]);

		Ranking[i] = 1;
		// 평균처리
		arg = Sum[i] / (float) 3.0;
		argstring = String.format("%.2f", arg); // 평균 문자로 변환해서 소수 둘째자리로 변환
		Arg[i] = argstring;
	}
	for (int i = 0; i <= Korea.length - 1; i++) {
		for (int j = 0; j <= Korea.length - 1; j++) {
			if (Sum[i] < Sum[j]) { //			sum[i]부터 sum[j]까지 검사 
		Ranking[i]++;
			}

		}
	} */
	for (int i = 0; i < arr.length; i++) {			
		arr[i] = new Nums(names[i], kor[i], eng[i], mat[i], mic[i]);
		
	}for (int i = 0; i < arr.length; i++) {
		arr[i].rankCalc(arr);
		System.out.println(arr[i]);
	}
	%>
	<!-- // 순위정하기 :  배열 같은 인덱스 끼리더해서 총점 빼보라고 -->
	<h1>출력</h1>
	<table border="">

		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>합계</td>
			<td>평균</td>
			<td>순위</td>

		</tr>

		<c:forEach var="i" begin="0" end="Kor.length-1">
		<tr>

		 	<td><input type="text" name="name" value="<%=Name[i]%>" /></td>
			<td><input type="text" name="korea" value="<%=Korea[i]%>" /></td>
			<td><input type="text" name="english" value="<%=English[i]%>" /></td>
			<td><input type="text" name="math" value="<%=Math[i]%>" /></td>
			<td><input type="text" name="sum" value="<%=Sum[i]%>" /></td>
			<td><input type="text" name="arg" value="<%=Arg[i]%>" /></td>
			<td><input type="text" name="ranking" value="<%=Ranking[i]%>" /></td> 
		</tr>
		</c:forEach>
	
		
	</table>
</body>
</html>