// Candy has a Company : ������ (v)
// Company has a Candy : ��ǰ 


public class Candy {
	String name ;
	String taste;
	Company brand;					//Candy Ŭ������ ��������� Company Ŭ������ �ְ� Company Ŭ������ ��ɵ��� ����� �� ����
	
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, String flavor) {
		super();
		this.name = name;
		this.taste = flavor;
	}
	
	
	public void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + taste);
		
	}
	
	
	
	
}
