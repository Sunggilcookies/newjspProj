<%@page import="java.util.Arrays"%>
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
//
	String [] Name = request.getParameterValues("name"); //form의 이름값
	String [] Korea = request.getParameterValues("korea"); //국어
	String [] English = request.getParameterValues("english"); //영어
	String [] Math = request.getParameterValues("math"); //수학
	
	int[] Sum = new int[Name.length];			//length는 1 인덱스 4가 5로
	float[] Arg = new float[Name.length];			
	int[] Ranking = new int[Name.length];			
	int count=0;
				//랭킹별 추가 점수
	int sum1, sum2, sum3, sum4, sum5=-1;	
				
				
	// 연산부분
	for(int i=0;i<=Korea.length-1;i++){
		count++;
		int sum = Integer.parseInt(Korea[i])
		+Integer.parseInt(English[i])
		+Integer.parseInt(Math[i]);
		Sum[i] = sum;
		//평균처리
		float arg=sum/3;
		Arg[i] = arg;
		
		//랭킹 계산 - 미완성
		if (Sum[i] >= Sum[0]) {//총합 0번부터 5번까지중에 큰값 추출
			sum1 = Sum[i]; //sum1에 1번째로 큰 sum값 입력
			Ranking[i] = 1; //ranking[i]에 1등 입력
			if(sum1 != -1){ 
				sum2 = Sum[i]; //sum2에 1번째로 큰 sum값 입력
				Ranking[i] = 2; //ranking[i]에 2등 입력
			
		if(sum2 != -1){ 
			sum3 = Sum[i]; //sum2에 1번째로 큰 sum값 입력
			Ranking[i] = 3; //ranking[i]에 2등 입력
			
		if(sum3 != -1){ 
			sum4 = Sum[i]; //sum2에 1번째로 큰 sum값 입력
			Ranking[i] = 4; //ranking[i]에 2등 입력
				
			if(sum4 != -1){ 
				sum5 = Sum[i]; //sum2에 1번째로 큰 sum값 입력
				Ranking[i] = 5; //ranking[i]에 2등 입력
			}
		}}}}
	
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
			<%for(int i=0;i<=Korea.length-1;i++){ %>
			<tr>
				
				<td><input type="text" name="name" value="<%=Name[i]%>" /></td>
				<td><input type="text" name="korea" value="<%=Korea[i]%>" /></td>
				<td><input type="text" name="english" value="<%=English[i]%>" /></td>
				<td><input type="text" name="math" value="<%=Math[i]%>" /></td>
				<td><input type="text" name="sum" value="<%=Sum[i]%>" /></td>
				<td><input type="text" name="arg" value="<%=Arg[i]%>" /></td>
				<td><input type="text" name="ranking" value="<%=Ranking[i]%>" /></td>
			</tr>
			<%} %>
			<tr>
				<td colspan="10" align="center"><input type="submit" value="계산" /></td>
			</tr>
		</table>
</body>
</html>