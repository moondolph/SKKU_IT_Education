import java.util.Scanner;

public class CMain2 {

	// �����ϳ��� �Է�
	// �Է� ���� ���� ���� 5���� ũ�� ���ο� ���� y�� ���� 10�� ��Ƽ� ���
	// �Է� ���� ���� ���� 3���� ũ�� ���ο� ���� y�� ���� 20�� ��Ƽ� ���
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("x : ");
		int x = keyboard.nextInt();
		
		//if�� �ȿ� ������ �����
		//if���� ���ư��鼭 ����ؼ� int y�� �����ϰ� ����!
		//		-> ȿ�������� �ʴ� !
		if (x > 5) {
			int y = 10;
			System.out.println(y);
		} else if (x > 3) {
			int y = 20;
			System.out.println(y);
		}
	
		//if�� �ٱ����ٰ� ������ �����ϰ� 
		//if�� �ȿ��� ���� '����'(�Ҵ�) �� �� �ְ� �ϴ� ���� ȿ����!
		int z = 0 ; // �⺻���� ���ϰ� 
		if (x > 5) {
			z = 10;
			System.out.println(z);
		} else if (x > 3) {
			z = 20;
			System.out.println(z);
		}	
		System.out.println(z); // �⺻���� ������ ������ ���� �߻�!
							   // ������ ����Ϸ��� �ʱ�ȭ���� �ѹ� ������ �Ǿ�� ��밡��o
							   
	}
	
	
	
	
	
	
	
	
//	public static void input(int n) {
//		if (n > 5) {
//			int y = 10;
//			System.out.println(y);
//		} else if (n > 3) {
//			int y = 20;
//			System.out.println(y);
//		}
//	}
//
//	public static void main(String[] args) {
//		input(4);
//		input(5);
//		input(6);
//	}
}
