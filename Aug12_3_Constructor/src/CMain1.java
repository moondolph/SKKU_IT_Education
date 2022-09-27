
public class CMain1 {
	public static void main(String[] args) {
		//신발
		//나이키 홈페이지
		//이름 : ???
		//사이즈 : 260
		//가격 : 110000
		//브랜드 : 나이키
		//정보 출력
		//----------------
		//이름 : ???
		//사이즈 : 260
		//가격 : 110000
		//브랜드 : 나이키
		//정보 출력
		//----------------
	
		Shoes s1 = new Shoes();
		s1.name = "에어맥스 플라이니트 레이서";
		s1.size = 265;
		s1.price = 189000;
		s1.printInfo();
		
		System.out.println("-----------");
		
		Shoes s2 = new Shoes();
		s2.name = "아수나";
		s2.size = 265;
		s2.price = 59000;
		s2.printInfo();
		
		System.out.println("-----------");
		
		s2.test(s2.name);
		System.out.println("-----------");
		s2.test("zzzz");
		System.out.println("-----------");

		//생성자 오버로딩
		Shoes s3 = new Shoes("신발", 250, 3000);
		s3.printInfo();

		
		
	}
}
