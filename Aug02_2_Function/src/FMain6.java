import java.util.Random;

public class FMain6 {

	// B : �Լ��� / ����� �����̶� ���̰�, ���簰�� �۸�, ��Ÿü or ��ü 
	// C : �Ķ���� / �Լ��� ȣ���ϴ� ��(main �Լ�)���� �ش� �Լ������� �����͸� ���� ��
	//				( �ڷ��� ������, �ڷ��� ������, ... )
	// A : ����Ÿ�� / �ش� �Լ����� �۾��� ����� ȣ���� ��(main �Լ�)���� ���� ��
	
	// public static A B ( C ) {
	//	  ����
	//	  return
	//  }

	// ������ ������ �ϳ� ���ϴ� �Լ�
	public static int getNum() {
		return new Random().nextInt();
	}
	
	
	// �� ������ ���� ���� ����ϴ� �Լ�
	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}
	
	
	public static void main(String[] args) {
		int x = getNum();
		int y = getNum();
		printSum(x,y);
	}
	
	
//	public static int getInt() {
//		Random r = new Random();
//		int getInt = r.nextInt();		
//		return getInt ;
//	}
//	public static int plusInt(int int1, int int2) {
//		int plus = int1 + int2 ;
//	return plus ;
//	}
//	
//	
//	
//	
//	
//	public static void main(String[] args) {
//		//������ ������ 2�� ���ؼ�...
//		// �� 2���� ���� ���� ���� ���
//		int int1=getInt();
//		int int2=getInt();
//		plusInt(int int1, int int2)
//		
//		System.out.println(plus) ; 		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

