
public class Menu {

	
	String name;
	int price;
	Restaurant where;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(String name, int price, Restaurant where) {
		super();
		this.name = name;
		this.price = price;
		this.where = where;
	}

	
	
	
	public void printInfo() {
		System.out.printf("메뉴 : %s\n", name);
		System.out.printf("가격 : %d\n", price);
		where.printInfo();	
	}
	
	
	
}
