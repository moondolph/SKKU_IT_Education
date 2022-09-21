<%@page import="java.util.StringTokenizer"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	
	function getRandomColor(){
	//	Math.random()					-> 0.0 ~ 0.99999		
	//	Math.random() * 255				-> 0.0 ~ 254.99999	
	//	Math.round(Math.random() * 255) -> 0 ~ 255
	
	let r = Math.round(Math.random() * 255);
	let g = Math.round(Math.random() * 255);
	let b = Math.round(Math.random() * 255);
	
	return "rgb(" + r + "," + g + "," + b + ")";
	}
	
	function init(){
		let cv = document.getElementById("cv");		
		let pen = cv.getContext("2d");
		let x = null;
		let y = null;
	
	
	setInterval(() => {
		pen.save(); // ���� pen���� ����
		pen.fillStyle = "rgba(0, 0, 0, 0.2)"; //���� : 0 ~ 1
		pen.fillRect(0, 0, 500, 500);
		
		pen.shadowOffsetx = 0;
		pen.shadowOffsety = 0;
		pen.shadowBlur = 5;
		pen.shadowColor = "white";
	
		x = Math.random() * 500;
		y = Math.random() * 500;
		pen.fillStyle = getRandomColor();
		pen.fillRect(x, y, 20, 20);
		
		pen.restore();	//���� ��������
		
	}, 200);
	
	}	
	
	
	
</script>
</head>
<body onload="init();">
	<canvas id="cv" width="500px" height="500px"></canvas>
	<hr>
	<% 
	response.sendRedirect("test.jsp");
	request.setCharacterEncoding("EUC-KR");
	
	String num = request.getParameter("number");
	
	// Split
	String[] numData = num.split(",");
	
	
	int sum1 = 0;
	
	for (String n : numData){
		try {
			sum1 += Integer.parseInt(n);
		} catch (Exception e){
			
		}
	}
	
	//StringTokinizer
	StringTokenizer st = new StringTokenizer(num, ",");
	int sum2 = 0;
	while (st.hasMoreTokens()){
		try{
			sum2 += Integer.parseInt(st.nextToken());
		} catch(Exception e){
		}
	}
	%>
	��(Split) : <%=sum1 %> <br>
	��(StringTokenizer) : <%=sum2 %>	
	
</body>
</html>