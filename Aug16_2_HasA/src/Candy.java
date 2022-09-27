// Candy has a Company : 제조사 (v)
// Company has a Candy : 제품 


public class Candy {
	String name ;
	String taste;
	Company brand;					//Candy 클래스의 멤버변수로 Company 클래스를 주고 Company 클래스의 기능들을 사용할 수 있음
	
	
	public Candy() {
		// TODO Auto-generated constructor stub
	}

	public Candy(String name, String flavor) {
		super();
		this.name = name;
		this.taste = flavor;
	}
	
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("맛 : " + taste);
		
	}
	
	
	
	
}
