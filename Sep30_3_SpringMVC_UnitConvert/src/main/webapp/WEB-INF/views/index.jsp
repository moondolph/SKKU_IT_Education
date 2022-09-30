<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/index.js"></script>

</head>
<body>

<form action="  " method = "post">
단위변환
<hr>
<input placeholder="입력" name=input> <p>
<select name="type">
	<option value="cm">cm->inch</option>
	<option value="mm">m^2->평</option>
	<option value="c">℃->℉</option>
	<option value="mi/h">mi/h->km/h</option>
</select>
<button>버튼</button>
</form>

<!--  
1.index.jsp페이지에서 화면 구성. 버튼 누르면 <form>으로 값을 넘김

2.입력한 input값과 option값을 받아서 계산하는 메소드 만들어서 결과값을

3.결과를 출력하는 result.jsp에 넘김.

-->


</body>
</html>