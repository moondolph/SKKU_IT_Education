import java.util.Random;

public class FMain6 {

//	// B : �Լ��� / ����� �����̶� ���̰�, ���簰�� �۸�, ��Ÿü or ��ü 
//	// C : �Ķ���� / �Լ��� ȣ���ϴ� ��(main �Լ�)���� �ش� �Լ������� �����͸� ���� ��
//	//				( �ڷ��� ������, �ڷ��� ������, ... )
//	// A : ����Ÿ�� / �ش� �Լ����� �۾��� ����� ȣ���� ��(main �Լ�)���� ���� ��
//	
//	// public static A B (C) {
//	//	  ����
//	//	  return
//	//  }
//	// ������ ������ �ϳ� ���ϴ� �Լ�
//	public static int getNum() {
////		Random r = new Random();
////		int getNum = r.nextInt();
////		return getNum ;
//		return new Random().nextInt();
//	}
//	
//	
//	// �� ������ ���� ���� ����ϴ� �Լ�
//	public static void printSum(int a, int b) {
//		System.out.println(a + b);
//	}
//	
//	
//	public static void main(String[] args) {
//		int x = getNum();
//		int y = getNum();
//		printSum(x,y);
//	}
	
	
	public static int getInt() {
		Random r = new Random();
		int getInt = r.nextInt();		
		return getInt ;
	}
	
	public static void printSum(int a, int b) {
		int plus = a + b ;
		System.out.println(plus);
	}
	
	
	
	
	
	public static void main(String[] args) {
		//������ ������ 2�� ���ؼ�...
		// �� 2���� ���� ���� ���� ���
		int a=getInt();
		int b=getInt();
		System.out.println(a);
		System.out.println(b);
		printSum(a, b);
		
	}
	
}
	
	
	
	
	
	
	

