// Candy has a Company : 제조사 (v)
// Company has a Candy : 제품 


public class Candy {
	String name ;
	String taste;
	Company brand;
	
	
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
