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
		// JSP Model 2
		// V(.jsp)
		//		�� �ޱ� : EL	${XXX }
		
		// ������ �̵� 
		//		redirect, forward, include 
		
		// ���ǹ�, �ݺ��� 		
		// ������� (�Ҽ���, ��¥ ����, ...)
		
		// CustomTag
		// 		������� HTML DOM��ü
		//		.jsp -> servlet���� �ٲ� �� java�� ��ȯ!
		//			=> .jsp������ ��� ���� O
		//		<���ξ�:�±׸�>
		//			<xxx:table></xxx:table>		=> ���� �ݱ� �� ������!
		//			<xxx:table />				=> ���� �ݱ� ���̿� ������ ���ٸ�
		
		// JSPǥ�ؾ׼��±� 			
		// 		JSPȯ�濡�� �⺻������ ��� ����
		//		�� ���ξ jsp
		//		forward, include, ... 
		// Ŀ�����±� 
		//		�ܺ�.jar�� �ְ� ����� ��(jstl.jar)
		//		���ξ �������...
		//		�ݺ���, ���ǹ�, �������, ...
		//
	
	%>
	<h1>First</h1>
	<!-- second.jsp�� �ҽ��� �Ʒ���  -->
	<!-- ***���ϴ� �ڸ��� �־ ǥ���� �� �ִٴ°� ����  -->

<jsp:include page="second.jsp"></jsp:include>

	<h2>Third</h2>





</body>
</html>