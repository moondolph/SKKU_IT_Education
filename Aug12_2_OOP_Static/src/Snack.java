// 멤버변수 : 객체의 속성 -> (객체.속성)으로 표현
//					  this : 이 객체를 뜻함 (생략 가능 o)

// 이 세상의 모든 과자를 김비버가 만든다고 한다면?
//		이 때 사용하는게 *** static 멤버변수 !
//			- 객체가 없어도 쓸 수 있는 정보
//				=> 클래스명. xxx로 사용
//			- 객체들의 공통속성
//				=> 객체를 여러개 찍어내도 static 멤버는 하나만!
//				=> 메모리를 절약 O

// static final 멤버변수
//		수정불가능 ! -> 상수화 !(값을 변경하지 않겠다)
//		static final 자료형 변수명(대문자로!! / 문화임) = 내용; 
/////////////////

// static 메소드 
// 		메모리가 절약 됨 -> 암튼 됨!
//		객체가 없어도 사용이 가능 o
//		  static이 아닌 멤버변수에는 접근이 불가능함!	
//			


public class Snack {

	String name ;
	double weight ; 
	int price ;
//	static String manufacturer = "김비버" ;
	static final String MANUFACTURER = "김비버";
	
	public void printInfo() {
		System.out.printf("이름 : %s\n",this.name);
		System.out.printf("무게 : %.1fg\n", weight);
		System.out.printf("가격 : %d원\n",this.price);
//		System.out.printf("생산자 : %s\n",manufacturer);
		System.out.printf("생산자 : %s\n",MANUFACTURER);
	}		
	
	
	public static void printTaste() {
		System.out.println(MANUFACTURER);
//		System.out.println(name); // static이 아닌 멤버변수라서 에러
		System.out.println("크~~JMT!");
		System.out.println("--------");
		
	
	
	}
	
	
	
}
