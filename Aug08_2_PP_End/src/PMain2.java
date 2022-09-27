// PP : 절차지향프로그래밍 (Procedural Programming)

// 연산자
// Shift 연산자
// 3 << 1
//		앞의 숫자를 이진수로 바꿔서 : 11
//		왼쪽으로 뒤의 숫자만큼 밀고, 빈칸에는 0 채워넣기 : 110
//		이진수를(110)를 다시 십진수로 : 6

public class PMain2 {
	// 24시간 : 1 << 0 = 1
	// 주차장 : 1 << 1 = 2
	// Wifi : 1 << 2 = 4
	// 흡연실 : 1 << 3 = 8
	
	public static void main(String[] args) {
		int button1 = 12;
		if (button1 >= (1<<3)) {
			System.out.println("흡연실");
			button1 -= (1<<3);
		}
		if (button1 >= (1<<2)) {
			System.out.println("WIFI");
			button1 -= (1<<2);
		}															
		if (button1 >= (1<<1)) {
			System.out.println("주차장");
			button1 -= (1<<1);
		}
		if (button1 >= (1<<0)) {								//button1= 3이면 위에 if가 동작해서 else if 이 부분이 작동 안함
			System.out.println("24시간");
			button1 -= (1<<0);
		}
		System.out.println(button1);
		
		System.out.println("-------------------------");
		int button2 = 13;
		
		String[] option = {"24시간", "주차장", "WIFI", "흡연실"};
		for(int i = option.length - 1; i>=0; i--) {
			if (button2>=(1<<i)) {
				System.out.println(option[i]);
				button2 -= (1 << i);
			}
		}
		System.out.println(button2);
	}
}

