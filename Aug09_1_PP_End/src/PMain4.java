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
	public static int getPrice() {
		Scanner k = new Scanner(System.in);
		System.out.print("물건 가격:  ");
		int price = k.nextInt();
		return price;
	}

//	public static int price() {
//		System.out.print("구매한 물건 가격 : ");
//		Scanner k = new Scanner(System.in);
//		int price = k.nextInt();
//		return price;
//	}

	// 낸 돈
	public static int payMoney(int price) {
		Scanner k = new Scanner(System.in);
		System.out.print("낸 돈 : ");
		int money = k.nextInt();
		if (money < price) {
			System.out.println("돈이 부족합니다. 다시 입력하세요.");
		}
		return (money >= price) ? money : payMoney(price);

	}

//	public static int pay (int price) {
//		System.out.print("낸 돈 : ");
//		Scanner k = new Scanner(System.in);
//		int pay = k.nextInt();
//		if (pay >= price) {
//			return pay;
//		} else {
//			System.out.println("돈을 더 내야 합니다.");
//			return pay(price);
//		}
//	}

	// 거스름돈 계산
	public static int getChange(int price, int money) {
		return money - price;

	}

//	public static int change(int pay, int price) {
//		System.out.println("---------------------------------");
//		int change = pay - price;
//		return change;
//	}

	// 위에 3개 출력
	public static void printResult(int pay, int price, int change) {

		System.out.println("---------------------------------");
		System.out.printf("낸 돈: %d원\n", pay);
		System.out.printf("물건 가격: %d원\n", price);
		System.out.printf("거스름돈: %d원\n", change);
		System.out.println("---------------------------------");
	}
//	public static void bill(int pay, int price, int change) {
//
//		System.out.println("---------------------------------");
//		System.out.printf("낸 돈: %d원\n", pay);
//		System.out.printf("물건 가격: %d원\n", price);
//		System.out.printf("거스름돈: %d원\n", change);
//		System.out.println("---------------------------------");
//	}

	// 거스름돈을 화폐에 따라 어떻게 줄 것인지
	// 2가지 방법..

	// 1. 배열 + for반복 + if
	public static void printChange(int change) {
//		int[] currency = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
//		for (int i = 0; i < currency.length; i++) {
//			if (change >= currency[i]) {
//				System.out.printf("%d원권 : %d개\n", currency[i], (change / currency[i]));
//				change %= currency[i];
//			}
//		}

		// 2. while반복(화폐 단위가 /5 /2를 이용) + if
		int currency2 = 50000;
		if (change >= currency2) {
			System.out.printf("%d원권 : %d개\n", currency2, (change / currency2));
			change %= currency2;
		}

		while (true) {

			currency2 /= 5;
			if (change >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2, (change / currency2));
				change %= currency2;
			}
			
			currency2 /= 2;
			if (change >= currency2) {
				System.out.printf("%d원권 : %d개\n", currency2, (change / currency2));
				change %= currency2;
			}
			
			
			if (currency2 == 10) {
				System.out.printf("%d원권 : %d개\n", currency2, (change / currency2));
				break;
			}

		}
	}

//	public static void cal(int change) {
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
	public static void main(String[] args) {
		int price = getPrice();
		int money = payMoney(price);
		int change = getChange(price, money);
		printResult(price, money, change);
		printChange(change);

	}
}

//	public static void main(String[] args) {
//		int price = price();
//		int pay = pay(price);
//		int change = change(pay, price);
//		bill(pay, price, change);
//		cal(change);
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
