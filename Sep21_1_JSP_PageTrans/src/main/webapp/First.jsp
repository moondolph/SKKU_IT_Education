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
	First.jsp���� �� ���ڸ� �Է����� ��
	Second.jsp���� �� ���� ������ִ� ���

<hr>
<a href="Second.jsp?a=10&b=20">&lt;a&gt;�� [GET��� ��û]</a>
<hr>
<div onclick="gogo();"> JavaScript�� [GET��� ��û]</div>
<hr>

<form action="">
	a : <input> <br>
	b : <input> <p>
	 <button>form + button �������� [GET / POST��� ��û]</button>
  </form>

<!-- <form action="Second.jsp">
		���� : <input name="number"> <p>
		<button>Ȯ��</button>
	</form> -->


	
	
</body>
</html>