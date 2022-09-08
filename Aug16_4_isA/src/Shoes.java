
public class Shoes extends Product {

	int size;

	public Shoes() {
		// TODO Auto-generated constructor stub
	}


	
	public Shoes(String name, int price, int size) {
		super(name, price);
		this.size = size;
	}

	

	public void printInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(size);
	}

}
