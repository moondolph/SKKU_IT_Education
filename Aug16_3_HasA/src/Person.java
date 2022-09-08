
public class Person {

	String name;
	String gender;
	String phoneNum;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String gender, String phoneNum) {
		super();
		this.name = name;
		this.gender = gender;
		this.phoneNum = phoneNum;
	}
	
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("핸드폰 : " + phoneNum);
		
	}
	
	
}
