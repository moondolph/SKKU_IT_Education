<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>���������� ����</title>
<link rel="stylesheet" href="css/rspInput.css">
</head>
<body>
	<form action="HomeController" name="rspForm"
		enctype="multipart/form-data" method="post">
		<table id="rspTbl" border="1">
			<tr>
				<th colspan="3">��������������!</th>
			</tr>

			<tr>
				<td colspan="3" align="center">�������� (�̹�����Ŭ��)</td>
			</tr>
			<tr>
				<td><button type="button" name="scissor">
						<img src="img/scissor.jpg">
					</button></td>
				<td><button type="button" name="rock">
						<img src="img/rock.jpg">
					</button></td>
				<td><button type="button" name="paper">
						<img src="img/paper.jpg">
					</button></td>
			</tr>
			<tr>
				<td colspan="3" align="center">�������:</td>
			</tr>

			<tr>
				<td colspan="3" align="center">����:</td>
			</tr>

		</table>
	</form>
</body>
</html>