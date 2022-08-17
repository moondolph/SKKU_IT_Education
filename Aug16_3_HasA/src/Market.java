
public class Market {

String name;
String location;
Dish d;

public Market() {
	// TODO Auto-generated constructor stub
}

public Market(String name, String location, Dish d) {
	super();
	this.name = name;
	this.location = location;
	this.d = d;
}


public void printInfo() {
	System.out.println(name);
	System.out.println(location);
	d.printInfo();
	
	}
}
