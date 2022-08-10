// Java : Perfect 객체지향언어 (구조가)
// C++, Python : Hybrid 객체지향언어 ( 구조가)

// 실생활을 묘사하자 -> 보기가 쉬워질 것 -> 유지보수에 용이해짐 ! 


//main()있는 클래스 : XXXMain
public class OMain2 {
	public static void main(String[] args) {
		//버스를 Java로 표현해보자 -> 표현하고 싶을때는 항상! 클래스를! 새로! 만들자!
		// 버스번호 / 차종 /  버스회사 / 기사님이름 / 시작점 => 출력
		// int, double, String, ... XXX : ?!, 설명하기 어렵다...
		// 주석을 달 필요가 없다는게 장점 ! -> 뭘 표현하고자 하는지 알 수 있기 때문에 !
		// b1 : 객체, instance 라고 부름
		// 
		
		
		Bus b1 = new Bus();   //버스 한대가 완성 !
		b1.no = 1234;
		b1.brand = "배틀크루즈";
		b1.company = "benz";
		b1.driver = "Hamilton";
		b1.startPoint = "Seoul";
		
//		System.out.println(b1.no);
//		System.out.println(b1.brand);
//		System.out.println(b1.company);
//		System.out.println(b1.driver);
//		System.out.println(b1.startPoint);
		b1.printInfo();
		b1.go();
		
		
		
		System.out.println("------------------");
		//핸드폰
		//	모델명
		//	제조사
		//  가격
		//  정보를 출력
		//  전화왔을 때 - 띠리링 ~ 출력 
		Phone p = new Phone();
		System.out.println(p);  // 기본형이 아닌 것들은 다 참조형 !!
		p.printInfo();
		
		System.out.println("--------");
		
		p.model = "Galaxy s10";
		p.company = "Samsung";
		p.price = 10000 ;
		p.printInfo();
		p.ringBell();
		System.out.println("--------");
		
		// p와 똑같은 속성 값을 가진 p2 생성 - 불가능 !!!
		// 무조건 new로 생성해야 !!!!!
		
		Phone p2 = p; //p의 별명이 하나 더 추가된 상황!
		System.out.println(p2); // 번지값이 같다. //  핸드폰 하나를 2명이 공유하고 있는 상황! 
		p2.price = 150000;
		p2.printInfo();
		System.out.println("--------");
		p.printInfo(); // 위에서 p2 가격을 150000으로 변경 -> p2 = p이라 공유.
		System.out.println("--------");

	
	}
}
