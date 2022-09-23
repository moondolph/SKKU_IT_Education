<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- core�� �־�� fmt�� �� �� �ִ�(X)  -->    
<!-- core / fmt ���� ���� ����̶� ������ �� �� ������ �� -->    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>


	<!-- fmt: ���ڿ� / ��¥ ���� ������ -->
	<fmt:formatNumber value="${a }" type="number"/> <!-- ����  -->
	<hr>
	<fmt:formatNumber value="${a }" type="currency" currencySymbol="$"/> <!-- ���� -->
	<hr>
	<fmt:formatNumber value="${b }" type="percent"/> <!-- �ۼ�Ʈ(�Ҽ��� �ݿø�) -->
	<hr>
	<fmt:formatNumber value="${c }" pattern="#.00"/> <!-- �Ҽ��� ��°�ڸ�����(�ݿø�) -->
	<hr>
	<!-- Date �Ӽ�
		: type = ("date / time" / �� �� )   
			1. date  
				dateStyle = "short / long"
			2. time
				timeStyle = "short / long"
			3. both 
				dateStyle = "short / long"
				timeStyle = "short / long"
	-->
	<fmt:formatDate value="${d }" type = "both" dateStyle="long" timeStyle="short"/><br>
	
	<!--���� -->
	<fmt:formatDate value="${d }" pattern = "yyyy-MM-dd E a hh"/>	<br>



</body>
</html>