import java.util.Scanner;

//Bubble Sort : ������ �� �׸��� ���� ���ؼ�
//				���ؿ� �����ϸ� ������ ���� ��ȯ�ϴ� ���� ���

public class PMain6 {
	// ���ڸ� �Է� �޾Ƽ� �迭�� ���� �� (���ڴ� 5��)
	public static int[] num() {
		Scanner k = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = k.nextInt();
		int b = k.nextInt();
		int c = k.nextInt();
		int d = k.nextInt();
		int e = k.nextInt();
		int[] bubble = new int[] { a, b, c, d, e };
		return bubble;
	}

	// ���� ���� ���� ���
	public static void pre(int[] bubble) {
		System.out.println("�������� ���� ��");
		for (int i = 0; i < bubble.length; i++) {
			System.out.print(bubble[i] + " ");
	}
}
	// ����
	// ��������(ASC)
	public static void asc(int[] bubble) {

		for (int i = 0; i < bubble.length - 1; i++) {
			for (int j = 0; j < bubble.length - 1 - i; j++) {
				if (bubble[j] > bubble[j + 1]) {
					int tmp = bubble[j];
					bubble[j] = bubble[j + 1];
					bubble[j + 1] = tmp;
				}
				
			}
		}
//		return bubble; 
	}

	// ���� ���� ���� ���
	public static void after(int[] bubble) {
		System.out.println("\n�������� ���� ��");
		for (int i = 0; i < bubble.length; i++) {
			System.out.printf("%d ",bubble[i]);
		}
	}

	public static void main(String[] args) {									//�Լ����� ��±�ɱ��� ������ΰ� main�Լ����� ����Ʈ�� �� ���ΰ�?
	int[] bubble = num();
	pre(bubble);
	asc(bubble);
	after(bubble);
}
	}

