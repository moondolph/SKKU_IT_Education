<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Third</h1>
	<hr>
	a : ${param.a } <br>
	b : ${param.b } <br>
	c : ${cc } <br>
	d : ${sessionScope.d } <br>
	<%
		// ���������� ���ѷ������� ��� : include�� �߸����� ��
		//						 ���� ������ include ���� ��
	%>
	
	<hr>
	<jsp:include page="${baby }"/>
</body>
</html>