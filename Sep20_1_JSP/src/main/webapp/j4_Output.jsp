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
	//����) ��û�Ķ���� -> �ѱ�ó��
	//		GET - ����
	//		POST - �ؾ���
	// ���� ���� ����� �� ���� �ϴ� �ϰ���!
	request.setCharacterEncoding("EUC-KR");
	
	// ���� ) ���� �ѱ�ó�� (������ ���ְ� �־ �ʿ����)
	// ex) 1 ~ 2 ����, 6����	
	// response.setCharacterEncoding("EUC-KR");

	String name = request.getParameter("name");
	int x = Integer.parseInt(request.getParameter("x"));
	int y = Integer.parseInt(request.getParameter("y"));
	int z = x+y;
%>
�̸� : <%=name %> <p>
<h1><%=x %> + <%=y %> = <%=z %></h1>







</body>
</html>