<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/BeaverValidChecker.js"></script>
<script type="text/javascript" src="js/calcCheck.js"></script>
<link rel="stylesheet" href="css/index.css">

</head>
<body>

	<table id="siteTitleArea">
		<tr>
			<td id="siteMenuArea" align="center">2022년 9월 23일</td>
		</tr>

		<tr>
			<td>
				<div id="siteMenuArea">

					<table>
						<tr>
							<td><a href="HomeController"> Home </a></td>
							<td><a href="CalcController"> 사칙연산 </a></td>
							<td><a href="bController"> JSTL - C </a></td>
							<td><a href="JSTLFController"> JSTL - F </a></td>
						</tr>
					</table>

				</div>
			</td>
		</tr>

		<tr>
			<td id="siteContent"><jsp:include page="${contentPage}" /></td>
		</tr>


	</table>
</body>
</html>