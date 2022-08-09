import java.util.Random;

public class FMain6 {

//	// B : 함수명 / 기능이 대충이라도 보이게, 동사같은 작명, 낙타체 or 뱀체 
//	// C : 파라미터 / 함수를 호출하는 쪽(main 함수)에서 해당 함수쪽으로 데이터를 보낼 때
//	//				( 자료형 변수명, 자료형 변수명, ... )
//	// A : 리턴타입 / 해당 함수에서 작업한 결과를 호출한 쪽(main 함수)으로 보낼 때
//	
//	// public static A B (C) {
//	//	  내용
//	//	  return
//	//  }
//	// 랜덤한 정수를 하나 구하는 함수
//	public static int getNum() {
////		Random r = new Random();
////		int getNum = r.nextInt();
////		return getNum ;
//		return new Random().nextInt();
//	}
//	
//	
//	// 두 정수를 더한 값을 출력하는 함수
//	public static void printSum(int a, int b) {
//		System.out.println(a + b);
//	}
//	
//	
//	public static void main(String[] args) {
//		int x = getNum();
//		int y = getNum();
//		printSum(x,y);
//	}
	
	
	public static int getInt() {
		Random r = new Random();
		int getInt = r.nextInt();		
		return getInt ;
	}
	
	public static void printSum(int a, int b) {
		int plus = a + b ;
		System.out.println(plus);
	}
	
	
	
	
	
	public static void main(String[] args) {
		//랜덤한 정수를 2개 구해서...
		// 그 2개의 수를 더한 값을 출력
		int a=getInt();
		int b=getInt();
		System.out.println(a);
		System.out.println(b);
		printSum(a, b);
		
	}
	
}
	
	
	
	
	
	
	

