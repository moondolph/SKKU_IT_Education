import java.util.Random;
import java.util.Scanner;

//동전 맞추기 게임
//10개

public class FMain5 {
	// 동전 10개 섞기
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10) + 1;
//		return coin;
		return new Random().nextInt(10) + 1;
	}
	// 질문 & 답 입력
	public static int askUserAns() {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("몇 개 ? : ");
//		int userAns = keyboard.nextInt();
		return new Scanner(System.in).nextInt();
	}
	
	// 답 맞춰보기
	public static String getResult(int coin, int userAns) {
		String result = (coin == userAns) ? "정답" : "땡" ;
		return result;
	}
	// 결과 출력
	public static void printResult(int coin, int userAns, String result) {
		System.out.printf("쥐고 있던 동전은 %d개 !\n", coin);
		System.out.printf("당신의 답은 %d개 !\n", userAns);
		System.out.printf("그래서 결과는 ... [%s]입니다 !!!!\n", result);
		
	}

	public static void main(String[] args) {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
	}
}	
	
	
	
	
// -----------------------------------------이 밑으로 나의 코드----------------------------------------------------- 	
//	public static void introduce() {
//		System.out.println("재밌는 동전 맞추기 게임!! 시작합니다.");
//	}
//	
//	public static int setNumber() {
//		
//		Random r = new Random();
//		System.out.println("동전 개수(1~10)가 설정되었습니다.");
//		int setNumber = r.nextInt(10) + 1 ;
//		return setNumber;
//		
//	}
//	
//	
//	
//	public static int pickNumber() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("동전 개수를 맞춰보시오: ");
//		
//		int pickNumber = k.nextInt();
//		System.out.println("----------------");
//		System.out.printf("당신이 예상한 동전 개수는 '%d개'입니다.\n", pickNumber);
//		return pickNumber;
//	}
//	public static void compare(int setNumber, int pickNumber) {
//		System.out.println("자 이제 정답을 확인하겠습니다.");
//		System.out.println("---------------------");
//		String result = setNumber == pickNumber ? "정답" : "오답" ;
//		System.out.printf("당신은 '%s'입니다.정답은 '%d개' 입니다.", result, setNumber);
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		introduce();
//		int setNumber=setNumber();
//		int pickNumber=pickNumber();
//		compare(setNumber, pickNumber);
//	}
	

