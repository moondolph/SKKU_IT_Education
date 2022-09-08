import java.util.Scanner;

//��������
// 	����� boolean (true / false)
// 	> (�ʰ�), >= (�̻�), == (����), != (�ٸ���), < (�̸�), <= (����)	

public class OMain3 {
	public static void main(String[] args) {
		
		//���̰������� ���̱ⱸ�� Ÿ�� �Ǵ��� �������ִ� ���α׷�
		// Ű(cm), ���̸� �Է¹޾Ƽ� ���

	Scanner a = new Scanner(System.in);
		
		System.out.print("Ű(cm)�� �Է��ϼ���: ");
		double height = a.nextDouble();
		
		System.out.print("���̸� �Է��ϼ���: ");
		int age = a.nextInt();
		
		System.out.printf("Ű�� %.1fcm, ���̴� %d��\n", height, age);
		
		//���̰� 10���� �Ѵ� ����� Ż �� ����
		boolean ride1 = (age > 10);
		System.out.printf("ride1 ž�� ���� ? : %b\n", ride1);
		
		//���̰� 5�� �̸��� Ż �� ����
		boolean ride2 = (age < 5);
		System.out.printf("ride2 ž�� ���� ? : %b\n", ride2);
		
		//���̰� 20�츸 Ż �� ����
		boolean ride3 = (age == 20);
		System.out.printf("ride3 ž�� ���� ? : %b\n", ride3);
		
		//���̰� 1�츸 �ƴϸ� Ż �� ����
		boolean ride4 = (age != 1);
		System.out.printf("ride4 ž�� ���� ? : %b\n", ride4);
		
		//���̰� Ȧ���� ����� Ż �� ����
		boolean ride5 = (age % 2 == 1);   // �ణ�� ������ ��� �ʿ�!
		System.out.printf("ride5 ž�� ���� ? : %b\n", ride5);
		System.out.println("==============================");
		//���׷��̵� ! 
		//		~�� (and)  : &&
		// 		~�ų� (or)  : ||(shift + \)
		//		XOR		  : ^   (eXclusive OR) => �� �Է��� ���� �ٸ� �� '1' ������� ��� !
		//		NOT		  : !	=> ����� ������ ��
		
		// A && B : A�� ����, B�� ���� => ���� OK !
		//			Ȯ���� ���� ������ ������ ��ġ!
		// A || B : A�� �����ϰų�, B�� �����ϰų�, �� �� �����ϰų� => ���� OK!
		//		  : Ȯ���� ���� ������ ������ ��ġ !
		// �ᱹ ��ǻ�Ͱ� ������ ȿ�������� ã�� �������
		
		// ���̰� 3���� �Ѱ�, Ű�� 2m �Ѿ�� Ż �� ����

		
		// boolean ride6 = (age > 3 && height > 200);
		boolean ride6 = (height > 200 && age > 3); // �̰� �� ȿ����
		System.out.printf("ride6 ž�� ���� ? : %b\n", ride6);
	
		
		// Ű�� 1.9m �Ѱų�, ���̰� 50�� �̸��̸� Ż �� ����
		//boolean ride7 = (height > 190 || age < 50);
		boolean ride7 = (age < 50 || height > 190); //�̰� �� ȿ����
		System.out.printf("ride7 ž�� ���� ? : %b\n", ride7);
		
		// 10 < ���� < 40�̸� Ż �� ����
		boolean ride8 = (age < 40 && age > 10); //�̰� �� ȿ����
		//boolean ride8 = (10 < age < 40); // �ȵ� ����
		System.out.printf("ride8 ž�� ���� ? : %b\n", ride8);
		
		//���̰� 10�� �̻��̵���, Ű�� 1.5m�̻��̵��� �ϳ��� �¾ƾߵ˴ϴ�
		boolean ride9 = (height >= 150 ^ age >= 10); 
		System.out.printf("ride9 ž�� ���� ? : %b\n", ride9);
	
		//ride9�� Ż �� �ִ� ����� �� Ÿ��,
		//ride9�� Ż �� ���� ����� Ż �� ����
		boolean ride10 = !ride9; 
		System.out.printf("ride10 ž�� ���� ? : %b\n", ride10);
		
		
		
		
	}
}
