// Coder : 개발자
// Programmer : Coder + 설계 ***

// OOD (Object Oriented Design) - 객체 지향 디자인
// 		실생활을 디자인 
//		

public class OMain1 {
	public static void main(String[] args) {
	   // 의사 (이름, 나이)
		Doctor d = new Doctor();
		d.name = "Mike";
		d.age = 46 ;
		
		d.printDoctor();
		
		
		System.out.println("----------------------------");
	   // 손님 (이름, 나이)
		Guest g = new Guest();
		g.name = "Joy";
		g.age = 31;
		g.showPatient();

		
		
		//BMI검사
		d.start(g);
		
	}
}
