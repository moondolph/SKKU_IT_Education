<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<h1>${param.n }</h1>
	<!-- 조건문 -->	
	<c:if test="${param.n % 2 == 0 }">
		짝수
	</c:if>
	<c:choose>
		<c:when test="${param.n>10 }">
			10보다 크다
		</c:when>
		<c:when test="${param.n> 5 }">
			5~10사이
		</c:when>
		<c:otherwise>
			나머지
		</c:otherwise>
	</c:choose>
	<hr>
	
	
	<%
		for (int i=1; i<=5; i+=2){
		System.out.println(i);
		}
	%>
	
	<!-- 반복문 -->
	<c:forEach var="v" begin="1" end="${param.n}" step="2">
		<marquee>${v }</marquee>
	</c:forEach>
	<hr>
	<%
	//	for (int i : ar){
	//		System.out.println(i);
	//	}
	%>
	<c:forEach var="i" items="${ar }">
		<marquee>${i }</marquee>
	</c:forEach>
	<hr>
	<c:forEach var="beaver" items="${al }">
		${beaver.name } - ${beaver.age }<br>
		
	<!-- try-catch  -->
	<c:catch var="myExcept">
		<%int result = 100 / 2; %>
		계산결과 : <%=result %>	
	</c:catch>	
	<br>
	
	<c:catch var="myExcept">
		<%int result = 100 / 0; %>
		계산결과 : <%=result %>	
	</c:catch>	
	
	<c:if test="${myExcept != null }">
		에러 발생 : ${myExcept.message }
	</c:if>


	
	
	</c:forEach>
	<hr>
	
	
</body>
</html>