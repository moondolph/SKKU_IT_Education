import java.util.Random;
import java.util.Scanner;

public class YMain2 {
	// 홀짝 게임 만들기 !
	//		동전 10개를 쥐고 있다가 !
	//		내가 '홀'이라고 하면...
	//		정답인지 아닌지 판정해서 그 결과를 출력해주는 프로그램
	
	public static void main(String[] args) {
//		Random r = new Random();
//		int i = r.nextInt();  // int 범위 안에 있는 랜덤한 숫자
//		int i2 = r.nextInt(5); // 0 ~ 4
//		int i3 = r.nextInt(5) + 1 ; // 1 ~ 5
//		
//		System.out.println(i);
//		System.out.println(i2);
//		System.out.println(i3);
		
		Random r = new Random();
		int i = r.nextInt(10)+1;
		
		Scanner k = new Scanner(System.in);
		
		System.out.println(" 홀 또는 짝을 입력하시오: " );
		String pick = k.next();
		
		String result = (i % 2 == 1) ? "홀" : "짝" ;
		
		String final = pick == result ? "정답" : "오답";
		
//		
//		String answer = (pick == result) ? "정답" : "오답" ;
//		
//		System.out.println(answer);
		
		
		
		// 입력 받을 준비
		Scanner keyboard = new Scanner(System.in);
		
		
		// 랜덤하게 동전을 뽑을 준비
		Random r = new Random();
		
		// 지정한 갯수 중에서 랜덤한 동전 개수를 뽑기
		int coin = r.nextInt(10);
		System.out.println(coin);
		
		
		// 동전 개수가 홀수이면 '홀', 짝수면 '짝'
		String answer = (coin % 2 == 1) ? "홀" : "짝" ;
		//System.out.println(answer);
		
		// 답을 맞출 수 있게 입력 
		System.out.print("홀 or 짝 : ");
		String userAns = keyboard.next();
		//System.out.println(userAns);
		
		// 결과를 맞춰봐야..!(컴퓨터가 뽑은 정답과 내가 입력한 정답이 같은지)
		String result = (answer.equals(userAns)) ? "정답" : "땡";          //문자열끼리의 등호는 equals
		System.out.printf("뽑은 동전은 %d개이므로, %s!", coin, result);
		
	}
}
