
public class Animal {
	//속성(sort, age)
	String sort;
	int age;

	//기본 생성자
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	//생성자 오버로딩
	public Animal(String sort, int age) {
		super();
		this.sort = sort;
		this.age = age;
	}
	
	//정보 출력 method
	public void printInfo() {
		System.out.println(sort);
		System.out.println(age);
	}

	
	
}