
public class Computer {

	String cpu;
	int ram;
	int hdd;
	Company brand;
	
	
	public Computer() {
		// TODO Auto-generated constructor stub
	}


	public Computer(String cpu, int ram, int hdd, Company brand) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
//		System.out.println(brand.name);
//		System.out.println(brand.location);
//		System.out.println(brand.employee);
		brand.printInfo();
	}
	
	
}
