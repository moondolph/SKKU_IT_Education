<%@page import="java.net.URLEncoder"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>BMI Result</title>
<link rel="stylesheet" href="css/BMIOutput.css">
</head>
<body>
	<table id="resultTbl">
		<tr>
			<th colspan="2">BMI Result</th>
		</tr>
		<tr>
			<td class="td1" align="center">�̸�</td>
			<td class="td2">${g.name}</td>
		</tr>
		<tr>
			<td class="td1" align="center">Ű</td>
			<td class="td2">${g.height * 100 }cm</td>
		</tr>
		<tr>
			<td class="td1" align="center">������</td>
			<td class="td2">${g.weight }kg</td>
		</tr>
		<tr>
			<td class="td1" align="center">BMI</td>
			<td class="td2">${g.bmi}</td>
		</tr>
		<tr>
			<td class="td3" colspan="2" align="center">
				<marquee>����� ${g.status } �Դϴ�.</marquee>
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<img src="img/${g.photo }" style="max-width: 60%; height: auto;">
			</td>
		</tr>
	</table>
</body>
</html>












