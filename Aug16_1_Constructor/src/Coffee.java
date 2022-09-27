
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
	}							//멤버변수 초기화를 처음부터 바로 할 수 있는 객체를 만들겠다 --> 이게 더 빠르고 편리

	
	
	
	

	public void printInfo() {
		System.out.printf("커피이름: %s\n", name);
		System.out.printf("가격 : %d\n", price);
	}
	
}
