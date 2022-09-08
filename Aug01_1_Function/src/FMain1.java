// �Լ� (Function)
// 	   �����ִ� ���(�۾�)���� ���� 
//	   �ʿ��� �� ���� �ҷ���(ȣ���ؼ�) ����� ���� o

// JDK (�ڹٰ���ŰƮ) > JRE(�ڹٽ���ȯ��)
// ���� �� JRE�� OS(�ü��)�� ���缭 > JVM(�ڹ� ����ӽ�)
//	-> WORA (Write Once Read Anywhere) - JAVA
//	OS���� ���α׷��� ������ �ʾƵ� ��!


public class FMain1 {

// public static ����Ÿ�� �Լ���(�Ķ����, �Ķ����, ...) {
// 		����
//		return
// }
	
	//����Ÿ�� : ��ȯ�� ���� �ڷ��� 
	// �Լ� ������ ���� �ϼ��� �ǰ�, main���� ��ȯ�� ������� ���� �ڷ���
	// return�̶�� ���� ����ؼ� ��ȯ�� �� ���̰�, ����� �̵���...!
	
	
	//�Լ��� : �� �״�� �� �Լ��� �̸�. 
	// 	 1. ���ڷ� �����ϸ� -> ����!
	//	 2. Ư������, ���� -> ����!
	//	 3. �ڹٹ���(�����) -> ����!
	//	 	_���� �����ؼ� ������ ���� ����� ���� ~
	// 	 Java�� ��ȭ) 
	// 	 4. �Լ����� ���� ���� ������� �� �� �ְ�!
	// 	 5. �ҹ��ڷ� ���� 
	//	 6. �������� ���ؼ�
	//		��ü : abcd_efg_hijk
	//		��Ÿü : abcdEfgHijk
	//	 7. �ѱ� x !	
	// ������ vs �Լ���  
	// (���)    (����)
	
	// �Ķ����(����, parameter) : �Լ��� �����ϴ� �� �ʿ��� ���
	// �ʿ��� ������ŭ ����ϵ�, �ڷ����� ���缭 ����ؾ��� !!
	// 

	public static void printMyThink() {
		//���� ���� �����ϰ� �ִ� ������ ��� !
			System.out.println("���� �ƹ� ������ ����");
			System.out.println("�ֳ��ϸ�");
			System.out.println("���� �ƹ� ������");	
			System.out.println("���� �����̴�...\n");
		
	}
		//�ڱ�Ұ��ϴ� �Լ�(�̸�, �ڵ�����ȣ, ��� �� ���)
	public static void introduce() {
		System.out.println("�̸�: ���ֿ�");
		System.out.println("�ڵ�����ȣ: 010-1234-5678");
		System.out.println("��� ��: �д�");
	
	}
		//���� �� ���� ������, ��Ģ ������ ������ִ� �Լ�
		//����ϴ� �Լ�
		//����� �Ϸ���, ���ڰ� �ʿ�!
		//�Ķ����(parameter) : �Լ��� �����ϴµ� �ʿ��� ���
	
	public static void calculate(int a, int b) {
		int plus = a + b;
		int minus = a - b;
		int multiply = a * b;
		double divide = a / (double) b;
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiply);
		System.out.println(divide);
		
		
	}
	
	
	
		//���� �� JVM�� main�� �ڵ����� ȣ�� !
		//�츮�� �ڵ��ϼ��ؼ� ����� �� main�� ����� �Լ��� ����!
	public static void main(String[] args) {
		printMyThink();
		printMyThink();
		System.out.println("-------");
		introduce();
		System.out.println("-------");
		calculate(10,20); // �Լ� ȣ��
		calculate(8,2); 
		
	}
}
