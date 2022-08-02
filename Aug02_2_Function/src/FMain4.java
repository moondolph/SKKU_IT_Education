import java.util.Random;
import java.util.Scanner;

// 홀짝 (함수.ver)



public class FMain4 {
	// 랜덤한 동전 개수 가져오기
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10) + 1 ;
//		return coin;
		return new Random().nextInt(10)+1 ;
	}
	
	// 질문 & 답 입력
	public static String askUserAns() {
//		Scanner k = new Scanner(System.in);
		System.out.print("홀 ? 짝 ? :");
//		String userAns = k.next();
//		return userAns;
		return new Scanner(System.in).next();
	}
	// 동전 개수가 홀수면 '홀', 짝수면 '짝'
	public static String getAnswer(int coin) {
//		String answer = (coin % 2 == 0) ? "짝" : "홀" ;
//		return answer
		return (coin % 2 == 0) ? "짝" : "홀" ;
	}
	// 비교해서 결과 내기
	public static String getResult(String ua, String a) {
//		String result = (ua.equals(a)) ? "정답" : "땡" ;
		return (ua.equals(a)) ? "정답" : "땡" ;
	}
	// 출력
	 public static void printResult(int coin, String ua, String a, String r) {
		 System.out.printf("동전은 %d개 !\n", coin);
		 System.out.printf("내가 입력한 답 : %s !\n", ua);
		 System.out.printf("결과 : %s이라서 %s !\n", a, r);
		 
	 }
	
	public static void main(String[] args) {
		int coin = shakeCoin();
		String userAns = askUserAns();
		String answer = getAnswer(coin);
		String result = getResult(userAns, answer);
		printResult(coin, userAns, answer, result);
		
	}
	
////1~10중에서 랜덤으로 번호를 뽑는다
//public static int pick() {
//	Random n = new Random();
//	int number = n.nextInt(10)+1 ;
//	System.out.printf("당신이 뽑은 번호는:%d입니다.\n", number);
//	return number;
//	}
//
////뽑은 수가 홀인지 짝인지 출력한다
//public static void print(int number) {
//	String result = number % 2 == 1 ? "홀" : "짝" ;
//	System.out.printf("당신이 뽑은 번호는 %d이므로 '%s'입니다.", number, result);
//	}
//
//public static void main(String[] args) {
//	int number = pick();
//	print(number);
//	}
}
