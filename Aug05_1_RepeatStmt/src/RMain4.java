// for (�����ʱ�ȭ; ���ǽ�; ��������) {
//		����
//}
public class RMain4 {
	public static void main(String[] args) {
		// 1 ~ 100 ������ ���� �߿��� 6�� ����� ���� ���� ���
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				s = s + i;
				System.out.printf("���� ���� : %d\n", i);
				System.out.printf("���� �� : %d\n", s);
				System.out.printf("------------");
			}

		} System.out.println(s);

		// 4x + 5y = 60�� �Ǵ� ��(����)�� ��� ���ؼ�
		// (x, y)�� ���·� ���
		// x, y�� �� �� 10 ������ ���� (1 ~ 10)
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if (4*x+5*y==60) {
					System.out.printf("(%d, %d)\n", x,y);
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
