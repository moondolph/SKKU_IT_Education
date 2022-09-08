
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
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + location);
		System.out.println("전화 : " + callNum);
//		System.out.println(owner.name);
//		System.out.println(owner.gender);
//		System.out.println(owner.phoneNum);
		owner.printInfo();
		
		
	}
	
}
