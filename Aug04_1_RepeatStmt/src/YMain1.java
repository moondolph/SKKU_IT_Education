import java.util.Scanner;

public class YMain1 {
	public static void main(String[] args) {
		// ������ �Է� �޾Ƽ� 90�̻� �̸� 'A',
		// 90�̸� 80�̻��̸� 'B'
		// 80�̸� 70�̻��̸� 'C'
		// 70�̸� 60�̻��̸� 'D'
		// 60�̸��̸� 'F' �� ���
		// switch-case�� !

		Scanner k = new Scanner(System.in);
		System.out.print("����: ");
		int point = k.nextInt();
		char grade ;
		switch (point / 10)  {   // JAVA���� ���� �� ������ ������ �κ� �߸��� ���� �����Ѵ�.								
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.printf("����� ����� %c�Դϴ�.", grade);
	}
}
