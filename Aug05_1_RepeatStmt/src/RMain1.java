public class RMain1 {
	// �����

	// ��
	// ����
	// ������
	// ��������
	// ����������

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		// ��
		// ��
		// ��
		// ��
		// ��

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					System.out.print("��");
				} else {
					System.out.print("  "); // ���� �� ���ϸ� �� ����
				}
			}
			System.out.println();
		}

		// 2��° ���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  "); // j�� i���� ���� ������ ����� �޲���
			}
			System.out.println("��"); // i=j�� �� ���� ���� for ������ �� �ѹ� ��� ���� �ٷ� �Ѿ
		}

		// 3��° ���
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "��" : "  ");
			}
			System.out.println();
		}
		// ����������
		// ��������
		// ������
		// ����
		// ��

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				if (i % 2 == 0) {
//					System.out.print("��");
//				} else {
//					System.out.print("��");
//				}
//			}
//			System.out.println();
//		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 0) ? "��" : "��");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		// ��
		// ������
		// ����������
		// ��������������
		// ������������������
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2 * i + 1; j++) { // j<=2i�� ����
				System.out.print((i % 2 == 0) ? "��" : "��");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			
			for(int j=0;j<=(i*2); j++)	{
				System.out.print("*");
			}
			}}System.out.print(" ");
				
		}

	for(

	int i = 0;i<5;i++)
	{
		for (int j = 0; j <= 4 + i; j++) {
			if (j >= 4 - i) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}}