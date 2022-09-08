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
	public static void startBMI() {
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.println("\tBMI 검사를 시작~~합니다 !");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*");
	}

	// 이름을 입력하는 함수
	public static String getName() {
		Scanner k = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = k.next();
		return name;
	}

	// 키를 입력하는 함수
	public static double getHeight() {
		Scanner k = new Scanner(System.in);
		System.out.println("키 : ");
		double height = k.nextDouble(); // 입력받을 때는 cm
		return height / 100; // 리턴은 m으로. getHeight()의 값은 m
	}

	// 몸무게를 입력하는 함수
	public static double getWeight() {
		Scanner k = new Scanner(System.in);
		System.out.print("몸무게 : ");
		double weight = k.nextDouble();
		return weight;
	}

	// BMI를 계산해주는 함수
	public static double calcBMI(double weight, double height) {
		double bmi = weight / (height * height);
		return bmi;
	}

	// 결과를 판단해주는 함수
	// RAM을 덜 쓰려면 -> 변수를 줄이면 된다!
	// HDD를 덜 쓰려면 -> 코드를 줄이면 된다!
	public static String judgeBMI(double bmi) {

		String result = "임의값";
		if (bmi >= 40) {
			result = "고도비만";
		} else if (bmi >= 35) {
			result = "중증도비만";
		} else if (bmi >= 30) {
			result = "경도비만";
		} else if (bmi >= 25) {
			result = "과체중";
		} else if (bmi >= 18.5) {
			result = "정상";
		} else {
			return "저체중";
		}
		return result;
	}

	// 결과를 출력해주는 함수
	public static void printResult(String n, double h, double w, double b, String r) {
		System.out.printf("%s님의 키는 %.1fcm,몸무게는 %.1fkg이고..\n", n, h * 100, w);
		System.out.printf("체질량지수(BMI) : %.1f입니다\n", b);

		try {
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.print(".");
			Thread.sleep(1000);
			System.out.println("곧 결과가 나옵니다");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.printf("\t%s님은 %s입니다 !\n", n, r);
		switch (r) {
		case "저체중":
			System.out.println("\t그만 좀 먹어요");
			break;
		case "정상":
			System.out.println("\t드시던 대로 드시면 됩니다.");
			break;
		case "과체중":
			System.out.println("\t먹는 양을 좀 줄이시면 됩니다.");
			break;
		case "경도비만":
			System.out.println("\t하루에 2끼만 드세요.");
			break;
		case "중증도비만":
			System.out.println("\t하루에 1끼만 드세요.");
			break;
		case "고도비만":
			System.out.println("\t며칠 안 먹는다고 안 죽습니다.");
			break;

		default:
			break;
		}
	}

	// Y를 입력했을 때 프로그램을 종료해주는 함수 (EX: 종료하시겠습니까(Y/N) ? : )
	public static void exit() {
		Scanner k = new Scanner(System.in);
		System.out.print("시스템을 종료하시겠습니까(Y/N) ? : ");
		String answer = k.next();
		if (answer.equals("Y") || answer.equals("y")) {
			System.out.println("5만원이 자동이체되었습니다.");
			System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*");
		} else {
			exit();
		}
	}

	public static void main(String[] args) {
		startBMI();
		String name = getName();
//		System.out.println(name);			잘 받아왔는지 확인하려고
		double height = getHeight(); // 여기서 height은 m값
//		System.out.println(height);
		double weight = getWeight();
		double bmi = calcBMI(weight, height);
//		System.out.println(bmi);
		String result = judgeBMI(bmi);
		printResult(name, height, weight, bmi, result);
		exit();

	}

	// 이하 나의 코드
//	public static void start() {
//		System.out.println("BMI 검사 프로그램을 시작합니다.\n");
//	}
//
//	public static double input() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("이름: ");
//		String name = k.next();
//		System.out.print("키(cm): ");
//		double height = k.nextDouble();
//		double heightm = height * 0.01;
//		System.out.print("몸무게(kg): ");
//		double weight = k.nextDouble();
//		System.out.printf("이름:%s\n", name);
//		System.out.printf("키:%.2fm\n", heightm);
//		System.out.printf("몸무게:%.1fkg\n", weight);
//		double bmi = weight / (heightm * heightm); // 키 : m단위
//		return bmi;
//	}
//
//	public static void print(double bmi) {
//		System.out.println("---------검사결과-----------");
//		if (bmi < 18.5) {
//			System.out.println("[저체중]");
//		} else if (bmi >= 40) {
//			System.out.println("[고도비만]");
//		} else if (bmi >= 35) {
//			System.out.println("[중증도비만]");
//		} else if (bmi >= 30) {
//			System.out.println("[경도비만]");
//		} else if (bmi >= 25) {
//			System.out.println("[과체중]");
//		} else {
//			System.out.println("[정상]");
//		}
//	}
//
//	public static void end() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("프로그램을 종료하시겠습니까(Y/N)? : ");
//		String finish = k.next();
//		if (finish.equals("Y")) {
//			System.out.println("프로그램을 종료합니다");
//			System.exit(0); // <-- 명령어가 더 이상 없으면 종료라서 있어도 되고 없어도 됨 
//		} else {
//			System.out.println("\"Y\"안 누르면 종료 안됩니다ㅋㅋ");
//			end();
//		}
//	}
//
//	public static void main(String[] args) {
//		start();
//		double bmi = input();
//		print(bmi);
//		end();
//	}

}