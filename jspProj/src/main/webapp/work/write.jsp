<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>write number</title>
<script>

</script>
</head>
<body>

	<form action="outnumber.jsp" id="hi">
		<table>
			<tr>
				<h1>주민번호 앞자리 6자리와 뒷번호 처음 1자리를 입력해주세요</h1>
				<td><input type="text" name="first">-
				<td><input type="text" name="second"></td>
				<td><input type="text" name="name"></td>
				
			</tr>
			<tr>
			
				<td colspan="10" align="center"><input type="submit" value="계산" />
			</tr>
		</table>
	</form>
	
		
	
</body>
</html>