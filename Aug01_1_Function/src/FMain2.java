
public class FMain2 {
	
	public static void test(int b) { // �Ķ���� ������ �ҷ����� �� ���� �Լ� �ȿ� �ִ� 
									// ������ ������ �Ǿ �׸��� b�� ���� stack�� ���̰� ��.
		int a = 123;
		System.out.println(b);   // 30
		System.out.println(a + b);	 // 153	
	}
	
	public static void main(String[] args) {
		int a = 10;		// ���� ����(local variable)
		int b = 20;		// : �Լ� ������ ���� ����
		int c = 30;		//   �� �Լ� �ȿ����� ����� ���� o
		
		test(c); 
		System.out.println(b);// 20

		// ���� ���� �ȿ����� ���� �̸��� ������ ���� �� ����!
		// int a = 100; 
	}
}
