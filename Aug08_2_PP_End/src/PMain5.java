// ���� ����... o0o !!!
// Call By Value, Call By Reference
// ��� ���� ����Ǿ����� ������ �� �־��...

// Call By Value : ������ '��'�� �����ؼ� �Լ��� �Ķ���� ������ ����ϴ� ��
// Call By Reference : ������ �����ϴ� �ּҰ�(������)�� �Ķ���ͷ� �����ϴ� �� 

public class PMain5 {

	public static void test(int a, int[] b, int[] c) {
		System.out.println("b(green)" + b);  // asdfsdaf
		System.out.println("c(green)" + c);  // asdfasdfsdf
		System.out.println(a + "a(green)");  //  10
		System.out.println(b[0] + "b(green)");  // 10
		System.out.println(c[0] + "c(green)");  // 10
		System.out.println("----------------");
		a = 100;
		b[0] = 100;		// main�ʿ� ������ �� (������)
						// �⺻���� �������� ���� !
		c = new int[] {100 , 200} ; // �� �״�� ���ο� �� (new)
									// new int[] �� ����� -> ����� �� ���� ����(���Խ��� �ƴ϶�)
									// new int[]�� ���Խ� !
		System.out.println("b(green)" + b); //  ������
		System.out.println("c(green)" + c); //  ������
		System.out.println(a + "a(green)"); //   100
		System.out.println(b[0] + "b(green"); //   100
		System.out.println(c[0] + "c(green"); //   100
		
	}
	
	
	public static void main(String[] args) {
		int a = 10;
		int[] b = {10,20};
		int[] c = {10,20};
		System.out.println("b(red) " + b);  //{10, 20}; -->�迭�� �������̶� ����Ʈ�ϸ� adsjflasfd�ּҷ� ����
		System.out.println("c(red) " + c);  //{10, 20}; -->�迭�� �������̶� ����Ʈ�ϸ� adsjflasfd�ּҷ� ����
		System.out.println("----------------");
		test(a, b, c);
		System.out.println("----------------");
		System.out.println(a + "a(red)");  // 10
		System.out.println(b[0] + "b(red)");   //   10 (x) --> 100 (o) // *** �� ���濡 ������ �޾���
		System.out.println(c[0] + "c(red)");   //   10 // *** �� ���濡 ������ ���� �ʾ���
													   // test �Լ��� ����� c�ʹ� �ٸ��� ������ !
		
	}
	
}
