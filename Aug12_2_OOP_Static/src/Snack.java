// ������� : ��ü�� �Ӽ� -> (��ü.�Ӽ�)���� ǥ��
//					  this : �� ��ü�� ���� (���� ���� o)

// �� ������ ��� ���ڸ� ������ ����ٰ� �Ѵٸ�?
//		�� �� ����ϴ°� *** static ������� !
//			- ��ü�� ��� �� �� �ִ� ����
//				=> Ŭ������. xxx�� ���
//			- ��ü���� ����Ӽ�
//				=> ��ü�� ������ ���� static ����� �ϳ���!
//				=> �޸𸮸� ���� O

// static final �������
//		�����Ұ��� ! -> ���ȭ !(���� �������� �ʰڴ�)
//		static final �ڷ��� ������(�빮�ڷ�!! / ��ȭ��) = ����; 
/////////////////

// static �޼ҵ� 
// 		�޸𸮰� ���� �� -> ��ư ��!
//		��ü�� ��� ����� ���� o
//		  static�� �ƴ� ����������� ������ �Ұ�����!	
//			


public class Snack {

	String name ;
	double weight ; 
	int price ;
//	static String manufacturer = "����" ;
	static final String MANUFACTURER = "����";
	
	public void printInfo() {
		System.out.printf("�̸� : %s\n",this.name);
		System.out.printf("���� : %.1fg\n", weight);
		System.out.printf("���� : %d��\n",this.price);
//		System.out.printf("������ : %s\n",manufacturer);
		System.out.printf("������ : %s\n",MANUFACTURER);
	}		
	
	
	public static void printTaste() {
		System.out.println(MANUFACTURER);
//		System.out.println(name); // static�� �ƴ� ��������� ����
		System.out.println("ũ~~JMT!");
		System.out.println("--------");
		
	
	
	}
	
	
	
}
