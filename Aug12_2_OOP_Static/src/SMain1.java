//정리
// 1. 기계어 상태의 소스가 stack 영역에 깔림 (차곡차곡)
// 2. static 멤버변수들이 static 영역에 배치
// 3. JVM이 SMain1.main(...); 를 호출
// 4. 실행




public class SMain1 {
	public static void main(String[] args) {
		//과자 객체
		//과자 이름, 중량, 가격
		//출력하는 기능

		// 지금 main에는 과자객체가 없는 상태
		// 과자 이름? -> 모름
		// 과자 무게? -> 모름
		// 과자 가격? -> 모름
		// 과자 생산자? -> 김비버
//		System.out.println(Snack.manufacturer);
		System.out.println("------------");
		
		
		Snack s1 = new Snack();
		s1.name = "허니버터칩";
		s1.weight = 150.3;
		s1.price = 3000;
		s1.printInfo();
		System.out.println("------------");
		
		Snack s2 = new Snack();
		s2.name = "프링글스";
		s2.weight = 200.1;
		s2.price = 3500;
		s2.printInfo();
		System.out.println("------------");
		
		// 생산자의 값을 바꿔봅시다.
//		s2.manufacturer = "최비버";
//		s2.printInfo();
//		System.out.println("------------");
		
//		s2.MANUFACTURER = "최비버"; //에러!!!
		
		Snack.printTaste();
		
		
	}
}
