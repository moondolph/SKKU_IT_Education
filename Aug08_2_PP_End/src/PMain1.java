import java.util.Scanner;

//� ���ڸ� �ܼ�â�� �Է�
// �� ������ ����� ������ִ� ���α׷�						
//	Main���� ���� -> �������� ����
// ex) 12�� ����� : 1, 2, 3, 4, 6, 12
// ��� �Է��ϸ� ����� ��� ����ؼ� �����ְ� 
// �ܼ�â�� 0�� �Է��ϸ� ���α׷��� ����ǰ�! (0�� �Է��ϱ� �������� ���ѹݺ�)
// �迭 ���x 

// --> 1. �ݺ��� �ȿ��ٰ� ��ĳ�ʷ� �Է¹ް� �ϰ� + %==0 �̿��ؼ� ����� ����ϰ� ��


public class PMain1 {
	public static void main(String[] args) {

//		Scanner k = new Scanner(System.in);
//		int num = 0;
//		while (true) {
//			System.out.print("���� �Է�(0 �Է��ϸ� ����) : ");
//			num = k.nextInt();
//			if (num == 0) {
//				System.out.println("�����մϴ�.");
//				break;
//			}
//			System.out.printf("[%d]�� ����� : ", num) ;
//			for (int i = 1; i <= num ; i++) {
//				if(num%i == 0) {
//					System.out.printf("%d ", i);
//				}
//			}
//			System.out.println();
//		}

		Scanner k = new Scanner(System.in);
		
			while(true) {
			System.out.print("����� ���ϰ� ���� ���ڸ� �Է��Ͻÿ�: ");
			int a = k.nextInt();
			if(a==0) {
				break;				
			}			// �Է¹��� ���ڰ� 0�̸� ���α׷� ����ǰ� break������ �ݺ��� �� 
			System.out.print("���:");		//ȭ�鿡 ��µǴ� �κ�
			int i = 0;
			for (i=1; i<=a; i++) {
				if (a % i == 0) {
					System.out.printf("%d ",i);
				}								//for������ i�� 1���� �Է¹��� ���ڱ��� Ŀ���� �ϰ� �������� 0�� ���� ������ ���� ����� ��� 
			} break;
		}
		
	
	}
}