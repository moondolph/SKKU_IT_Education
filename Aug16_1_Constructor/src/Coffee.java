
public class Coffee {

	String name ;
	int price ;
	
	// ctrl + space
	public Coffee() {


	}
	
	// ctrl + shift + space
	public Coffee(String name, int price) {
		super();  //���� �ִ� �⺻ �����ڸ� �ҷ���
		this.name = name;
		this.price = price;
	}							//������� �ʱ�ȭ�� ó������ �ٷ� �� �� �ִ� ��ü�� ����ڴ� --> �̰� �� ������ ��

	
	
	
	

	public void printInfo() {
		System.out.printf("Ŀ���̸�: %s\n", name);
		System.out.printf("���� : %d\n", price);
	}
	
}
