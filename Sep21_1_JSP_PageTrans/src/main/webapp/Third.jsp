<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		// Parameter �б� 
		int a = Integer.parseInt(request.getParameter("a"));
	
		String bbb = request.getParameter("b"); // String 
		Integer bb = Integer.parseInt(bbb);  // String->Integer
		int b = bb.intValue();				 // Integer -> int
	
		//Attribute �б�
		Object ccc = request.getAttribute("c"); //Object
		Integer cc = (Integer) ccc; 			//Object -> Integer
		int c = cc.intValue();					//Integer -> int
		
		String d = (String) request.getAttribute("d");
		Random e = (Random) request.getAttribute("e");
	%>
	<h1>Third</h1>
	a : <%=a %>	<br>
	b :	<%=b %> <br> 
	c :	<%=c %> <br>
	d : <%=d %> <br>
	e : <%=e.nextInt(100) + 1 %> <br>












</body>
</html>