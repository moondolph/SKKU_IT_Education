public class FMain3 {
	
	public static void test(int q) { // q(blue) : 파라미터
		System.out.println(q); // 10 (q/blue) (2번)
		q = 20;
		System.out.println(q); // 20 (q/blue) (3번)
		// test 영역으로 넘어온 이상 이쪽 내용을 다 끝내고 main 영역으로 다시 돌아간다.
	}
	
	public static void main(String[] args) {
		int q = 10;				// q (red) : 지역변수
		System.out.println(q); // 10(1번) (q/red)
		test(q);			   // test 함수가 호출, q (blue) 변수 생성
							   // q (blue)에 q(red)에 있는 값을 복사해서 넣어주기	
		System.out.println(q); // 10(4번)   main함수와 test함수는 서로 영향 x --> q = 10
		// 더 이상 내용이 없으니 프로그램이 종료!
		
	}

	
}
