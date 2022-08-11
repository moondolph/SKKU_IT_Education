import java.util.Random;
import java.util.Scanner;

public class Lotto {
	// 1. 로또 번호는 총 6개 번호를 지정
	// 2. 6개 일치 : 1등 / 5개 일치 : 2등 / 4개 일치 : 3등 / 나머지 : 꽝
	// 3. 1 ~ 45까지 정수 랜덤하게
	// 4. 메소드 사용해서!
	public static void main(String[] args) {
		//랜덤으로 당첨번호 6개 추출
		int[] lotto = new int[6];

		Random r = new Random();
		Scanner k = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		//선택번호 6개 입력
		int[] pick = new int[6];
		System.out.print("로또 번호 6개를 고르세요:");
		for (int j = 0; j < 6; j++) {
			pick[j] = k.nextInt();
		}
		
		//당첨번호와 선택번호 맞은 개수 비교
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == pick[j]) {
					count += 1;
				}
			}
		}
		
		switch (count) {
		case 6:
			System.out.println("1등");
			break;
		case 5:
			System.out.println("2등");
			break;
		case 4:
			System.out.println("3등");
			break;

		default:
			System.out.println("꽝");
			break;
		}
		
		//당첨번호 오름차순 정리
		for (int i = 0; i < lotto.length; i++) { // 비교 주체
			for (int j = i + 1; j < lotto.length; j++) { // 비교 대상
				if (lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨

					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		//당첨번호 출력
		System.out.print("당첨번호: ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
		//선택번호 오름차순 정리
		for (int i = 0; i < pick.length; i++) { // 비교 주체
			for (int j = i + 1; j < pick.length; j++) { // 비교 대상
				if (pick[i] > pick[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨

					int temp = pick[i];
					pick[i] = pick[j];
					pick[j] = temp;
				}
			}
		}
		//선택번호 출력
		System.out.print("\n선택번호: ");
				for (int i = 0; i < pick.length; i++) {
					System.out.print(pick[i] + " ");
				}
	
	}
}