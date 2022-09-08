//객체간의 관계
// 	  A has a B : 사람 has a 핸드폰
// 	  A is a B : 개 is a 동물

// A has a B : 포함관계

public class HMain1 {
	public static void main(String[] args) {
		// 이름이 Kim Andrew, 남자, 핸드폰 번호가 010-1234-5678인 사람
		// 출력
		Person p = new Person("Kim Andrew", "남자", "010-1234-5678");
		p.printInfo();
		System.out.println("-------------");
		
		// 판교포차, 삼평동, 032-1222-3444, Kim Andrew의 식당
		// 출력(식당주인의 정보까지)
		
		Restaurant res = new Restaurant("판교포차","삼평동","032-1222-3444",p);
		res.printInfo();
		System.out.println("---------------");
		
		// 계란말이, 22000원, 판교포차에서 파는 메뉴
		// 이 메뉴에 대한 전체 정보를 출력
		
		Menu menu1 = new Menu("계란말이", 22000, res);
		menu1.printInfo();
		
		
		System.out.println("---------------");

		// 석쇠불고기, 25000원, 판교포차에서 파는 메뉴
		// 이 메뉴에 대한 전체 정보를 출력
		
		Menu menu2 = new Menu("석쇠불고기", 25000, res);
		menu2.printInfo();
		
		System.out.println("---------------");
		
		//석쇠, 5000원, 석쇠불고기를 담은 접시
		//관련된 전체 정보를 출력
		Dish d = new Dish("석쇠", 5000, menu2);
		d.printInfo();
		
		//가락시장, 송파구, 석쇠를 구매한 시장
		//관련된 전체 정보를 출력
		Market market = new Market("가락시장", "송파구", d);
		market.printInfo();
		System.out.println("---------------");
		
		
		
		//곽두팔, 가락시장을 좋아하는 상인
		//관련된 전체 정보를 출력 
		Merchant mer = new Merchant("곽두팔", market);
		mer.printInfo();
		System.out.println("----------------");
		
		
		
		// 곽두팔의 이름만 출력
		System.out.println(mer.name);	
		System.out.println("----------------");
		
		// 곽두팔이 좋아하는 시장 정보를 전체 출력
		mer.ma.printInfo();
		System.out.println("---------------");
		
		// 곽두팔이 좋아하는 시장은 어디에? 출력
		System.out.println(mer.ma.location);
		System.out.println("---------------");
		
		// 곽두팔이 좋아하는 시장에서 산 접시 전체 정보
		mer.ma.d.printInfo();
		System.out.println("---------------");
		
		// 곽두팔이 좋아하는 시장에서 산 접시 가격
		System.out.println(mer.ma.d.price);
		System.out.println("---------------");

		//곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴의 정보
		mer.ma.d.m.printInfo();
		System.out.println("---------------");
		
		//곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴 가격
		System.out.println(mer.ma.d.price);
		System.out.println("---------------");
		
		//곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 연락처
		System.out.println(mer.ma.d.m.where.callNum);
		System.out.println("---------------");
		
		//곽두팔이 좋아하는 시장에서 산 접시에 담긴 메뉴를 판 식당 주인 연락처
		System.out.println(mer.ma.d.m.where.owner.phoneNum);
		System.out.println("---------------");
		
		//계란말이를 파는 사람 연락처
		System.out.println(menu1.where.owner.phoneNum);
		System.out.println("---------------");
		
		
		
	}
}
