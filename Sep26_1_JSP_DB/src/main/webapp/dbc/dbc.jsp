<%@page import="com.beaver.db.manager.BeaverDBManager"%>
<%@page import="java.sql.Connection"%>
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
		// ��Ĺ�� Ʃ��뿩�� ������ �� �� �˾Ƽ�
		// Ʃ�� = Connection ��ü
		
		// ���� : DriverManager.getConnection()�� �����ϴ� ���� 
		// ���õ� ��� �۾��� �ؼ� Connection ��ü�� ����� �� => ����
		
		// Ŀ�ؼ�Ǯ : �̸� Conenction��ü x 100�� �������� 
		// Ŭ���̾�Ʈ�� ��û�ϸ� -> ��������� �ϳ� �ָ� �� => ����
		
		// ���� - context.xml(���赵, �����ȹ�� ����)
		// Servers - context.xml
		// 		���� �ǵ��... ��ũ�����̽� �ȿ� �ִ� ��~~~�� ������Ʈ�� �� ���� 
		// 		������Ʈ�� �ٸ��� -> DB������ �ٸ���
		
		// �츮�� ���� context.xml�� �� ������Ʈ�� META-INF ������ ���� !
		
		String result = "����";
		
		Connection con = null;
		try{
			con = BeaverDBManager.connect("beaverPool");
			result = "����";
		}catch (Exception e){
			e.printStackTrace();
		}
		BeaverDBManager.close(con, null, null);
	%>
	<h1>DB����</h1>
	<h1><%=result %></h1>



</body>
</html>