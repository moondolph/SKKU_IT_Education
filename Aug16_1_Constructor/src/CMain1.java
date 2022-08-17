
public class CMain1 {

	public static void main(String[] args) {
		// 커피 
		// 커피 이름 / 가격 / 
		// 아메리카노 / 3000
		// 출력 
		
		Coffee c1 = new Coffee();
		c1.name = "아메리카노";
		c1.price = 3000;
		
		c1.printInfo();
		System.out.println("---------");
		
		Coffee c2 = new Coffee("아아", 3000);
		c2.printInfo();
		
		
		
	}

}
