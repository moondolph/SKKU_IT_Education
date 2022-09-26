<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/apple.css">
</head>
<body>
	<table id="appleTbl" border="1" >
		<tr>
			<td align="right">${r } <a href="AppleRegController">등록</a></td>
		</tr>
		
		<tr>
			<td id="appleBoard" align="center">
				<table id="appleContext">
					<tr>
						<th>지역</th>
						<th>가격</th>
					</tr>
					<c:forEach var="apple" items="${apples }">
						<tr id="dataTr">
							<td>${apple.a_location }</tD>
							<td>
								<fmt:formatNumber value="${apple.a_price }"
								type="number"/>
							</td>
						</tr>
					</c:forEach>
				</table>			
			</td>		
		</tr>
	</table>
	<img src="img/apple.jfif" id="apple">
	<img src="img/apple2.jfif" id="apple2">
</body>
</html>