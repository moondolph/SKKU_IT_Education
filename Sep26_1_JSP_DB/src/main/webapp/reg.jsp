<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>Apple</h2>
<form action = "AppleRegController" method="post" name="appleRegForm">  
	<table id="regTbl">
		<tr>
			<td>���� : </td>
			<td>	
				<input name="a_location" autocomplete="off"
				autofocus="autofocus" placeholder="����" class="inputt">
			</td>
		</tr>
		<tr>
			<td>�� : </td>
			<td>
				<select name="a_color" class="slt">
					<option>����</option>
					<option>�ʷ�</option>
					<option>���</option>
					<option>Ȳ��</option>
				</select>		
			</td>
		</tr>
		<tr>
			<td>��: </td>
			<td>
				<select name="a_flavor" class="slt">
					<option>�ܸ�</option>
					<option>�Ÿ�</option>
					<option>������</option>
					<option>����</option>
					<option>���</option>
				</select>		
			</td>
		</tr>
		<tr>
			<td>���� : </td>
			<td>
				<input name="a_price" autocomplete="off"
				placeholder = "���ڸ� �Է�" class ="inputt">
			</td>
		</tr>
		<tr>
			<td> ���� : </td>
			<td>
				<textarea name = "a_introduce" maxlength="80"
				autocomplete="off" id="textArea"
				placeholder="5�� �̻�"></textarea>				
			</td>
		</tr>
		<tr>
			<td>
				<button>���</button>
			</td>
		</tr>	
	</table>

</form>

</body>
</html>