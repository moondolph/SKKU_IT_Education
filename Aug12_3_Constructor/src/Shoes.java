// ������ (Constructor)
// 		��ü�� ��������� ���� �۾��� �ؾ��ϴµ�...
//		=> ������ ����� !
// 		������ �ƿ� ����, �޼ҵ���� Ŭ������� ���� �޼ҵ�
//		�����ڸ� ������ ������
//			=> �ڹ� �����Ϸ��� �⺻ �����ڸ� ��������
//		�����ڸ� �ǵ帮��...
//			=> �ڹ� �����Ϸ��� �⺻ �����ڸ� �� �������
// 			=> �ý����� �ڵ����� ��ü�� ���� ���� �ִµ�...
//				=> �⺻ �����ڸ� �� => ����!
//

public class Shoes {

	String name;
	int size;
	int price;
	static String brand = "����Ű"; // static final String brand = "����Ű";
									// final �־ ��

	// �⺻ ������(Ctrl + Space)
	public Shoes() {

	}

	// ������ �����ε�(Ctrl + Shift + Space)
	public Shoes(String name, int size, int price) {
		super(); // ���� �ִ� �⺻�����ڸ� �ҷ���!
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public void printInfo() {
		System.out.printf("�𵨸� : %s\n", name);
		System.out.printf("������ : %d\n", size);
		System.out.printf("���� : %d\n", price);
		System.out.printf("�귣�� : %s\n", brand);
	}
	
	public void test(String name) {
		// ��������� / �Ķ���͸� ���ٸ�?
		//		this. ���̰� �Ǹ� ������ �������
		//		�Ⱥ��̸� ���� �����̿� �ִ� ��				
		//			
		
		System.out.println(name);
		System.out.println(this.name);
		
		
	}






}
