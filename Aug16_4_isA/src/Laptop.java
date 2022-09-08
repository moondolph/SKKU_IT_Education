
public class Laptop extends Computer {

	double weight ;
	double batteryTime ;
	
	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, int price, String cpu, int ram, int hdd, double weight, double batteryTime) {
		super(name, price, cpu, ram, hdd);
		this.weight = weight;
		this.batteryTime = batteryTime;
	}
	
	public void printInfo() {
		  super.printInfo(); 
		  System.out.println(weight);
		  System.out.println(batteryTime);
	}
	
	
	
	
}
