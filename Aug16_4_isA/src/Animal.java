
public class Animal {
	//�Ӽ�(sort, age)
	String sort;
	int age;

	//�⺻ ������
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	//������ �����ε�
	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}
	
	//���� ��� method
	public void printInfo() {
		System.out.println(sort);
		System.out.println(age);
	}

	
	
}