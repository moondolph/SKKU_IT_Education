import java.util.Scanner;

public class OMain4 {
	public static void main(String[] args) {
		// �̸��� �Է� �����ſ��� !
		// �� �̸��� 'ȫ�浿'�̶� ������ true / false
//		Scanner k = new Scanner(System.in);
//		System.out.print("�̸�: ");
//		String name = k.next();
//		boolean check = ( name == "ȫ�浿"); //'name �ּҰ�'�̶� 'ȫ�浿'�̶�� ���� �ٸ��� ������ false�� ����Ǿ��� !
//		System.out.printf("�̸���ġ����:%b\n",check);
//
//		// **String�� ������ ��
//		// ����� �� ��ü�� ���ϱ� ���ؼ� .equals()�� ���!
//		boolean check2 = name.equals("ȫ�浿");
//		System.out.printf("�̸���ġ����:%b\n",check2);
		
		
		
		
		// Shift ������ : ���߼���..!
		// shift : �ű��. �̵��ϴ�.
		// (������ << ����)�� ����
		// << : �տ� �ִ� ��(������)�� 2������ �ٲٰ�, �ڿ� �ִ� ��(����)��ŭ �������� �о��.
		// ����ִ�(������) ĭ ���� 0���� ä���, 2������ �ٽ� 10������ �ٲ��.
		
		// ex) ī��!
		//	   24�ð� : 1 << 0 = 1
		//	   �������� : 1 << 1 = 2
		//     ���� : 1 << 2 = 4
		//     ������ : 1 << 3 = 8
		
		//A���� : 2    ��������
		//B���� : 8    ������
		//C���� : 13   24�ð�, ����, ������
		//D���� : 6	  ��������, ����
		
//		int c = (150 << 6);
//		System.out.println(c);
		
		//������
		//	���� ������ : a++, a--, !a, ... 
		//	���� ������ : a + b, a > b, ...
		// 	���� ������ : 
		//				������ ������ ���� ������ �� ���
		//				if������ ��ü�� ����������, ������ �����
		//				(���ǽ� ? ������ ������ �� �� �� : ���� �Ҽ����� �� ��
		//
		
		//���� ���� �Է¹޾Ƽ� 
		// ���̰� 20�� �̻��̸� '�ȳ��ϼ���'�� ���
		// ���̰� 20�� �̸��̸� 'NAGA!' �� ���
		
		Scanner k = new Scanner(System.in);
		
//		System.out.print("�̸�: ");
//		String name = k.next();
//		
//		System.out.print("����: ");
//		int age = k.nextInt();
//		System.out.printf("���̴� %d��\n", age);
//		String result = (age >= 20) ? "�ȳ��ϼ���" : "NAGA!";			
//		System.out.println(result);
//		
//		//�̸��� ȫ�浿�� : 1������
//		//�Ǵ� ���̰� ¦�� : 1������
//		//�������� : 2������
//		
//		
//	
//		//String result2 = name.equals("ȫ�浿")|| age % 2 == 0 ? "1������" : "2������" ;
//		String result2 = (age % 2 == 0) || (name.equals("ȫ�浿")) ? "1������" : "2������" ;
//		
//		System.out.println(result2);
		
		// ���� �ϳ��� �౸���� 6�� �� �� �ֽ��ϴ�.
		// ���� ������ �Է� �޾Ƽ� 
		// ���� ��� ���� ������ ������ �� ������ ���
		
		System.out.print("�౸�� ����: ");
		int ball = k.nextInt();
		
		int result3 = ball % 6 == 0 ? ball/6 : ball/6 + 1 ;
		System.out.printf("%d���� ���� �ִµ� �ʿ��� ���� ����: %d��\n",ball,result3);
		
		
		
	}
}
