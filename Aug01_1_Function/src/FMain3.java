public class FMain3 {
	
	public static void test(int q) { // q(blue) : �Ķ����
		System.out.println(q); // 10 (q/blue) (2��)
		q = 20;
		System.out.println(q); // 20 (q/blue) (3��)
		// test �������� �Ѿ�� �̻� ���� ������ �� ������ main �������� �ٽ� ���ư���.
	}
	
	public static void main(String[] args) {
		int q = 10;				// q (red) : ��������
		System.out.println(q); // 10(1��) (q/red)
		test(q);			   // test �Լ��� ȣ��, q (blue) ���� ����
							   // q (blue)�� q(red)�� �ִ� ���� �����ؼ� �־��ֱ�	
		System.out.println(q); // 10(4��)   main�Լ��� test�Լ��� ���� ���� x --> q = 10
		// �� �̻� ������ ������ ���α׷��� ����!
		
	}

	
}
