import java.util.Scanner ;

public class YMain1 {
	// ATM ����� �ϴ� ���α׷�
	// 1�� ���� ���� / 2�� ���� ��� / 3�� ���� �ܰ� Ȯ�� / 4�� ���� ���α׷� ����
	// �� ���� �Է� ���� �� (�Ա�, ���)
	// main �Լ��� !
	
	public static void main(String[] args) {
		
		System.out.println("[ATM ����� �ϴ� ���α׷�]");
		
		System.out.println("1. ���� | 2. ��� | 3. �ܰ�Ȯ�� | 4. ���α׷� ����");
		System.out.print("���ϴ� ����� ��ȣ�� �Է��ϼ��� : ");
		Scanner k = new Scanner(System.in);
		int a = k.nextInt();
		int balance = 0 ;
		int b = 0;
		int c = 0;
		while (a!=4) {
		if (a==1) {
			System.out.print("������ �� : ");
			b = k.nextInt();
			balance += b ;
			System.out.print("���ϴ� ����� ��ȣ�� �Է��ϼ��� : ");
			 a = k.nextInt();
		}
		else if(a==2) {
			System.out.print("����� �� : ");
			c = k.nextInt();
			balance -= c ;
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			a = k.nextInt();
		
		}
		else if(a==3) {
			System.out.print("�ܰ�: ");
		
			System.out.printf("%d��\n",balance);								
			System.out.print("��ȣ�� �Է��ϼ��� : ");
			a = k.nextInt();
		}
		else {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		}
		
	}
  }
}