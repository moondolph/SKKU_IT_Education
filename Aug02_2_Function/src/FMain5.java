import java.util.Random;
import java.util.Scanner;

//���� ���߱� ����
//10��

public class FMain5 {
	// ���� 10�� ����
	public static int shakeCoin() {
//		Random r = new Random();
//		int coin = r.nextInt(10) + 1;
//		return coin;
		return new Random().nextInt(10) + 1;
	}
	// ���� & �� �Է�
	public static int askUserAns() {
//		Scanner keyboard = new Scanner(System.in);
//		System.out.print("�� �� ? : ");
//		int userAns = keyboard.nextInt();
		return new Scanner(System.in).nextInt();
	}
	
	// �� ���纸��
	public static String getResult(int coin, int userAns) {
		String result = (coin == userAns) ? "����" : "��" ;
		return result;
	}
	// ��� ���
	public static void printResult(int coin, int userAns, String result) {
		System.out.printf("��� �ִ� ������ %d�� !\n", coin);
		System.out.printf("����� ���� %d�� !\n", userAns);
		System.out.printf("�׷��� ����� ... [%s]�Դϴ� !!!!\n", result);
		
	}

	public static void main(String[] args) {
		int coin = shakeCoin();
		int userAns = askUserAns();
		String result = getResult(coin, userAns);
		printResult(coin, userAns, result);
	}
}	
	
	
	
	
// -----------------------------------------�� ������ ���� �ڵ�----------------------------------------------------- 	
//	public static void introduce() {
//		System.out.println("��մ� ���� ���߱� ����!! �����մϴ�.");
//	}
//	
//	public static int setNumber() {
//		
//		Random r = new Random();
//		System.out.println("���� ����(1~10)�� �����Ǿ����ϴ�.");
//		int setNumber = r.nextInt(10) + 1 ;
//		return setNumber;
//		
//	}
//	
//	
//	
//	public static int pickNumber() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("���� ������ ���纸�ÿ�: ");
//		
//		int pickNumber = k.nextInt();
//		System.out.println("----------------");
//		System.out.printf("����� ������ ���� ������ '%d��'�Դϴ�.\n", pickNumber);
//		return pickNumber;
//	}
//	public static void compare(int setNumber, int pickNumber) {
//		System.out.println("�� ���� ������ Ȯ���ϰڽ��ϴ�.");
//		System.out.println("---------------------");
//		String result = setNumber == pickNumber ? "����" : "����" ;
//		System.out.printf("����� '%s'�Դϴ�.������ '%d��' �Դϴ�.", result, setNumber);
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		introduce();
//		int setNumber=setNumber();
//		int pickNumber=pickNumber();
//		compare(setNumber, pickNumber);
//	}
	

