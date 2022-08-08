import java.util.Random;

public class RMain5 {
	public static void main(String[] args) {
		// 1 ~ 10 사이의 랜덤한 숫자
		// 서로 다른 랜덤한 숫자 5번 출력

		Random s = new Random();

		for (int i = 0; i < 5; i++) {
			int x = s.nextInt(10) + 1;
			System.out.println(x);
		}
		System.out.println("------------------");

		// 1~10사이의 랜덤한 정수를 출력
		//
		for (int i = 0;; i++) {
			int x = s.nextInt(10) + 1;
			System.out.println(x);
			if (x == 9) {
				break;
			}

		}

		// 반복 횟수가 명확 - for문(o)

		// 반복 조건 (if문의 반복버전)
		// while 문 : 조건을 먼저 검사
		// 조건이 true(참)인 동안에 계속 반복해서 수행 부분을 실행시키는...
		// 실행부분에서 조건을 false(거짓)으로 만들어서 멈추도록 하거나
		// break; 명령어로 반복문을 종료시킬 수 있다.
		// 조건이 맞지 않으면 반복하던 작업을 중지!
		// 무한대로 반복하고 싶을 때 while (true) 사용

		// while : 반복횟수를 정확히 알 수 없을 때,
		// 특별한 조건에서 멈춰야 하는 경우에 사용!
		// while (조건식) {
		// 내용
		// }
		// 한번도 반복 안 할 수도 있음... ㅋ_ㅋ
		//

		int y = s.nextInt(10) + 1; // 랜덤한 정수를 한 번 뽑았고
		while (y != 9) { // 9가 아니면 (= 9가 나올때까지)
			System.out.println(y);
			y = s.nextInt(10) + 1; // 다시 while으로 돌아가서 조건을 체크
		}
		System.out.println("-------------");
		// 1 ~ 3 사이의 랜덤한 정수를 출력
		// 3이 나오면 반복문 종료

		int z = s.nextInt(3) + 1;
		while (z != 3) {
			System.out.println(z);
			z = s.nextInt(3) + 1;
		}
		System.out.println("-------------");

		// do - while문 : 실행부터 하고 조건을 나중에 검사 (거의 안씀)
		// 한번은 반복이 보장 o
		do {
			System.out.println(z);
			z = s.nextInt(3) + 1;
		} while (z != 3);
		System.out.println("-------------");

		// 1 + 2 + 3 + ... + 10 = ? -> for문
		// 1 + 2 + 3 + ... + n <= 100 -> while문

		// 1 ~ n번째 더했을 때 100이 넘어가면 반복문이 종료되게
		// 총 합은 몇인지 / n 값은 몇인지 출력

		int sum = 0;
		int n = 0;
		while (sum < 100) {
			n++;
			sum = sum + n; // sum += n;
		}
		System.out.printf("n의 값 : %d", n);
		System.out.printf("총 합 : %d", sum);
		System.out.println("---------------");
		
		// 1000 이하의 숫자 중에서
		// 가장 큰 15의 배수는?
		int x=1000;
		while (x % 15 > 0) {
		    x--;
		    System.out.println(x);
		}
	
	
	
	
	
	}
}