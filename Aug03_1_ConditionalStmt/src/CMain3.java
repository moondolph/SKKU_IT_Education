import java.util.Scanner;

public class CMain3 {
	public static void main(String[] args) {
		// ���� �ϳ� �Է� ���� �� �ְ�!
		Scanner k = new Scanner(System.in);
		System.out.print("x : ");
		int x = k.nextInt();
//		System.out.println(x);
		
		// ���ǹ� : if, switch, 
		// switch-case ('sw' + �ڵ��ϼ�)
		
		// switch�� : �� ������ Ư���� ���̳� ���ڿ��� ���
		// break; �� �̿��ؼ� �� ������ �����ϸ� switch���� �������� 
		
//		switch (���� or ��) {
//		case �� A:
//			���� or ���� ���� A�϶� �� �κ��� ����
//			break;
//		case �� B:
//			���� or ���� ���� B�϶� �� �κ��� ����
//		default:
//			A���� �ƴϰ�, B���� �ƴ� �� �� �κ��� ����
//			break;
//		}

		// x�� 1�϶� "��"�� ���/2�϶� "��" ���/ 3�϶� "�Ф�" ���
		// �� �� ������ �ƴϸ� "����...."�� ���
		
		
		switch (x)  {
		case 1 : 
			System.out.println("��");
			break;
		case 2 : 
			System.out.println("��");
			break;
		case 3 : 
			System.out.println("�Ф�");
			break;
		default:
			System.out.println("\"����....\"");
			break;
		}
		
		
	
	}
}
