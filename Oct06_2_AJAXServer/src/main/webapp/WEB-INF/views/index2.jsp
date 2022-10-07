<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/jQuery.js"></script>
<script type="text/javascript">
	$(function() {
	//	alert('asdf');		
	
	// AJAX(Asynchronous JavaScript And XML)
	$("#btn").click(function() {
		// AJAX 진행 
		$.ajax({	//함수 X, 객체 O
			url: "fruit.getXML", //URL속성에 value값(Controller에 설정한 요청주소)
			success: function(asd) { //요청 성공하면 function 동작
			 // alert(asd); // XML문서라는게 확인 		
			
			 // DOM객체 하나 불러올때마다 나오는 콜백함수 
			 $(asd).find("fruit").each(function(i, f){
				// alert(i + ") " + f); // index(0번부터), fruit 한 덩어리 
				let f_name = $(f).find("f_name").text();
				let f_price = $(f).find("f_price").text();
				alert(f_name + "] " + f_price);
			 
			 });
		   }
		});
		
	});
	
	// fruit.getXML에 요청해서
	// 나오는 모든 데이터들을 가지고
	// 테이블을 구성해주세요!
	$.ajax({
		url : "fruit.getXML", 
		success : function(asdf) {
			$(asdf).find("fruit").each(function(i, f) {
				let f_name = $(f).find("f_name").text();
				let f_price = $(f).find("f_price").text();
				
				let nameTd = $("<td></td>").text(f_name);
				let priceTd = $("<td></td>").text(f_price);
			
				let tr = $("<tr></tr>").append(nameTd, priceTd);
				
				$("#fruitTbl").append(tr);
			});
		} 	
	})
	// input에 숫자를 입력받아서 -> 검색 버튼을 누르면 
	// 입력한 숫자 이하의 가격인 과일들의 이름, 가격 데이터를 가지고 
	// 테이블을 구성하기 !(fruitTbl)
	$("#fruitSearchBtn").click(function(){
		//alert('asdf');
	
		let frVal = $("#fruitInput").val();
		$.ajax({
		//	url: "fruit.searchXML?f_price=" + frVal, // 요청 주소 
			url: "fruit.searchXML",
			data: {f_price : frVal},
			success: function(qwer) {
				$("#fruitTbl").empty();
				$(qwer).find("fruit").each(function(i, f){
					let f_name = $(f).find("f_name").text();
					let f_price = $(f).find("f_price").text();
					
					let nameTd = $("<td></td>").text(f_name);
					let priceTd = $("<td></td>").text(f_price);
				
					let tr = $("<tr></tr>").append(nameTd, priceTd);
					
					$("#fruitTbl").append(tr);
				});
			}
		});
	});
	
	$("#fruitInput").keyup(function(e){
		// if(e.keyCode == 13) {
			$("#fruitSearchBtn").trigger("click");
			
		// }
		
	});
	
	
	
	
	
	
	
	
	
	
});
</script>
</head>
<body>
	<table id="fruitTbl" border="1"></table>
	<hr>
	<input id="fruitInput"><button id="fruitSearchBtn">검색</button>
	<hr>
	<button id="btn">버튼</button>
</body>
</html>