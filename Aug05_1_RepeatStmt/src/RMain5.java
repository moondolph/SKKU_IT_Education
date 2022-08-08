import java.util.Random;

public class RMain5 {
	public static void main(String[] args) {
		// 1 ~ 10 ������ ������ ����
		// ���� �ٸ� ������ ���� 5�� ���

		Random s = new Random();

		for (int i = 0; i < 5; i++) {
			int x = s.nextInt(10) + 1;
			System.out.println(x);
		}
		System.out.println("------------------");

		// 1~10������ ������ ������ ���
		//
		for (int i = 0;; i++) {
			int x = s.nextInt(10) + 1;
			System.out.println(x);
			if (x == 9) {
				break;
			}

		}

		// �ݺ� Ƚ���� ��Ȯ - for��(o)

		// �ݺ� ���� (if���� �ݺ�����)
		// while �� : ������ ���� �˻�
		// ������ true(��)�� ���ȿ� ��� �ݺ��ؼ� ���� �κ��� �����Ű��...
		// ����κп��� ������ false(����)���� ���� ���ߵ��� �ϰų�
		// break; ��ɾ�� �ݺ����� �����ų �� �ִ�.
		// ������ ���� ������ �ݺ��ϴ� �۾��� ����!
		// ���Ѵ�� �ݺ��ϰ� ���� �� while (true) ���

		// while : �ݺ�Ƚ���� ��Ȯ�� �� �� ���� ��,
		// Ư���� ���ǿ��� ����� �ϴ� ��쿡 ���!
		// while (���ǽ�) {
		// ����
		// }
		// �ѹ��� �ݺ� �� �� ���� ����... ��_��
		//

		int y = s.nextInt(10) + 1; // ������ ������ �� �� �̾Ұ�
		while (y != 9) { // 9�� �ƴϸ� (= 9�� ���ö�����)
			System.out.println(y);
			y = s.nextInt(10) + 1; // �ٽ� while���� ���ư��� ������ üũ
		}
		System.out.println("-------------");
		// 1 ~ 3 ������ ������ ������ ���
		// 3�� ������ �ݺ��� ����

		int z = s.nextInt(3) + 1;
		while (z != 3) {
			System.out.println(z);
			z = s.nextInt(3) + 1;
		}
		System.out.println("-------------");

		// do - while�� : ������� �ϰ� ������ ���߿� �˻� (���� �Ⱦ�)
		// �ѹ��� �ݺ��� ���� o
		do {
			System.out.println(z);
			z = s.nextInt(3) + 1;
		} while (z != 3);
		System.out.println("-------------");

		// 1 + 2 + 3 + ... + 10 = ? -> for��
		// 1 + 2 + 3 + ... + n <= 100 -> while��

		// 1 ~ n��° ������ �� 100�� �Ѿ�� �ݺ����� ����ǰ�
		// �� ���� ������ / n ���� ������ ���

		int sum = 0;
		int n = 0;
		while (sum < 100) {
			n++;
			sum = sum + n; // sum += n;
		}
		System.out.printf("n�� �� : %d", n);
		System.out.printf("�� �� : %d", sum);
		System.out.println("---------------");
		
		// 1000 ������ ���� �߿���
		// ���� ū 15�� �����?
		int x=1000;
		while (x % 15 > 0) {
		    x--;
		    System.out.println(x);
		}
	
	
	
	
	
	}
}