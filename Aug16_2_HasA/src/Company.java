
public class Company {

	String name;
	String location;
	int employee;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String name, String location, int worker) {
		super();
		this.name = name;
		this.location = location;
		this.employee = worker;
	}
	
	public void printInfo() {
		
		System.out.printf("�̸� : %s\n", name);
		System.out.printf("��ġ : %s\n", location);
		System.out.printf("������ : %d��\n", employee);
	}
	
	
	
	
}
