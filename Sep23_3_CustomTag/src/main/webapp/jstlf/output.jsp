<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- core가 있어야 fmt를 쓸 수 있다(X)  -->    
<!-- core / fmt 자주 쓰는 기능이라 보통은 둘 다 가져다 씀 -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<!-- fmt: 문자열 / 날짜 형태 포맷팅 -->
	<fmt:formatNumber value="${a }" type="number"/> <!-- 숫자  -->
	<hr>
	<fmt:formatNumber value="${a }" type="currency" currencySymbol="$"/> <!-- 숫자 -->
	<hr>
	<fmt:formatNumber value="${b }" type="percent"/> <!-- 퍼센트(소수점 반올림) -->
	<hr>
	<fmt:formatNumber value="${c }" pattern="#.00"/> <!-- 소수점 둘째자리까지(반올림) -->
	<hr>
	<!-- Date 속성
		: type = ("date / time" / 둘 다 )   
			1. date  
				dateStyle = "short / long"
			2. time
				timeStyle = "short / long"
			3. both 
				dateStyle = "short / long"
				timeStyle = "short / long"
	-->
	<fmt:formatDate value="${d }" type = "both" dateStyle="long" timeStyle="short"/><br>
	
	<!--패턴 -->
	<fmt:formatDate value="${d }" pattern = "yyyy-MM-dd E a hh"/>	<br>



</body>
</html>