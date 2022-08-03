import java.util.Scanner;

//BMI 검사 프로그램 (함수. ver)

// 이름, 키(cm), 몸무게(kg) 입력
// BMI(체질량지수) : 몸무게 / (키 * 키) -> 키 : m단위
// 18.5미만이면 저체중
// 18.5이상이면 정상
// 25이상이면 과체중
// 30이상이면 경도비만
// 35이상이면 중증도비만
// 40이상이면 고도비만

public class CMain7 {
	// 프로그램 시작을 알리는 함수
	// 이름을 입력하는 함수
	// 키를 입력하는 함수
	// 몸무게를 입력하는 함수
	// BMI를 계산해주는 함수
	// 결과를 판단해주는 함수
	// 결과를 출력해주는 함수
	// Y를 입력했을 때 프로그램을 종료해주는 함수 (ex: 종료하시겠습니까(Y/N) ? : )

	// 이하 나의 코드
	public static void start() {
		System.out.println("BMI 검사 프로그램을 시작합니다.\n");
	}

	public static double input() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름: ");
		String name = k.next();
		System.out.print("키(cm): ");
		double height = k.nextDouble();
		double heightm = height * 0.01;
		System.out.print("몸무게(kg): ");
		double weight = k.nextDouble();
		System.out.printf("이름:%s\n", name);
		System.out.printf("키:%.2fm\n", heightm);
		System.out.printf("몸무게:%.1fkg\n", weight);
		double bmi = weight / (heightm * heightm); // 키 : m단위
		return bmi;
	}

	public static void print(double bmi) {
		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi >= 40) {
			System.out.println("고도비만");
		} else if (bmi >= 35) {
			System.out.println("중증도비만");
		} else if (bmi >= 30) {
			System.out.println("경도비만");
		} else if (bmi >= 25) {
			System.out.println("과체중");
		} else {
			System.out.println("정상");
		}
	}

	public static void end() {
		Scanner k = new Scanner(System.in);
		System.out.print("프로그램을 종료하시겠습니까(Y/N)? : ");
		String finish = k.next();
		if (finish.equals("Y")) {
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
		} else {
			end();
		}
	}

	public static void main(String[] args) {
		start();
		double bmi = input();
		print(bmi);
		end();
	}

}