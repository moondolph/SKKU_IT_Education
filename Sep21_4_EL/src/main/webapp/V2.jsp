<%@page import="java.util.ArrayList"%>
<%@page import="com.beaver.sep214.main.Beaver"%>
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
		// ��EL (Expression Language)
		// 		�� ������ Java��� ����
		// 		.jsp������ ��밡��(.jsp�� ��Ĺ�� Servlet���� �ٲܶ� EL�� Java�ڵ�� �ٲ���)
		
		//		���� : ${### }
		//			������ ��� ���� 
		//			�� ��ȯ �ڵ�
		//			���� ������ �׳� �Ѿ
		//			import�� ��� �� ! 
		//										
		//
		//
		
		//		�Ķ���Ͱ� �б� : ${param.�Ķ���͸� } 
		
		//		��Ʈ����Ʈ�� �б�(int, double, String, ... ����)		
		//				: ${��Ʈ����Ʈ�� }
		
		//		��Ʈ����Ʈ�� �б�(��ü)				
		//				�ּҰ� - ${��Ʈ����Ʈ�� }
		//				�Ӽ��� - ${��Ʈ����Ʈ��.��������� }
		//
		
		//		��Ʈ����Ʈ�� �б�(List, [])
		//				AL / [] ��ü 			- ${��Ʈ����Ʈ��}
		//				�ε��� ��ġ�� ��ü		- ${��Ʈ����Ʈ��[�ε���] }
		//				�ε��� ��ġ�� ��ü �Ӽ�  - ${��Ʈ����Ʈ��[�ε���].���������}
		
		//		�ݺ���, ���ǹ� - EL (X) / CustomTag (O)
	%>

	<% 
		String x = request.getParameter("x");
		String y = request.getParameter("x");
		int z = (Integer) request.getAttribute("z");
		
		Beaver b = (Beaver) request.getAttribute("b");
		
		ArrayList<Beaver> bvs = (ArrayList<Beaver>) request.getAttribute("bvs");	
	
	%>
	
	<h1>���</h1> 
	<%=x %> x <%=y %> = <%=z %> <br>
	<%=b.getName() %> : <%=b.getAge() %> : <%=b.getHeight() %> : <%=b.getWeight() %> <p>
	<%=b %> <p>
	
	<%=bvs %> <p>
	
	<%=bvs.get(1) %> <p>
	
	<%=bvs.get(2).getName() %>, <%=bvs.get(3).getAge() %> <p>

	<% 
		for(int i=0; i < bvs.size(); i++) {
	%>
		<%= bvs.get(i).getName() %> : <%=bvs.get(i).getAge() %>�� <br>
	<% 
		}
	%>
	<hr>
	${param.x } <p>
	${param.y } <p>
	${param.x * param.y} <p>
	${z } <p>
	<hr>
	${b.name } : ${b.age } : ${b.height } : ${b.weight } <p>
	<hr>
	${param.klsdjhfklsdfsdklfsdklf } <!-- ���� ���� �� �׳� �Ѿ�� ���� -->
	<hr>
	${bvs }<p>
	${bvs[1] } <p>
	${bvs[2].name }, ${bvs[3].age } <p>
	
</body>
</html>