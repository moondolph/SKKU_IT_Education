
public class Merchant {

	String name;
	Market ma;
	
	public Merchant() {
		// TODO Auto-generated constructor stub
	}

	public Merchant(String name, Market ma) {
		super();
		this.name = name;
		this.ma = ma;
	}
	
	public void printInfo() {
		System.out.println(name);
		ma.printInfo();
	}
	
	
	
	
	
}
