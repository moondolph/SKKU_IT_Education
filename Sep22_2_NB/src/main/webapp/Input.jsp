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
	let numInput = document.ff.num; // document.form이름.input이름
	 if(isNaN(numInput.value)){
		alert("숫자 입력 안 하냐???");
		numInput.focus(); //커서 갖다놓기 
		numInput.value = ""; //기존에 썼던 거 지우기
		return false;
	}	
	 
	 
	 
	 else if(numInput.value.length < 3) {
		alert("숫자 세자리 입력하라고 했자나 ㅡㅡ ");
		heightInput.focus();
		heightInput.value = ""; //기존에 썼던 거 지우기
		return false;
	}
}	
</script>
</head>
<body>
	<form action="HomeController" name="ff" onsubmit="return checkValid()">
<table border="1" align="center">
	<tr>
		<th> 숫자야구게임 </th>
	<tr>
		<td align="center"> 숫자입력(3자리) <input name="num" maxlength="3" > </td>
	</tr>
	
	<tr>
		<td align="center"><button type="submit">버튼</button></td>
	</tr>
	
	<tr>
		<td align="center">유저의 답: <br>    <!--버튼 누르면 보이기 시작  -->
						   S: ?	<br>
						   B: ? <br>
		</td>
	</tr>
	
	<tr>
		<td align="center">??번째 시도</td>	<!--버튼 누르면 보이기 시작 -->
	</tr>
	<tr>
		<td align="center">정답은 ???</td>	<!-- 정답 맞춘 시점에 나옴! -->
	</tr>
	

</table>
	</form>
</body>
</html>