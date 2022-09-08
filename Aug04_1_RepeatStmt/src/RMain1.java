import java.util.Random;

// 여태까지 했던 것 - 문과적인 요소...!
// 반복문 - 이과적 요소...! -> 어려워요 !

public class RMain1 {
	public static void main(String[] args) {
		// ㅋ 출력
		// ㅋ 5번 출력
		// ㅋ 53번 출력
		System.out.println("ㅋ"); // 1번

		System.out.println("ㅋ");
		System.out.println("ㅋ");
		System.out.println("ㅋ");
		System.out.println("ㅋ");
		System.out.println("ㅋ"); // 5번

		// 1. 어떤 작업을 53번 반복(횟수)
//		for (변수초기화; 조건식; 값의 증감) { (1. 변수초기화) (2. 조건식이 맞으면(참))  (4. 값의 증감) (5. 다시 조건 비교) (7. 값의 증감) (8. 조건 비교후 안맞으면(거짓)
//			내용							(3. 내용출력)  (6. 내용 출력)
//	}
		// 2. 작업 - 퇴실시간까지 반복(기한)

		// ㅋ을 3번 출력하고 싶음!
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ㅋ\n", i);
		}
		System.out.println("---------------");

		// 5부터 1까지 순서대로 내림차순 출력
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

//		for (int i = 1; i<6; i++) {
//			System.out.print(6-i);
//		}
//		//i++ or i += 1 or i = i+1
//		for (int i = 0; i<5; i++) {
//			System.out.print(5-i);
//		}

		// 1, 3, 5, ... , 21까지 출력
		for (int i = 1; i < 22; i += 2) {
			System.out.println(i);
		}

//		for (int i=0; i<11 ; i++) {
//			System.out.println(2*i+1);

		// 반복문이 5번 도는 동안에 1 ~ 10 사이의 숫자를 랜덤하게 뽑고 싶을 때?
		Random a = new Random();
		int n = a.nextInt(10) + 1;// 랜덤한 숫자를 하나 뽑앗어
		for (int i = 0; i < 5; i++) {
			System.out.println(n); // 그 숫자 출력 기능을 5번 반복
		}
		// 반복문 속에서 변수를 만드는 것 별로!
		// 반복문이 한 번 돌때마다 변수를 생성함
		for (int i = 0; i < 5; i++) {
			Random x = new Random();
			int m = a.nextInt(10) + 1;
			System.out.println(m);
		}
		// 반복문 안에서 변수를 새로 만드는것은 자제하는게 좋음!
		// 반복문 밖에서 변수 하나를 만들어서 갖다 쓰는거 조금 더 효율적 !
		int x3 = 0;
		for (int i = 0; i < 5; i++) {
			x3 = a.nextInt(10) + 1; // 변수를 '생성' (x) / 변수의 값만 '변경' (o)
			System.out.println(x3);
		}
		System.out.println("------------------");
		// 1 + 2 + 3 + ... + 10 더한 값 출력
		int s = 0;
		for (int i = 1; i < 11; i++) {
			s = s + i;
			System.out.println(s);
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}

		// 팩토리얼!
		// 7! ->? -> 1 * 2 * 3 * 4 * 5 * 6 * 7
		int fac = 1;
		for (int i = 1; i < 8; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
		System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7);
		System.out.println("------------------");
		
		// 1~50까지 숫자 중에
		// 3의 배수거나, 5의 배수인 숫자를 다 더한 값을 출력
		
		int total = 0;
	
		
		
		for (int i = 1; i <= 50 ; i ++ ) {
		if (i % 3 == 0 || i % 5 ==0) {
		total += i;   // plus = plus + i
				}
			}
		System.out.println("1 ~ 50까지 숫자 중에 3의 배수거나 5의 배수인 숫자의 합 = " + total);
		
	}
}