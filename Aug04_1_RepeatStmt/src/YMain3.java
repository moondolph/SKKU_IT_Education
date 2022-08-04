import java.util.Scanner;

public class YMain3 {
	// f1 : 정수를 하나 입력 받아서
	// 그게 양수면 "양"/ 0이면 "0" / 음수면 "음" 출력

	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int i = k.nextInt();
		if (i > 0) {
			System.out.println("양");
		} else if (i == 0) {
			System.out.println("0");
		} else {
			System.out.println("음");
		}
	}

	// f2 : 정수를 하나 입력 받아서
	// 3의 배수면 "3의 배수"
	// 가 아니고 4의 배수면 "4의 배수"
	// 도 아니면 "몰라 !!!!"
	// 를 판정해주는 함수
	public static String f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int t = k.nextInt();

		if ( t % 12 == 0) {//(t % 3 == 0) && (t % 4 == 0)) {
			return "3의 배수 + 4의 배수";
		} else if (t % 3 == 0) {
			return "3의 배수";
		} else if (t % 4 == 0) {
			return "4의 배수";
		} else {
			return "몰라!!!!";
		} 
	}

	public static void main(String[] args) {
		f1();
		String s = f2();
		System.out.println(s);
	}
	
	
	
}