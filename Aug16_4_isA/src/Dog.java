// A is a B : ��� ����
// ���� ���� '�̴�'
public class Dog extends Animal { // Animal�� ����� �޾ƿ�
	// Dog�� Animal �ȿ�  '���' �Ǿ��ִ�
	// ��� : inheritance 
	// Ȯ�� : extends
									//'���'�̶�� �ܾ ������ 'Ȯ��'�� ������ �� �� �´�
	String inhabit;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String sort, int age, String inhabit) {
		super(sort, age);
		this.inhabit = inhabit;
	}



	// @XXX : Annotation -> � ����� �ڵ����� �������ش�
	@Override		//��� �޾ƿ� method�� ����� �ٲٴ� ��
		public void printInfo() {
		  // override�� ����Ϸ���...
		  // 	��ӹ��� Class������ method��� ���ƾ� !!!
		  super.printInfo(); // ����Ŭ����.printInfo();
		  System.out.println(inhabit);
	}

	// VS
	// Overloading                 �������� Override vs Overloading
	// 		: �޼ҵ带 ���� �� ���� ����̶�� �޼ҵ���� ���� ! 
	//		: �Ķ������ �ڷ����� �ٸ��ų�, 
	//		: �Ķ������ ������ �޶�� �� ! 
	
	
	







}


