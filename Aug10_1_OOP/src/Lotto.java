import java.util.Random;
import java.util.Scanner;

public class Lotto {
	// 1. �ζ� ��ȣ�� �� 6�� ��ȣ�� ����
	// 2. 6�� ��ġ : 1�� / 5�� ��ġ : 2�� / 4�� ��ġ : 3�� / ������ : ��
	// 3. 1 ~ 45���� ���� �����ϰ�
	// 4. �޼ҵ� ����ؼ�!
	public static void main(String[] args) {
		//�������� ��÷��ȣ 6�� ����
		int[] lotto = new int[6];

		Random r = new Random();
		Scanner k = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			lotto[i] = r.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		//���ù�ȣ 6�� �Է�
		int[] pick = new int[6];
		System.out.print("�ζ� ��ȣ 6���� ������:");
		for (int j = 0; j < 6; j++) {
			pick[j] = k.nextInt();
		}
		
		//��÷��ȣ�� ���ù�ȣ ���� ���� ��
		int count = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (lotto[i] == pick[j]) {
					count += 1;
				}
			}
		}
		
		switch (count) {
		case 6:
			System.out.println("1��");
			break;
		case 5:
			System.out.println("2��");
			break;
		case 4:
			System.out.println("3��");
			break;

		default:
			System.out.println("��");
			break;
		}
		
		//��÷��ȣ �������� ����
		for (int i = 0; i < lotto.length; i++) { // �� ��ü
			for (int j = i + 1; j < lotto.length; j++) { // �� ���
				if (lotto[i] > lotto[j]) { // �� ��ü�� �� ��󺸴� ū ��� ���� �ٲ���ߵ�

					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		//��÷��ȣ ���
		System.out.print("��÷��ȣ: ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
		//���ù�ȣ �������� ����
		for (int i = 0; i < pick.length; i++) { // �� ��ü
			for (int j = i + 1; j < pick.length; j++) { // �� ���
				if (pick[i] > pick[j]) { // �� ��ü�� �� ��󺸴� ū ��� ���� �ٲ���ߵ�

					int temp = pick[i];
					pick[i] = pick[j];
					pick[j] = temp;
				}
			}
		}
		//���ù�ȣ ���
		System.out.print("\n���ù�ȣ: ");
				for (int i = 0; i < pick.length; i++) {
					System.out.print(pick[i] + " ");
				}
	
	}
}