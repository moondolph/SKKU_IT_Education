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
	//GET / POST
	//원래) 요청파라미터 -> 한글처리
	//		GET - 안함
	//		POST - 해야함
	// 할지 말지 고민이 될 때는 일단 하고보자!
	request.setCharacterEncoding("EUC-KR");
	
	// 원래 ) 응답 한글처리 (위에서 해주고 있어서 필요없음)
	// ex) 1 ~ 2 번줄, 6번줄	
	// response.setCharacterEncoding("EUC-KR");

	String name = request.getParameter("name");
	int x = Integer.parseInt(request.getParameter("x"));
	int y = Integer.parseInt(request.getParameter("y"));
	int z = x+y;
%>
이름 : <%=name %> <p>
<h1><%=x %> + <%=y %> = <%=z %></h1>







</body>
</html>