<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/baseball.css">
<script type="text/javascript">
function checkValid() {
	let numInput = document.ff.num; // document.form�̸�.input�̸�
	 if(isNaN(numInput.value)){
		alert("���� �Է� �� �ϳ�???");
		numInput.focus(); //Ŀ�� ���ٳ��� 
		numInput.value = ""; //������ ��� �� �����
		return false;
	}	
	 
	 
	 
	 else if(numInput.value.length < 3) {
		alert("���� ���ڸ� �Է��϶�� ���ڳ� �Ѥ� ");
		heightInput.focus();
		heightInput.value = ""; //������ ��� �� �����
		return false;
	}
}	
</script>
</head>
<body>
	<form action="HomeController" name="ff" onsubmit="return checkValid()">
<table border="1" align="center">
	<tr>
		<th> ���ھ߱����� </th>
	<tr>
		<td align="center"> �����Է�(3�ڸ�) <input name="num" maxlength="3" > </td>
	</tr>
	
	<tr>
		<td align="center"><button type="submit">��ư</button></td>
	</tr>
	
	<tr>
		<td align="center">������ ��: <br>    <!--��ư ������ ���̱� ����  -->
						   S: ?	<br>
						   B: ? <br>
		</td>
	</tr>
	
	<tr>
		<td align="center">??��° �õ�</td>	<!--��ư ������ ���̱� ���� -->
	</tr>
	<tr>
		<td align="center">������ ???</td>	<!-- ���� ���� ������ ����! -->
	</tr>
	

</table>
	</form>
</body>
</html>