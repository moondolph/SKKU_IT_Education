import java.util.Scanner;

// �Ž����� ȯ�� ���α׷�
// �Լ� ��� (o)

// <�Է�>
// ������ ���� ���� : 35000
// �� �� : 41530
// ------------------------------
// �Ž����� : 6530��
// 		50000 : 0
//		10000 : 0
// 		5000 : 1
// 		1000 : 1
// 		500 : 1
// 		100 : 0
//		50 : 0
//		10 : 3

public class PMain4 {

	// ���� ����
	public static int price() {
		System.out.print("������ ���� ���� : ");
		Scanner k = new Scanner(System.in);
		int price = k.nextInt();
		return price;
	}

	// �� ��
	public static int pay (int price) {
		System.out.print("�� �� : ");
		Scanner k = new Scanner(System.in);
		int pay = k.nextInt();
		if (pay >= price) {
			return pay;
		} else {
			System.out.println("���� �� ���� �մϴ�.");
			return pay(price);
		}
	}

	// �Ž����� ���
	public static int change(int pay, int price) {
		System.out.println("---------------------------------");
		int change = pay - price;
		return change;
	}

	// ���� 3�� ���
	public static void bill(int pay, int price, int change) {

		System.out.println("---------------------------------");
		System.out.printf("�� ��: %d\n", pay);
		System.out.printf("���� ����: %d\n", price);
		System.out.printf("�Ž�����: %d\n", change);
	}

	// �Ž������� ȭ�� ���� ��� �� ������
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
//		System.out.println("====�Ž����� ȯ�� ���α׷�====");
//		System.out.println("\n<�Է�>");
//
//		System.out.print("������ ���� ���� : ");
//		int price = k.nextInt();
//
//		System.out.print("�� �� : ");
//		int pay = k.nextInt();
//		System.out.println("---------------------------------");
//		System.out.printf("�Ž����� : %d��\n", pay - price);
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
