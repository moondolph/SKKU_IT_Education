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
			<td>지역 : </td>
			<td>	
				<input name="a_location" autocomplete="off"
				autofocus="autofocus" placeholder="지역" class="inputt">
			</td>
		</tr>
		<tr>
			<td>색 : </td>
			<td>
				<select name="a_color" class="slt">
					<option>빨강</option>
					<option>초록</option>
					<option>노랑</option>
					<option>황금</option>
				</select>		
			</td>
		</tr>
		<tr>
			<td>맛: </td>
			<td>
				<select name="a_flavor" class="slt">
					<option>단맛</option>
					<option>신맛</option>
					<option>떫은맛</option>
					<option>쓴맛</option>
					<option>노맛</option>
				</select>		
			</td>
		</tr>
		<tr>
			<td>가격 : </td>
			<td>
				<input name="a_price" autocomplete="off"
				placeholder = "숫자만 입력" class ="inputt">
			</td>
		</tr>
		<tr>
			<td> 설명 : </td>
			<td>
				<textarea name = "a_introduce" maxlength="80"
				autocomplete="off" id="textArea"
				placeholder="5자 이상"></textarea>				
			</td>
		</tr>
		<tr>
			<td>
				<button>등록</button>
			</td>
		</tr>	
	</table>

</form>

</body>
</html>