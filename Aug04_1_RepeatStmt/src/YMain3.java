import java.util.Scanner;

public class YMain3 {
	// f1 : ������ �ϳ� �Է� �޾Ƽ�
	// �װ� ����� "��"/ 0�̸� "0" / ������ "��" ���

	public static void f1() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int i = k.nextInt();
		if (i > 0) {
			System.out.println("��");
		} else if (i == 0) {
			System.out.println("0");
		} else {
			System.out.println("��");
		}
	}

	// f2 : ������ �ϳ� �Է� �޾Ƽ�
	// 3�� ����� "3�� ���"
	// �� �ƴϰ� 4�� ����� "4�� ���"
	// �� �ƴϸ� "���� !!!!"
	// �� �������ִ� �Լ�
	public static String f2() {
		Scanner k = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int t = k.nextInt();

		if ( t % 12 == 0) {//(t % 3 == 0) && (t % 4 == 0)) {
			return "3�� ��� + 4�� ���";
		} else if (t % 3 == 0) {
			return "3�� ���";
		} else if (t % 4 == 0) {
			return "4�� ���";
		} else {
			return "����!!!!";
		} 
	}

	public static void main(String[] args) {
		f1();
		String s = f2();
		System.out.println(s);
	}
	
	
	
}