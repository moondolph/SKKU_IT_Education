
public class Coffee {

	String name ;
	int price ;
	
	// ctrl + space
	public Coffee() {


	}
	
	// ctrl + shift + space
	public Coffee(String name, int price) {
		super();  //위에 있는 기본 생성자를 불러옴
		this.name = name;
		this.price = price;
	}

	
	
	
	

	public void printInfo() {
		System.out.printf("커피이름: %s\n", name);
		System.out.printf("가격 : %d\n", price);
	}
	
}
