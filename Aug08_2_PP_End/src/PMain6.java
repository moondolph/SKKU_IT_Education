import java.util.Arrays;
import java.util.Scanner;

//Bubble Sort : ������ �� �׸��� ���� ���ؼ�
//				���ؿ� �����ϸ� ������ ���� ��ȯ�ϴ� ���� ���

public class PMain6 {
	// ���ڸ� �Է� �޾Ƽ� �迭�� ���� �� (���ڴ� 5��)
	public static int[] getNum() {
		Scanner k = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i + 1);
			num[i] = k.nextInt();
		}
		System.out.println();
		System.out.println("-----------");
		return num;
	}

//	public static int[] num() {
//		Scanner k = new Scanner(System.in);
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		int a = k.nextInt();
//		int b = k.nextInt();
//		int c = k.nextInt();
//		int d = k.nextInt();
//		int e = k.nextInt();
//		int[] bubble = new int[] { a, b, c, d, e };
//		return bubble;
//	}

	// ���� ���� ���� ���
	public static void printNum(int[] num) {
		System.out.println("<<< �Է��� �� >>>");
		for (int i : num) {
			System.out.println();
		}
	}

	// public static void pre(int[] bubble) {
//		System.out.println("�������� ���� ��");
//		for (int i = 0; i < bubble.length; i++) {
//			System.out.print(bubble[i] + " ");
//	}
//}
	// ����
	// ��������(ASC)
	public static int[] getResult(int[] num) {
		int b = 0;
		for (int turn = 1; turn < num.length; turn++) {
			for (int i = 0; i < num.length - 1; i++) {
				// num.length - 1 :
				// if�� �ȿ��� ����� �� ��, ���� �迭���� ���ϱ� ���ؼ�
				// + 1�� ����ߴµ�
				// length ���� �״�� ����ϸ� ������ �߻� �� !

				if (num[i] > num[i + 1]) {
					b = num[i];
					num[i] = num[i + 1];
					num[i + 1] = b;
				}
				System.out.print(num[i] + " ");
			}
			System.out.println(num[4]);
			System.out.println("���ĵ� �� : " + b);
			System.out.println("---------");
		}
		return num;
	}

//public static void asc(int[] bubble) {
//
//		for (int i = 0; i < bubble.length - 1; i++) {
//			for (int j = 0; j < bubble.length - 1 - i; j++) {
//				if (bubble[j] > bubble[j + 1]) {
//					int tmp = bubble[j];
//					bubble[j] = bubble[j + 1];
//					bubble[j + 1] = tmp;
//				}
//				
//			}
//		}
//		return bubble; 

	// ���� ���� ���� ���
	public static void printResult(int[] result) {
		System.out.println("<< ���� �� �� >>");
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------");
	}

//	public static void after(int[] bubble) {
//		System.out.println("\n�������� ���� ��");
//		for (int i = 0; i < bubble.length; i++) {
//			System.out.printf("%d ",bubble[i]);
//		}
//	}

	public static void main(String[] args) {
		int[] num = getNum();
		printNum(num);
		int[] result = getResult(num);
		printResult(result);

//��ǻ� ũ�� �ǹ̰� ����...!
//���ɿ��� ȿ���� ���� ������ !
// ���׿����� ��븸 ��_��;;
		Arrays.sort(num);
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

}
//	public static void main(String[] args) {									//�Լ����� ��±�ɱ��� ������ΰ� main�Լ����� ����Ʈ�� �� ���ΰ�?
//	int[] bubble = num();
//	pre(bubble);
//	asc(bubble);
//	after(bubble);
