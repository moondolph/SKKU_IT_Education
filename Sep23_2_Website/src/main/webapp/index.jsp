<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/home.css">

</head>
<body>

<table  id="siteTitleArea">
		<tr>
			<td id="siteMenuArea" align="center">2022년 9월 23일</td>
		</tr>
		
		<tr>
			<td >     
				<div id="siteMenuArea">
				
				<table>
					<tr>
						<td><a href="HomeController"> Home </a></td>
						<td><a href="AController"> A </a></td>
						<td><a href="gallary.html"> B </a></td>
						<td><a href="visitorbook.html"> C </a></td>
					</tr>
				</table>
					
				</div>	
			</td>
		</tr>
	
	<tr>
		<td id="siteContent"><jsp:include page="${contentPage}"/></td>
	</tr>
		
</table>







</body>
</html>