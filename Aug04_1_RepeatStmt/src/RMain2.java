
//���� for�� == for���ȿ� for�� == ��ø for��

public class RMain2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 6; i++) {
//			System.out.printf("i�� : %d-------\n", i);
//			for (int j = 1; j < 6; j++) {
//				System.out.printf("j�� : %d\n", j);
//			}
//		}

		// ������

//		for (int i = 2; i<10; i++) {
//			System.out.printf("-----<%d��>-----\n",i);
//			for (int j=1; j<10; j++) {
//				System.out.printf("%d �� %d = %d\n",i,j,i*j);
//			}
//		}

//		for (int i = 2; i < 10; i++) {
//			System.out.printf("<<<%d��>>>\t", i);
//		}
//		for (int j = 1; j < 10; j++) {
//			System.out.println();
//			for (int i = 2; i < 10; i++) {
//				System.out.printf("%d * %d = %d\t", i, j, i * j);
//				
//			}
//		}

//		for(int i = 2; i <=9; i++) {
//			System.out.printf("<<< %d�� >>>\t", i);
//		}
//		System.out.println();
//		
//		for (int i = 1; i<10; i++) {
//			for (int dan =2; dan < 10; dan++) {
//				System.out.printf("%d x %d = %d\t",dan, i, dan* i);
//			}
//			System.out.println();
//		}
//	
		// �����

		// ��
		// ����
		// ������
		// ��������
		// ����������
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("��");
			}
			System.out.println("");
		}

		// ��������
		// ��������
		// ��������
		// ��������
		System.out.println("----------");

		for (int i = 1; i < 5; i++) {
			System.out.println("��������");
		}

		System.out.println("----------");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("��");
			}
			System.out.println();
		}

//		      ��         ���� ���� �ѹ� ��
//		     ����			�ι� ���� �ι� ��
//		    ������		�ѹ� ���� ���� ��
//		  ��������			�� ����  �׹� ��
		// i,j ����� if ���ǹ����� ����� �����
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("��");
				}

			}
			System.out.println();
		}
//   ��
//  ������
// ����������
//��������������
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("��"); 
			}
			System.out.println();
		} 
		
		
		
	}
}