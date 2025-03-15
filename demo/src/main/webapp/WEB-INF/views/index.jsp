<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> 뭐야 db 연결 성공한거야??? 그럼 한단계 더 해보자구!!! 야호!!!</h1>

	<form action="${pageContext.request.contextPath}/start.me" method="post">
	<input type="text" id="memID" name="memID"> 
	<input type="text" id="title" name="title">
	
	<button type="submit">확인</button>
	
	</form>



</body>
</html>