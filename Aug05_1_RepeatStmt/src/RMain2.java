import java.util.Random;
import java.util.Scanner;
//Up & Down ���� (main��)
//1 ~ 100 ������ ����
//��ǻ�� vs �� => ���� ���ڳ��� ����
//	 ���ڰ� ������ ������ Down!
//	 ���ڰ� ������ ������ Up!
//   �� �ϸ��� ������ ã�Ҵ��� ���!
// �ݺ���(for), ���ǹ�(if)

public class RMain2 {

	public static void main(String[] args) {
System.out.println("��ǻ�Ͱ� 1~100 ������ ���� 1���� ���ϴ�.");
		Random r = new Random();
		int computer = r.nextInt(100)+1;
System.out.println("��ǻ�Ͱ� 1~100 ������ ���� 1���� �� ������ϴ�.");

System.out.print("����� �����Դϴ�. ��ȣ�� �Է��ϼ��� : ");
		
Scanner k = new Scanner(System.in); // for �ȿ��� ����� ��� �ݺ��ϴϱ� ���ʿ����ݾ� �ۿ��� �����
		
		int me = 0; // for �ȿ��� ����� ��� �ݺ��ϴϱ� ���ʿ����ݾ� �ۿ��� �����
		
		for (int i = 1; ; i++) { // �� �� �ݺ����� �𸣱� ������ ������ ������ �� ����. ���� �������ص� ��. �ƴϸ� true �־�.
			me = k.nextInt();
			if (computer == me) {
				System.out.printf("%d������ �����Դϴ�.\n", i);
				System.out.println("������ �����մϴ�.");
				break ;
			} else if (computer > me) {
				System.out.println("->UP!");
				System.out.print("�ٽ� ��ȣ�� �Է��ϼ���: ");
			} else if (computer < me) {
				System.out.println("->down!");
				System.out.print("�ٽ� ��ȣ�� �Է��ϼ���: ");
				
			}
		} System.out.println("*******************");
	
	
	
	
	}
}