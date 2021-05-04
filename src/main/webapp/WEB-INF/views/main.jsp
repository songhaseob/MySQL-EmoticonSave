<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/spring/emosave" method="get">
		<h1>이모지를 입력해주세요</h1>
		<input type="text" name="emo" id="emo"/>
		<button type="submit">전송</button>
	</form>
	
	<br>
	<table border="1">
		<tr>
			<th>이모지</th>
		</tr>
		<c:forEach items="${emolist }" var="i">
		<tr>
			<td>${i.emo }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>