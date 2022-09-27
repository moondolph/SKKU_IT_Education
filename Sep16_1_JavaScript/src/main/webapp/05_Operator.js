document.write("잘 나옵니다" + '<br>');
document.write("----<br>----");
// 5.연산자
//	  산술 연산자 : + - * / %
 
// 거듭제곱

let num0 = 2**3;
document.write(num0 + "<br>");

//우선순위
//  (*, /) > (+, -)
 
//연산자를 줄여서 쓰는 것도 가능 O
 let num1 = 10;
 num1 = num1 + 5;
 document.write(num1 +"<br>");		//15
 num1 += 5;
 document.write(num1 + '<br>');		//20
 
 //증감연산자
 let num2 = 20;
 num2++;
 document.write(num2); // 21  
 document.write("<br>");
 
 let result = num2++;
 document.write(result); // 21
 document.write("<br>");
 document.write("-----------")
 document.write("<br>");
	 
	 result = ++num2;
 document.write(result); // 23

// -> ++을 뒤에 적으면 증가시키기 전의 값을 result에 담고, 
// 		    앞에 적으면 증가시킨 값을 result에 담음

//비교연산자(Java때와 같음!)
// < > <= >= == != 
document.write("---------------<br>");
document.write((10 > 5) + "<br>");
document.write((10 == 5) + "<br>");
document.write((10 < 5) + "<br>");
document.write("---------------<br>");

//"10"과 10이 같은지 확인해주세요!

document.write((10 == "10") + "<br>"); //true 
	// => 자동 형변환 때문에 true
document.write((10 === "10") + "<br>"); //false !!! 
 	// => ===, !== : 일치연산자 / 자료형까지도 비교를 해줌 / 꽤나 유용해요~ 
 
// 논리연산자
// || (OR)
// 여러개 중 하나라도 true면 true를 반환
// 	  -> 모든 값이 false일때만 false를 반환
// => 첫번째 true값을 발견하는 즉시 멈춤 

// && (AND)
// 모든 값이 true여야 true를 반환 
//	   -> 하나라도 false가 나오면 false를 반환
// => 첫번째로 false값을 발견하는 즉시 멈춤	

// ! (NOT)
// 반대의 값으로 반환 
// true -> false / false -> ture 
// 
//
//