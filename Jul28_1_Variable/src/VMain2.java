
public class VMain2 {
	public static void main(String[] args) {
		// 섬유향수
		// 1000원
		// 80ml
		// 체리블라썸
		// 항균 99.9%
		// 무색
		// 다이소
		// 재활용 해야함(true/false)
		
//		String kind = "섬유향수";
//		int price = 1000;
//		int volume = 80;
//		String name = "체리블라썸";
//		double effect = 99.9;
//		String color = "무색";
//		String seller = "다이소";		
//		boolean recycle = true;		
//				
//		System.out.println(kind);
//		System.out.printf("%d원\n",price);
//		System.out.printf("%dml\n",volume);
//		System.out.printf("%s\n",name);
//		System.out.printf("항균 %.1f%%\n",effect);
//		System.out.printf("%s\n",color);
//		System.out.printf("%s\n",seller);
//		System.out.printf("재활용 해야함 : %b\n",recycle);
//		
		
		//선생님 답안
		
		//섬유향수
		String name = "섬유향수";
//		// 1000원
		int price = 1000;
//		// 80ml
		int volume = 80;
//		//체리블라썸
		String smell = "체리블라썸";
//		// 99.9%
		double antibacterial = 99.9;
//		//무색
		char color = '무';
//		//다이소
		String company = "다이소";
//		// 재활용 해야함(true/false) (%b)
		boolean recycle = true;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("가격 : %d원\n", price);
		System.out.printf("용량 : %dml\n", volume);
		System.out.printf("향 : %s\n", smell);
		System.out.printf("향균 : %.1f%%\n", antibacterial );
		System.out.printf("색 : %c\n", color );
		System.out.printf("회사 : %s\n", company );
		System.out.printf("재활용 유무 : %b\n", recycle );
		
		//////////////////////////////////////////////////
		
		//이름, 오늘 날짜(연도.월.일), 사는 곳, 시력, java경험 유무
		
		System.out.println();
		String myName = "심주용";
		String today = "목요일";
		int year = 2022;
		int month = 7;
		int day = 28; 		
		String address = "분당";
		double eyesight = 1.0 ;
		boolean experience = true;
		
		System.out.printf("이름 : %s\n", myName);
		System.out.printf("오늘날짜 : %d.%02d.%d\n", year,month,day);
		System.out.printf("사는 곳 : %s\n", address);
		System.out.printf("시력 : %.1f\n", eyesight);
		System.out.printf("Java 경험 유무 : %b\n", experience);
		
		
		
		
		
		
	}
}
