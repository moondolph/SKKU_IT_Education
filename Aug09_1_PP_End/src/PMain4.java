import java.util.Scanner;

// 거스름돈 환전 프로그램
// 함수 사용 (o)

// <입력>
// 구매한 물건 가격 : 35000
// 낸 돈 : 41530
// ------------------------------
// 거스름돈 : 6530을
// 		50000 : 0
//		10000 : 0
// 		5000 : 1
// 		1000 : 1
// 		500 : 1
// 		100 : 0
//		50 : 0
//		10 : 3

public class PMain4 {

	// 물건 가격
	public static int price() {
		System.out.print("구매한 물건 가격 : ");
		Scanner k = new Scanner(System.in);
		int price = k.nextInt();
		return price;
	}

	// 낸 돈
	public static int pay (int price) {
		System.out.print("낸 돈 : ");
		Scanner k = new Scanner(System.in);
		int pay = k.nextInt();
		if (pay >= price) {
			return pay;
		} else {
			System.out.println("돈을 더 내야 합니다.");
			return pay(price);
		}
	}

	// 거스름돈 계산
	public static int change(int pay, int price) {
		System.out.println("---------------------------------");
		int change = pay - price;
		return change;
	}

	// 위에 3개 출력
	public static void bill(int pay, int price, int change) {

		System.out.println("---------------------------------");
		System.out.printf("낸 돈: %d\n", pay);
		System.out.printf("물건 가격: %d\n", price);
		System.out.printf("거스름돈: %d\n", change);
	}

	// 거스름돈을 화폐에 따라 어떻게 줄 것인지
	public static void cal(int change) {

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int g = 0;
		int h = 0;

		if (change > 50000) {
			a = change / 50000;
			change -= a * 50000;
		}
		if (change > 10000) {
			b = change / 10000;
			change -= b * 10000;
		}
		if (change > 5000) {
			c = change / 5000;
			change -= c * 5000;
		}
		if (change > 1000) {
			d = change / 1000;
			change -= d * 1000;
		}
		if (change > 500) {
			e = change / 500;
			change -= e * 500;
		}
		if (change > 100) {
			f = change / 100;
			change -= f * 100;
		}
		if (change > 50) {
			g = change / 50;
			change -= g * 50;
		}
		if (change > 10) {
			h = change / 10;
			change -= h * 10;
		}
		System.out.printf("50000: %d\n", a);
		System.out.printf("10000: %d\n", b);
		System.out.printf("5000: %d\n", c);
		System.out.printf("1000: %d\n", d);
		System.out.printf("500: %d\n", e);
		System.out.printf("100: %d\n", f);
		System.out.printf("50: %d\n", g);
		System.out.printf("10: %d\n", h);

	}

	public static void main(String[] args) {
		int price = price();
		int pay = pay(price);
		int change = change(pay, price);
		bill(pay, price, change);
		cal(change);
//		while(true) {
//		Scanner k = new Scanner(System.in);
//		System.out.println("====거스름돈 환전 프로그램====");
//		System.out.println("\n<입력>");
//
//		System.out.print("구매한 물건 가격 : ");
//		int price = k.nextInt();
//
//		System.out.print("낸 돈 : ");
//		int pay = k.nextInt();
//		System.out.println("---------------------------------");
//		System.out.printf("거스름돈 : %d을\n", pay - price);
//		int change = pay - price;
//
//		int a = 0;
//		int b = 0;
//		int c = 0;
//		int d = 0;
//		int e = 0;
//		int f = 0;
//		int g = 0;
//		int h = 0;
//
//		if (change > 50000) {
//			a = change / 50000;
//			change -= a * 50000;
//		}
//		if (change > 10000) {
//			b = change / 10000;
//			change -= b * 10000;
//		}
//		if (change > 5000) {
//			c = change / 5000;
//			change -= c * 5000;
//		}
//		if (change > 1000) {
//			d = change / 1000;
//			change -= d * 1000;
//		}
//		if (change > 500) {
//			e = change / 500;
//			change -= e * 500;
//		}
//		if (change > 100) {
//			f = change / 100;
//			change -= f * 100;
//		}
//		if (change > 50) {
//			g = change / 50;
//			change -= g * 50;
//		}
//		if (change > 10) {
//			h = change / 10;
//			change -= h * 10;
//		}
//		System.out.printf("50000: %d\n", a);
//		System.out.printf("10000: %d\n", b);
//		System.out.printf("5000: %d\n", c);
//		System.out.printf("1000: %d\n", d);
//		System.out.printf("500: %d\n", e);
//		System.out.printf("100: %d\n", f);
//		System.out.printf("50: %d\n", g);
//		System.out.printf("10: %d\n", h);
//
//	}
	}
}
