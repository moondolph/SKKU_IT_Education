// 생성자 (Constructor)
// 		객체가 만들어질때 뭔가 작업을 해야하는데...
//		=> 생성자 만들기 !
// 		리턴이 아예 없고, 메소드명이 클래스명과 같은 메소드
//		생성자를 만들지 않으면
//			=> 자바 컴파일러가 기본 생성자를 만들어버림
//		생성자를 건드리면...
//			=> 자바 컴파일러가 기본 생성자를 안 만들어줌
// 			=> 시스템이 자동으로 객체를 만들 때가 있는데...
//				=> 기본 생성자를 씀 => 에러!
//

public class Shoes {

	String name;
	int size;
	int price;
	static String brand = "나이키"; // static final String brand = "나이키";
									// final 넣어도 됨

	// 기본 생성자(Ctrl + Space)
	public Shoes() {

	}

	// 생성자 오버로딩(Ctrl + Shift + Space)
	public Shoes(String name, int size, int price) {
		super(); // 위에 있는 기본생성자를 불러옴!
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public void printInfo() {
		System.out.printf("모델명 : %s\n", name);
		System.out.printf("사이즈 : %d\n", size);
		System.out.printf("가격 : %d\n", price);
		System.out.printf("브랜드 : %s\n", brand);
	}
	
	public void test(String name) {
		// 멤버변수명 / 파라미터명 같다면?
		//		this. 붙이게 되면 무조건 멤버변수
		//		안붙이면 가장 가까이에 있는 것				
		//			
		
		System.out.println(name);
		System.out.println(this.name);
		
		
	}






}
