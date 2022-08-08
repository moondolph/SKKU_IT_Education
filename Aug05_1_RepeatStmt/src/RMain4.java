// for (변수초기화; 조건식; 값의증감) {
//		내용
//}
public class RMain4 {
	public static void main(String[] args) {
		// 1 ~ 100 까지의 정수 중에서 6의 배수만 더한 값을 출력
		int s = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				s = s + i;
				System.out.printf("현재 숫자 : %d\n", i);
				System.out.printf("현재 합 : %d\n", s);
				System.out.printf("------------");
			}

		} System.out.println(s);

		// 4x + 5y = 60이 되는 해(정수)를 모두 구해서
		// (x, y)의 형태로 출력
		// x, y는 둘 다 10 이하의 정수 (1 ~ 10)
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if (4*x+5*y==60) {
					System.out.printf("(%d, %d)\n", x,y);
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
