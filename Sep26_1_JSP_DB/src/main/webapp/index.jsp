<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">

</head>

<body>

<table  id="siteTbl" >
		<tr>
			<th id="siteTitleArea"><a href="HomeController">Title</a></th>
		</tr>
		
		<tr>
			<td id="siteContentArea" align="center"><jsp:include page="${cp}"/></td>     
		</tr>		
</table>

<table id = "siteMenutbl">
					<tr>
						<td align="center"><a href="AppleController"> Apple </a></td>
						<td align="center"><a href="BananaController"> Banana </a></td>
						<td align="center"><a href="CoconutController"> Coconut </a></td>
						<td align="center"><a href="DBCController"> DB연결 </a></td>
					</tr>
</table>




</body>
</html>