
public class Restaurant {

	String name ;
	String location;
	String callNum;
	Person owner;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String location, String callNum, Person owner) {
		super();
		this.name = name;
		this.location = location;
		this.callNum = callNum;
		this.owner = owner;
	}
	
	public void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("�ּ� : " + location);
		System.out.println("��ȭ : " + callNum);
//		System.out.println(owner.name);
//		System.out.println(owner.gender);
//		System.out.println(owner.phoneNum);
		owner.printInfo();
		
		
	}
	
}
