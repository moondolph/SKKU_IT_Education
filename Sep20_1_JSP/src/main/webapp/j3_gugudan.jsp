<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
<table border =1 >
    <!-- ù �� -->
    <tr>
    <td bgcolor="#F0AEE0"> </td>
    <%for(int i=2; i<=9; i++){    %>
     <td bgcolor="#F0AEE0"><%= i+"��" %></td>
    <% } %>
    </tr>
    
    <!-- �ٱ� for -->
    <% for(int i=1; i<=9; i++){    %>
    <tr>
    <td width="50" align="center" bgcolor="#F0AEE0"><%=i%></td>
    
    <!-- ���� for -->
    <% for(int j=2; j<=9; j++){%>
    <td><%=j + "*" + i + "=" + j * i  %></td>
    
    <%-- ���� ���� ���� --%><% } %>
    <!--�ٱ� ����  -->
    <!-- tr�� --></tr>
    <!--�ٱ����� ����  --> <%} %>
    
</table>
 </center>

</body>
</html>