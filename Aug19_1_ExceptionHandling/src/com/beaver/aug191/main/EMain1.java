package com.beaver.aug191.main;

import java.util.Scanner;

// 프로그램 실행 => 콘솔창에 빨간글씨로 ~~~~ 나오는 걸 => 에러 / 버그 / 오류 알림 / 경고문

// error 
// 		한국어 - 번역 -> 영어
// 		사과			 apple 	
//		바나나		 banana
//		띱퀭           ???
// 	Java의 문법에 안맞게 써서 컴파일이 불가능한 상태 
// 	개발자 잘못 ! 
// 	완성본은 나오지 않음

// 	warning
//		지저분한 코드
//		개발자 잘못 !
//		컴파일은 가능하니 => 완성본은 나옴(실행하는데 문제 없음 O)
//		이클립스가 잔소리를 함..!
//		ex) Scanner 객체 만들고 나서 => 이 기능을 안 닫음

// 	exception
//		프로그램은 100% 완성!		
//		실행할 때 뭔가 외부적인 요인에 의해서 작동이 제대로 안되는 상황 ...
//		개발자 잘못은 아님 
//		개발자 입장 -> 개발자가 상황을 예측해서 대책은 세워놓자 ...!
//

public class EMain1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("x : ");
		int x = k.nextInt();

		System.out.print("y : ");
		int y = k.nextInt();

		System.out.printf("x + y : %d\n", x + y);
		System.out.printf("x - y : %d\n", x - y);
		System.out.printf("x * y : %d\n", x * y);
//		System.out.printf("x / y : %d\n", x / y);

		// 만약에 y 값에 0을 넣으면 ...? => Exception 발생 !
		
		// Exception 처리를 할 수 있는 방법 !
//		try {
//			일단 이 부분을 실행 - (내용)
//		} catch (예외유형 변수명) {
//			try쪽을 실행하다가 해당 유형의 예외가 발생하면 이 부분을 실행 
//			만약, 예외 없이 정상적으로 실행됐을 경우, catch부분은 그냥 지나치고
//			그 다음 소스를 실행
//		} catch (Exception e) {
//			...
//		} finally {
//			정상적으로 프로그램이 실행됐던지,
//			예외가 터졌던지 상관없이 실행.
//			return보다 먼저 실행

		
		// 두가지 문제가 동시에 터진 경우? => 먼저 나온 catch의 내용만 출력
		// JAVA의 입장에서 첫번째 예외가 터졌을 때
		// 즉시 실행 중지 후 해당 예외처리부분으로 넘어가기 때문!
		
		// x : 10, y : 0 => 70 - 71 (Arith) - 75 - 76
		// x : 10, y : 1 => 70 - 71 - 72 - 73 - 76 - 77 
		// x : 2, y : 1 => 70 - 71 - 72 - 73 
		
		 try {
			 System.out.printf("x / y : %d\n", x / y);
			int[] ar = {1, 2, 3};
			 System.out.println(ar[x]);	
		} catch (Exception e) { // 모~~~든 exception을 다 잡아줌
			System.out.println("능지 떡락 ㅋ");
			e.printStackTrace();	//상황 출력 (개발자용)
		} finally {
			System.out.println("엌ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
		}
		
		 
	}
}

