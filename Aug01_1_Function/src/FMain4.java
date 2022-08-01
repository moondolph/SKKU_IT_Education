

public class FMain4 {
	
	// 오버로딩(Overloading) *** 고오오오오오오오오급 기술! 면접빈출질문
	// 함수명 같게, 파라미터를 다르게 하는 기술
	// 호출할 때 어떤 값을 넣었느냐에 따라 함수가 불러지게 하는 기술
	
	// 같은 자료형을 써도, 파라미터의 개수가 다르면 오버로딩 가능
	// 파라미터의 개수가 같아도, 다른 자료형을 사용하면 오버로딩 가능
	
	// 정수 2개를 넣으면 그 합을 출력해주는 함수
	
	public static void printSum(int a, int b) {
		
		System.out.println(a + b);
	}
	
	// 정수 3개를 넣으면 그 합을 출력해주는 함수
	
	public static void printSum(int a, int b, int c) {
		
		System.out.println(a + b + c);
	}
	
	// 실수 3개를 넣으면 그 합을 출력해주는 함수
	public static void printSum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	// 정수 1개를 넣으면 -> 윽! 출력 
	public static void tried(int sdjkflsd) {
		System.out.println("윽 !");
	}
	// 문자열 1개를 넣으면 -> 악! 출력
	public static void tired(String askfdjas) {
		System.out.println("악 !");
	}
	
	// 실수 1개를 넣으면 -> 으아아악
	public static void tired(double zxcvzxvc) {
		System.out.println("으아아악 !");
		
	}
	// 아무것도 넣지 않으면 -> ... 출력
	public static void tired() {
		System.out.println("...");
	

		
	}	
	public static void main(String[] args) {
		printSum(10,20);
		printSum(10,20,30);
		printSum(10,20,30);
		System.out.println("------------");
		tired(1);
		tired("asdf");
		tired(1.1);
		tired();
		
		// 오버로딩...을 알아봤는데...
		// 사실 우리는 첫 날부터 이 오버로딩을 사용하고 있었습니다 ! ㅇ0ㅇ ~
		//System.out.println
	}
}
