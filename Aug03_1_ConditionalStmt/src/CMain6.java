import java.util.Scanner;

public class CMain6 {
	// 1�� = 12��
	// �� �޸��� ��ĥ���� �ٸ��ϴ�
	// �� ������ �Է��� �޾Ƽ�
	// 31�ϱ��� �ֽ��ϴ�. / 30�ϱ��� �ֽ��ϴ�. / 28�ϱ��� �ֽ��ϴ�.
	// 14�� -> ���� ���Դϴ� ���
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("? : ��");
		int month = a.nextInt();
		System.out.printf("%d��\n",month);
		int day = 0;
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			day = 31;
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n",month,day);
			break;
		case 4:case 6:case 9:case 11:
			day = 30;
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n",month,day);
			break;
		case 2:
			day = 28;
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n",month,day);
			break;
		default:
			System.err.printf("%d���� ���� ���Դϴ�.\n",month);    //err �ߴ� ��ó�� ���� ���ڷ� ǥ��
			break;	
		}
//		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n",month,day);         //?�� ���⼭ �״�� �̾�������
	}

}
