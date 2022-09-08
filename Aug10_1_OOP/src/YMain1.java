import java.util.Random;
import java.util.Scanner;

// Up & Down ���� (�Լ� ��� 0)
// ��ǻ�� : 1 ~ 100 ������ ���ڸ� ���� (ex : 34)
// ������ �Է�
//	  1Ʈ : 50 -> down !
//	  2Ʈ : 20 -> up !
//	  ...
//    10Ʈ : 34 -> ����!

public class YMain1 {
	// ��ǻ�Ͱ� 1 ~ 100 ������ ���ڸ� �ϳ� �̾��ִ� �Լ�
	public static int getNumber() {
		Random r = new Random();
		int i = r.nextInt(100) + 1;
		return i;
	}
	// ������ ���� �Է��� �� �ִ� �Լ�
	public static int getUserAns() {
		Scanner k = new Scanner(System.in);
		System.out.print("������? : ");
		int answer = k.nextInt();
		if (answer < 1) {
			System.out.println("������ 1 �̻��̾�� �մϴ�.");
		}else if (answer >100) {
			System.out.println("������ 100 �����̾�� �մϴ�.");
		}
		return (answer >= 1 && answer <=100) ? answer : getUserAns();
	}
	
	// ������ �� �� �Է������� �������� �ƴ��� Ȯ�� + �ݺ����� ���� ���� ���޵�
	public static boolean checkAnswer(int number, int answer) {
		if(number==answer) {
			System.out.println("����!");
//			return true; // �����϶� true���� �����ϸ鼭 �� �Լ��� ����ǰ�
		}else if(number> answer) {
			System.out.println("Up !");
//			return false; // ������ �ƴҶ� false���� �����ϸ鼭 ������ ��� �����ϵ���
		}else{
			System.out.println("Down !");
//			return false;
		}
		return(number == answer); // �� ���ǿ� ������ true���� �����ϰ�,
								  // ���ǿ� ���� ������ false���� ����
		
	}
	
	// ������ ���⶧���� �ݺ��ϴ� �Լ�
	public static void printResult(int number, int answer) {
		int turn = 0;
		while (true) {
			turn++;
			answer = getUserAns();
			if(checkAnswer(number,answer)) {
				System.out.printf("%d�� ���� ����!\n",turn);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int number = getNumber();
		int answer = 0;
		printResult(number, answer);
		
		
	}
	
	
	
//	public static void introduce() {
//		System.out.println("<<<<Up & Down ����!!>>>>");
//	}
//	
//	
//	public static int computer() {
//		System.out.println("��ǻ�Ͱ� ��ȣ(1~100)�� �ϳ��� �̾ҽ��ϴ�");
//		Random r = new Random();
//		int computer = r.nextInt(100) + 1;
//		return computer;
//	}
//
//	public static int user() {
//		System.out.println("������ �����Դϴ�.");
//		System.out.print("��ǻ�Ͱ� �� ��ȣ�� ���纸����: ");
//		Scanner k = new Scanner(System.in);
//		int user = k.nextInt();
//		return user;
//
//	}
//
//	public static void result(int computer, int user) {
//		Scanner k = new Scanner(System.in);
//		for (int i = 1;; i++) {
//			if (computer > user) {
//				System.out.printf("%dtry : %d --> UP!\n", i, user);
//				System.out.print("�ٽ� �Է��ϼ���: ");
//				user = k.nextInt();
//			} else if (computer < user) {
//				System.out.printf("%dtry : %d --> Down!\n", i, user);
//				System.out.print("�ٽ� �Է��ϼ���: ");
//				user = k.nextInt();
//			} else {
//				System.out.printf("%dtry : %d --> ����!\n", i, user);
//				System.out.println("������ �����մϴ�!!");
//				break;
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		introduce();
//		int computer=computer();
//		int user=user();
//		result(computer,user);
//	}
//	
	
	
	
	
}
