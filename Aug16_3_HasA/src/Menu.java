
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
		System.out.printf("�޴� : %s\n", name);
		System.out.printf("���� : %d\n", price);
		where.printInfo();	
	}
	
	
	
}
