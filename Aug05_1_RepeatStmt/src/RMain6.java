import java.util.Scanner;

public class RMain6 {
	public static void main(String[] args) {
		//�ݺ��� 10�� -> �ݺ��� 1�� �������� �ȳ��ϼ��� x3���� ���
		//���ڱ� ���� 3�� ���� �ȵ�...
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==3) {
				continue;
			}
			System.out.println(i);
			System.out.println("�ȳ��ϼ��� 1Ʈ");
			System.out.println("�ȳ��ϼ��� 2Ʈ");
			System.out.println("�ȳ��ϼ��� 3Ʈ");
		}
		System.out.println("---------------------");
		for (int i = 0; i <10 ; i++) {
			if(i%2 ==0) {
				System.out.println("��!");
			} else {
				//continue;     // �����ݺ�(������) -> Ȧ���϶��� �����ϰ�, �������� �Ѿ
				break; 			// (������), �ݺ��� ��!
				//return;       // (�������), �Լ��� ��, ��·�簣�� �ݺ����� ����! 
			}
		}
		System.out.println("---------------------------");
		// �ڸ�Ʈ ������ �Է� �����ǵ�, ������ ��� �޾ƿ� ��
		// ������ "����"�� �ݺ��� ��!
		
		Scanner k = new Scanner(System.in);
		System.out.print("�ڸ�Ʈ�� �Է��ϼ���: ");
		String cmt = k.next();
		while (!cmt.equals("����")) { 					//���� ���غ� �ؿ� �ڵ��. ������ �ٷ� ���� �Է��ϰԵǸ� ������ �س���. 
			System.out.println(cmt);
			System.out.print("�ڸ�Ʈ�� �ٽ� �Է��ϼ���: ");
			cmt = k.next();
		}System.out.println("�ݺ��� ��!");
		
		while(true) {									//�ؿ��� ������ ���ư��� ����
			System.out.print("���� : ");
			cmt = k.next();
			System.out.println("------------");
			System.out.println(cmt);
			System.out.println("------------");
			if (cmt.equals("����")) {
				System.out.println("�ݺ��� ��!");
				break;
			}
		}
		
		
	
	
	}
}
