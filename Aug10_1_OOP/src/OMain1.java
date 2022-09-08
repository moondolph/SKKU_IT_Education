// 알고리즘의 시대 x -> 유지보수의 시대 O

// 절차지향 프로그래밍 (Procedural Programming)
//	 순서대로 잘 프로그래밍해서 결과를 잘 내자 !
//	 변수 하나 덜 쓰고, 효율적으로 코드 짰음 !
//   조건문, 반복문, ...
//   장점 : 처리속도, 실행속도가 빠르다.

// 객체지향 프로그래밍 (Object - Oriented programming)
//	  실생활을 표현. 묘사하자 ! (우리가 살고 있는 현실을 모델링)
//    소스 보기가 더 편함	
//	  유지보수에 용이
//	  장점 : 코드의 재사용성, 유지보수에 용이, 대규모 프로젝트에 적합
//	  
public class OMain1 {
	public static void main(String[] args) {

		// 강의장이 있는 건물 1층에는 카페가 하나 있는데
		// 그 카페의 정보를 표현...

		// 카페 이름이 할로나
		String name = "할로나";
		// 카페 위치가 건물 1층
		String location = "건물 1층";
		// 거리가 61.7m
		double distance = 61.7;
		// 출력
		System.out.println("<<<카페 정보>>>");
		System.out.println("name");
		System.out.println("location");
		System.out.println("distance");

		System.out.println("----------------");
		// OOP로 할로나를 표현
		// 객체(Object) : 실생활에 존재하는 모~~~~~~~~~든 것! ( = 인스턴스 (Instance))
		// 붕어빵을 만드려면 붕어빵 틀이 필요!
		// 객체를 만드려면 'Class'라는 것이 필요 !
		// 객체를 사용해서 하나의 완성품을 만들어내는 프로그래밍 기법이
		// => 객체지향 프로그래밍
		// => 앞으로는 Class를 엄청 만들 것 !
		

		Cafe c = new Cafe(); // 새로운 카페 하나 !
		c.name = "할로나";
		c.location = "건물 1층";
		c.distance = 61.7;
		System.out.println(c.name);
		System.out.println(c.location);
		System.out.println(c.distance);
	}
}