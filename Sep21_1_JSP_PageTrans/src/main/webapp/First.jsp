<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	function gogo(){
		location
	}




</script>
</head>
<body>
	First.jsp에서 두 숫자를 입력했을 때
	Second.jsp에서 그 합을 출력해주는 기능

<hr>
<a href="Second.jsp?a=10&b=20">&lt;a&gt;로 [GET방식 요청]</a>
<hr>
<div onclick="gogo();"> JavaScript로 [GET방식 요청]</div>
<hr>

<form action="">
	a : <input> <br>
	b : <input> <p>
	 <button>form + button 조합으로 [GET / POST방식 요청]</button>
  </form>

<!-- <form action="Second.jsp">
		숫자 : <input name="number"> <p>
		<button>확인</button>
	</form> -->


	
	
</body>
</html>