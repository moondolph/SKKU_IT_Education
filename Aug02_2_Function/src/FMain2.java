import java.util.Random;

public class FMain2 {
	// 랜덤한 정수를 '출력'하는 함수!
	public static void red() {
		Random r = new Random(); // 랜덤한 정수를 뽑을 준비 !
		int i = r.nextInt();
		System.out.println(i);
	}
	
	//랜덤한 정수를 '생성'하는(구하는) 함수 ! => 정수를 '생성'하는 것이 목표!
	public static int blue() {
		Random r = new Random();
		int i = r. nextInt();
		return i ; // i에 있는 값을 최종 결과로 뱉어내기
				   // 이 함수는 종료
	}
	//정수를 하나 넣으면
	//홀수인지 짝수인지 출력하는 함수
	public static void yellow(int a) {
	String result = (a % 2 == 1) ? "홀수" : "짝수" ;
	System.out.printf("%d는 %s!\n", a, result);
	}
	
	// 정수를 두 개 넣었을 때 
	// 앞 숫자가 크면 '앞', 뒷 숫자가 크거나 같다면 '뒤' 문자열로 생성하는 함수
	
	public static String purple(int a, int b) {
		String result = (a > b)? "앞" : "뒤";
		return result ;
	}
	
	//JVM -> main 함수를 자동으로 호출
	public static void main(String[] args) {
		red();
		
		//blue()를 통해서 구해진 숫자를 i라는 그릇에 담아서 콘솔에 출력
		int i = blue();
		System.out.println(i);
		System.out.println("==============");
		
		//yellow()를 통해서 짝수인지 홀수인지 콘솔에 출력
		yellow(i);
		yellow(5);
		yellow(8);
		System.out.println("==============");
		
		//purple()을 통해서 
		String ss = purple(20,30);
		System.out.println(ss);
		System.out.println("==============");
		
		//점심메뉴 (2가지 중 하나)
		//위의 함수를 이용해서...
		//랜덤한 숫자 2개를 뽑아서
		//먼저 뽑힌게 크면 '초밥', 아니면 '짜장면'을 출력
		System.out.println("먹고 싶은 점심 메뉴는 피자와 초밥이다.");
		int a = blue();
		int b = blue();
		System.out.println(a);
		System.out.println(b);
		
		String sss = purple(a, b);
		String menu = (sss == "앞") ? "피자" : "초밥";  // 문자열 비교는 == 말고 sss.equals("앞") 
		
		System.out.printf("따라서 %s를 출력한다.", menu);
			
	}

}
