// ������ (Java)
//	1. Ŭ������ �����ڰ� �ϳ��� ������
//  	�ڹ� �����Ϸ��� �����ڸ� ������� !
//	2. ����Ŭ���� ��ü�� �����(Pen)
//		����Ŭ���� �⺻������(Product)��
//		�ڵ� ȣ��

public class Pen extends Product2 {
	String color;

	public Pen() {
		// TODO Auto-generated constructor stub
	}

	public Pen(String color) {
		super();		// 2.�� ����س����� (��� ����)
		this.color = color;
	}

	public Pen(String name, int price, String color) {
		super(name, price);  //2. �ߵ�(x)
							// Product(�̸�, ����)
							//super(�Ķ����)�� ���� �����ڸ� �����ÿ��� 
							// �⺻�����ڰ� ������ �ʱ� ������ �⺻�����ڸ� ����� �� ���� !!!!
		this.color = color;
	}

}
