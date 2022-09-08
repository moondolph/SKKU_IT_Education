
public class VMain3 {
	public static void main(String[] args) {
		// 점심식사 메뉴 (이름), 가격, 칼로리, 평점, 나중에 또 먹을건지
		
		String lunch = "마파두부덮밥";
		int price = 4900;
		int cal = 800;
		double mark = 4.5;
		String eat_again = "No";
		
		
		System.out.printf("점심식사메뉴: %s\n",lunch);
		System.out.printf("가격:%d원\n",price);
		System.out.printf("칼로리:%dcal\n",cal);
		System.out.printf("평점:%.1f/5.0\n",mark);
		System.out.printf("나중에 또 먹을거?:%s",eat_again);
		
		
	}

}
//익숙해지자
//f함수에서는 
//	%d
//	%f
//	%s

//변수선언에서는
//	int
//	double
//	String
