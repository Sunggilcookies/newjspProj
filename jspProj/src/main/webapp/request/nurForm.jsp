<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>

	<form action="result.jsp" id="table">
		<table border="">
			<tr>
				<td>이름</td>
				<td>국어</td>
				<td>영어</td>
				<td>수학</td>

			</tr>
			<c:forEach var="row" begin="1" end="5">
				<tr>
					<td><input type="text" name="name" value="" /></td>
					<td><input type="text" name="korea" value="" /></td>
					<td><input type="text" name="english" value="" /></td>
					<td><input type="text" name="math" value="" /></td>

				</tr>
			</c:forEach>

			<tr>
				<td colspan="10" align="center"><input type="submit" value="계산" />

				</td>
			</tr>

		</table>
	</form>
</body>
</html>