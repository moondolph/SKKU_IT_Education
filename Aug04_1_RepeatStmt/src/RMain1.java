import java.util.Random;

// ���±��� �ߴ� �� - �������� ���...!
// �ݺ��� - �̰��� ���...! -> ������� !

public class RMain1 {
	public static void main(String[] args) {
		// �� ���
		// �� 5�� ���
		// �� 53�� ���
		System.out.println("��"); // 1��

		System.out.println("��");
		System.out.println("��");
		System.out.println("��");
		System.out.println("��");
		System.out.println("��"); // 5��

		// 1. � �۾��� 53�� �ݺ�(Ƚ��)
//		for (�����ʱ�ȭ; ���ǽ�; ���� ����) { (1. �����ʱ�ȭ) (2. ���ǽ��� ������(��))  (4. ���� ����) (5. �ٽ� ���� ��) (7. ���� ����) (8. ���� ���� �ȸ�����(����)
//			����							(3. �������)  (6. ���� ���)
//	}
		// 2. �۾� - ��ǽð����� �ݺ�(����)

		// ���� 3�� ����ϰ� ����!
		for (int i = 0; i < 3; i++) {
			System.out.printf("%d : ��\n", i);
		}
		System.out.println("---------------");

		// 5���� 1���� ������� �������� ���
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}

//		for (int i = 1; i<6; i++) {
//			System.out.print(6-i);
//		}
//		//i++ or i += 1 or i = i+1
//		for (int i = 0; i<5; i++) {
//			System.out.print(5-i);
//		}

		// 1, 3, 5, ... , 21���� ���
		for (int i = 1; i < 22; i += 2) {
			System.out.println(i);
		}

//		for (int i=0; i<11 ; i++) {
//			System.out.println(2*i+1);

		// �ݺ����� 5�� ���� ���ȿ� 1 ~ 10 ������ ���ڸ� �����ϰ� �̰� ���� ��?
		Random a = new Random();
		int n = a.nextInt(10) + 1;// ������ ���ڸ� �ϳ� �̾Ѿ�
		for (int i = 0; i < 5; i++) {
			System.out.println(n); // �� ���� ��� ����� 5�� �ݺ�
		}
		// �ݺ��� �ӿ��� ������ ����� �� ����!
		// �ݺ����� �� �� �������� ������ ������
		for (int i = 0; i < 5; i++) {
			Random x = new Random();
			int m = a.nextInt(10) + 1;
			System.out.println(m);
		}
		// �ݺ��� �ȿ��� ������ ���� ����°��� �����ϴ°� ����!
		// �ݺ��� �ۿ��� ���� �ϳ��� ���� ���� ���°� ���� �� ȿ���� !
		int x3 = 0;
		for (int i = 0; i < 5; i++) {
			x3 = a.nextInt(10) + 1; // ������ '����' (x) / ������ ���� '����' (o)
			System.out.println(x3);
		}
		System.out.println("------------------");
		// 1 + 2 + 3 + ... + 10 ���� �� ���
		int s = 0;
		for (int i = 1; i < 11; i++) {
			s = s + i;
			System.out.println(s);
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i; // sum = sum + i;
		}

		// ���丮��!
		// 7! ->? -> 1 * 2 * 3 * 4 * 5 * 6 * 7
		int fac = 1;
		for (int i = 1; i < 8; i++) {
			fac = fac * i;
		}
		System.out.println(fac);
		System.out.println(1 * 2 * 3 * 4 * 5 * 6 * 7);
		System.out.println("------------------");
		
		// 1~50���� ���� �߿�
		// 3�� ����ų�, 5�� ����� ���ڸ� �� ���� ���� ���
		
		int total = 0;
	
		
		
		for (int i = 1; i <= 50 ; i ++ ) {
		if (i % 3 == 0 || i % 5 ==0) {
		total += i;   // plus = plus + i
				}
			}
		System.out.println("1 ~ 50���� ���� �߿� 3�� ����ų� 5�� ����� ������ �� = " + total);
		
	}
}