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
	// 값
	//		parameter  
	//			html에서 만들어낸 값(a, b)
	//			request에 저장
	//			String or String[]
	
	//		attribute 
	// 			Java에서 만들어낸 값(c, d, e) 
	//			request에 저장 
	//			Object(객체)
	//			
%>
<% 
	// 이동
	// first -> second : 사용자가 뭔가 액션을 해서 넘어옴
	//	- request(요청)
	
	// second -> third : 그냥 넘어감
	// 		- redirect : 단순 자동이동(점검중
	//			response.sendRedirect("Third.jsp");

	//		- ★forward : 자동이동(값이 전달되는)
	//			RequestDispathcer rd = request.getRequestDispatcher("Third");
	//			rd.forward(request, response);
	
	//		- include : 포함(Second속에 Third가 포함되는)
	//			위치조절은 안됨(Third가 무조건 상단에 들어옴) - 비추 !
	//			조만간 ! 위치조절이 되는 include를 보도록 하자 ~
	//			RequestDispatcher id = request.getRequestDispatcher("Third");
	//			rd.include(request, response);
	
	
%>


<% 
	request.setCharacterEncoding("EUC-KR");
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));

	
	// RequestDispatcher : 클라이언트로부터 들어온 요청을 원하는 쪽으로 넘기는 기능 
	// 호출된 페이지에서는 request.setAttribute(key, value) 메소드를 통해서 
	// 넘겨받은 데이터를 처리할 수 있음 
	// -> Redirect와는 다르게(데이터처리를 못하는 Redirect)
	//		request와 response 객체를 가지고 넘어가기 때문에 
	//
	
	RequestDispatcher rd = request.getRequestDispatcher("Third.jsp");
	int c = a + b ;
	request.setAttribute("c", c);
	
	String d = "ㅋ";
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