

public class FMain4 {
	
	// �����ε�(Overloading) *** ������������������� ���! ������������
	// �Լ��� ����, �Ķ���͸� �ٸ��� �ϴ� ���
	// ȣ���� �� � ���� �־����Ŀ� ���� �Լ��� �ҷ����� �ϴ� ���
	
	// ���� �ڷ����� �ᵵ, �Ķ������ ������ �ٸ��� �����ε� ����
	// �Ķ������ ������ ���Ƶ�, �ٸ� �ڷ����� ����ϸ� �����ε� ����
	
	// ���� 2���� ������ �� ���� ������ִ� �Լ�
	
	public static void printSum(int a, int b) {
		
		System.out.println(a + b);
	}
	
	// ���� 3���� ������ �� ���� ������ִ� �Լ�
	
	public static void printSum(int a, int b, int c) {
		
		System.out.println(a + b + c);
	}
	
	// �Ǽ� 3���� ������ �� ���� ������ִ� �Լ�
	public static void printSum(double a, double b, double c) {
		System.out.println(a + b + c);
	}
	
	// ���� 1���� ������ -> ��! ��� 
	public static void tried(int sdjkflsd) {
		System.out.println("�� !");
	}
	// ���ڿ� 1���� ������ -> ��! ���
	public static void tired(String askfdjas) {
		System.out.println("�� !");
	}
	
	// �Ǽ� 1���� ������ -> ���ƾƾ�
	public static void tired(double zxcvzxvc) {
		System.out.println("���ƾƾ� !");
		
	}
	// �ƹ��͵� ���� ������ -> ... ���
	public static void tired() {
		System.out.println("...");
	

		
	}	
	public static void main(String[] args) {
		printSum(10,20);
		printSum(10,20,30);
		printSum(10,20,30);
		System.out.println("------------");
		tired(1);
		tired("asdf");
		tired(1.1);
		tired();
		
		// �����ε�...�� �˾ƺôµ�...
		// ��� �츮�� ù ������ �� �����ε��� ����ϰ� �־����ϴ� ! ��0�� ~
		//System.out.println
	}
}
