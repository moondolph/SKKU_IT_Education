<%@page import="java.util.Random"%>
<%@page import="java.util.StringTokenizer"%>
<%@page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 
	// ��
	//		parameter  
	//			html���� ���� ��(a, b)
	//			request�� ����
	//			String or String[]
	
	//		attribute 
	// 			Java���� ���� ��(c, d, e) 
	//			request�� ���� 
	//			Object(��ü)
	//			
%>
<% 
	// �̵�
	// first -> second : ����ڰ� ���� �׼��� �ؼ� �Ѿ��
	//	- request(��û)
	
	// second -> third : �׳� �Ѿ
	// 		- redirect : �ܼ� �ڵ��̵�(������
	//			response.sendRedirect("Third.jsp");

	//		- ��forward : �ڵ��̵�(���� ���޵Ǵ�)
	//			RequestDispathcer rd = request.getRequestDispatcher("Third");
	//			rd.forward(request, response);
	
	//		- include : ����(Second�ӿ� Third�� ���ԵǴ�)
	//			��ġ������ �ȵ�(Third�� ������ ��ܿ� ����) - ���� !
	//			������ ! ��ġ������ �Ǵ� include�� ������ ���� ~
	//			RequestDispatcher id = request.getRequestDispatcher("Third");
	//			rd.include(request, response);
	
	
%>


<% 
	request.setCharacterEncoding("EUC-KR");
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));

	
	// RequestDispatcher : Ŭ���̾�Ʈ�κ��� ���� ��û�� ���ϴ� ������ �ѱ�� ��� 
	// ȣ��� ������������ request.setAttribute(key, value) �޼ҵ带 ���ؼ� 
	// �Ѱܹ��� �����͸� ó���� �� ���� 
	// -> Redirect�ʹ� �ٸ���(������ó���� ���ϴ� Redirect)
	//		request�� response ��ü�� ������ �Ѿ�� ������ 
	//
	
	RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
	int c = a + b ;
	request.setAttribute("c", c);
	
	String d = "��";
	request.setAttribute("d", d);
	
	Random e = new Random();
	request.setAttribute("e", e);
	
	//rd.forward(request, response);
	rd.include(request,response);
%>

<h1>Second</h1>
<hr>
a : <%=a %> <br>
b : <%=b %> <br>

  <%-- String num = request.getParameter("number");

	StringTokenizer st = new StringTokenizer(num, ",");
	
	while (st.hasMoreTokens()){
		try{
			%> <%=Integer.parseInt(st.nextToken())%>
		<% } catch(Exception e){
		}
	} %> --%>
	
	
</body>
</html>