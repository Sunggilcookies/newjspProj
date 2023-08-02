<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays"%>
<%@page import="oops_p.Nums"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
   <%
   // FORM에서 이름이랑 성적 받아와서 배열로 만들기 INDEX가 열임
   //1차원배열생성
   String[] nameArr = request.getParameterValues("name");
   String[] korArr = request.getParameterValues("korea");
   String[] engArr = request.getParameterValues("english");
   String[] mathArr = request.getParameterValues("math");
   int[] scoreArr = new int[nameArr.length]; //정렬을 위한 배열
   //Nums 배열 생성 nameArr= 행 개수
   Nums[] arr = new Nums[nameArr.length];
   //2차열 포기.. 클래스에 넣는방법을 모르겠습니다..
   
   //입력부
   for (int i = 0; i < arr.length; i++) {
      arr[i] = new Nums(nameArr[i], korArr[i], engArr[i], mathArr[i]);
   }
   //랭크계산 
   for (Nums element : arr) {
      element.rankCalc(arr);
   }
   //배열처리
   for (int i = 0; i < nameArr.length; i++) {
      Nums student = arr[i];
      scoreArr[student.rank - 1] = i; 
      //등수 -1을
   }
   %>
   
   <!-- 출력부 -->
   <h1>결과result</h1>
   <table border="">
      <tr>
         <td>이름</td>
         <td>국어</td>
         <td>영어</td>
         <td>수학</td>
         <td>총점</td>
         <td>평균</td>
         <td>등급</td>
         <td>순위</td>
      </tr>

      <%
   
      
      for (int i = 0; i < nameArr.length; i++) {
         Nums student = arr[scoreArr[i]];
      %>

      <tr>
         <td><%=student.name%></td>
         <td><%=student.jum[0]%></td>
         <td><%=student.jum[1]%></td>
         <td><%=student.jum[2]%></td>
         <td><%=student.tot%></td>
         <td><%=String.format("%.2f", student.avg)%></td>
         <td><%=student.grade%></td>
         <td><%=student.rank%></td>
      </tr>
      <%
      }
      %>
   </table>
</body>
</html>