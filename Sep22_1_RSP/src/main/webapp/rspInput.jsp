<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>가위바위보 게임</title>
<link rel="stylesheet" href="css/rspInput.css">
</head>
<body>
	<form action="HomeController" name="rspForm"
		enctype="multipart/form-data" method="post">
		<table id="rspTbl" border="1">
			<tr>
				<th colspan="3">가위바위보게임!</th>
			</tr>

			<tr>
				<td colspan="3" align="center">유저선택 (이미지↓클릭)</td>
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
				<td colspan="3" align="center">판정결과:</td>
			</tr>

			<tr>
				<td colspan="3" align="center">전적:</td>
			</tr>

		</table>
	</form>
</body>
</html>