<%@page import="java.nio.file.spi.FileSystemProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_third</title>
</head>
<body>
	<h1>03_third입니다.ㅇ</h1>


	<%!//1. delcaration : 선언! 클래스 정의부
	String name = "나는무너";
	int age = 49;	//맴버변수
	boolean marriage = true;

	void meth_1() {
		System.out.println("meth_1()실행");
	}
	public void jspInit(){
		System.out.println("init 실행");
	}
	public void jspDestroy(){
		System.out.println("Destroy 실행");
	}
	//스크립트릿 (scripflet) JSP안에서만 쓸수있는 내장객체가 있다. dopost, doget, getWriter(), out.println 등등
	//out.println("str"+str);	
		
	

	//System.out.println("정의부에서 실행 구문 불가");%>

	<%!//int age=23; 맴버변수 같은것이 두개가 들어갈수없다.
		int[] arr = { 11, 22, 33, 44, 55 };%>

	<%
		
		//scriptlet:: _jspService()
		System.out.println("scriptlet 실행"+ age);
		int age=23; //지역변수 맴버변수와 중첩 가능
		String str = "아기상어";
		
		/* void meth_1() {
			System.out.println("meth_1()실행");
		}     메서드 정의 불가 -->scriptlet _jspService() 인 메소드이므로 메소드 중첩 정의불가 */
		
		out.println("str"+str);
		
	%>

</body>
</html>