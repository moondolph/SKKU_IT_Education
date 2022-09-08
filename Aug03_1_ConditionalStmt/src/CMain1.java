import java.util.Scanner;

public class CMain1 {
	// 국어 시험 점수를 입력해서 받아오는 함수

	public static int getKorean() {
		System.out.print("국어 점수: ");
		Scanner k = new Scanner(System.in);
		int korean = k.nextInt();
		// 점수에는 - 점수가 없기 때문에
		return (korean >= 0 && korean <= 100) ? korean : getKorean();
	}
	// 조건문 : 작성한 코드를 조건에 따라 코드의 실행 흐름을 다르게 동작하도록 제어하는 문법
	// if문 : 조건식의 결과가 true, false로 실행문을 결정

//	if (조건 A) {
//		조건 A가 만족했을 시 (참일때) 이 부분이 실행
//	} else if (조건 B) { 
//		조건 A (X), 조건 B (O)일때 이 부분이 실행
//	} else if (조건 C) {
//		조건 A/B (X), 조건 C(O)일때 이 부분이 실행
//	} else {
//		맞는 조건이 하나도 없으면 이 부분이 실행
//	}

	// 국어 점수가...
	// 60점 미만이면 '가'
	// 60점 이상이면 '양'
	// 70점 이상이면 '미'
	// 80점 이상이면 '우'
	// 90점 이상이면 '수' 출력

	public static void print(int korean) {
		if (korean < 60 && korean >= 50) {
			System.out.println("'가'");
		}

		else if (korean >= 90) {
			System.out.println("'수'");
		}

		else if (korean >= 80) {
			System.out.println("'우'");
		}

		else if (korean >= 70) {
			System.out.println("'미'");
		}

		else if (korean >= 60) {
			System.out.println("'양'");
			System.out.println("==============");
		}
		// 국어 점수가 50점이 안되면 욕, 아니면 칭찬
		// 점수가 50점 이상, 60점 미만이면 아쉬운 소리를 해주세요
		// 점수가 30점 미만이면 퇴학처리

		// if문안에 if문을 또 사용하는 것이 가능!
		// if - if문과 if - else문의 차이
		// if - if : 각각 다른 조건문으로 해석이 되어서 수행 => 효율적 x
		// if - else : 하나의 조건이 만족되면 나머지 부분은 수행하지 않음 => 효율적 o

		if (korean < 50) {
			System.out.println("욕");
		}
		if (korean >= 50) {
			System.out.println("칭찬");
		}

		if (korean < 50) {
			System.out.println("한국인 맞냐");
			if (korean < 30) {
				System.out.println("NAGA!!!!!!!!!!");
			}
		} else {
			System.out.println("잘했어요");
			if (korean < 60) {
				System.out.println("세종대왕님한테 사죄할 정도는 아니지만 그래도 해야해");
			}
		}

	}

	public static void main(String[] args) {
		int korean = getKorean();
//		System.out.printf("국어 점수: %d\n", korean);
		print(korean);

	}

}
