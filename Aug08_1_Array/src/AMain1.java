// ����
//	   ���� 1 :  ������ 1

// �迭(Array)   " [ ] "
//	   ���� 1 : ������ n

// �迭 : ���� Ÿ���� ���� ������ �ϳ��� �������� �ٷ�� ��
//  �迭 �� ������ �����͸� '���'��� �θ���. 
//	�� ��Ҹ��� �ٿ��� �Ϸù�ȣ�� �ִµ� �� ��Ҹ� �����ϴµ� ���
//					=> �ε���(Index) : ������ 0���� !!

// �迭 ����
//	   �ڷ���[] ������;		// �迭 ����
//	   ������ = new �ڷ���[�迭�� ���� ����];  // �迭 ����
//	   	 => �ڷ���[] ������ = new �ڷ���[�迭�� ���� ����];
public class AMain1 {
	public static void main(String[] args) {
		int[] eng = new int[3];
		eng[0] = 100;
		eng[1] = 70;
		eng[2] = 50;
		for (int i = 0; i < eng.length; i++) {
			// .length : �� �迭�� ��Ұ� �� ������ �˷���
			System.out.println(eng[i]);
		}
		
		System.out.println("--------------------------");
		int[] math = new int[] { 10, 30, 60 }; // 3��°(���)�� �� ���� ��찡 �ֱ� ������
											   // 2��° ���� �˾Ƶ� �ʿ䰡 ����!
		
		for (int i = 0; i < math.length; i++) {
			System.out.println(math[i]);
		}
		
		
		System.out.println("--------------------------");
		int[] kor = {20, 40, 60}; //���
		for (int i = 0; i < kor.length; i++) {
			System.out.println(kor[i]);
		}
		
		
		System.out.println("---------------------------");
		int a = 10;
		int[] b = {10, 20};
		System.out.println(a);
		System.out.println(b);	// ������ ������(�ּҰ�)
//		b[2] = 200;				// �迭�� �� �߰� �ȵ�
//		System.out.println(b[2]);    // ERROR! (�迭�� ������ ������ ���� �ʾұ� ������)
		System.out.println("---------------------------");
		
		int[][] score = { {50, 30}, {30, 50}, {100, 80} }; //2���� �迭.. �Ÿ����� !
		System.out.println(score);		  //�ּҰ�(��ü�� ����)
		System.out.println(score[0]);     //�ּҰ�(0��° �л��� ����)
		System.out.println(score[1][0]);  // 1��° �л��� ���� ����
		// ���� : �ּ� ���� �ؼ��� ��ƴ�
		// students.get.getKorScore();�� �� ���� ����!
	}
}
// Java�� �� �ϴ� ���?
// 		���ǹ�
//		�ݺ���
//		�迭 : ???
//		   : Java������ �迭 NO!-->(�÷���)		
//			�迭�� ���鶧 ����� ����
//			 => ����� �𸣸� �迭�� �� �����...
