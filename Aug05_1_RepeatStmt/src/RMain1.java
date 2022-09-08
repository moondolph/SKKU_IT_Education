public class RMain1 {
	// 별찍기

	// ㅋ
	// ㅋㅋ
	// ㅋㅋㅋ
	// ㅋㅋㅋㅋ
	// ㅋㅋㅋㅋㅋ

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		// ㅋ
		// ㅋ
		// ㅋ
		// ㅋ
		// ㅋ

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					System.out.print("ㅋ");
				} else {
					System.out.print("  "); // 띄어쓰기 두 번하면 더 예쁨
				}
			}
			System.out.println();
		}

		// 2번째 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  "); // j가 i보다 작은 공간은 띄어쓰기로 메꿔줌
			}
			System.out.println("ㅋ"); // i=j가 된 순간 내부 for 깨지고 ㅋ 한번 찍고 다음 줄로 넘어감
		}

		// 3번째 방법
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "ㅋ" : "  ");
			}
			System.out.println();
		}
		// ㅋㅋㅋㅋㅋ
		// ㅎㅎㅎㅎ
		// ㅋㅋㅋ
		// ㅎㅎ
		// ㅋ

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				if (i % 2 == 0) {
//					System.out.print("ㅋ");
//				} else {
//					System.out.print("ㅎ");
//				}
//			}
//			System.out.println();
//		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 0) ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		// ㅋ
		// ㅎㅎㅎ
		// ㅋㅋㅋㅋㅋ
		// ㅎㅎㅎㅎㅎㅎㅎ
		// ㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2 * i + 1; j++) { // j<=2i도 가능
				System.out.print((i % 2 == 0) ? "ㅋ" : "ㅎ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		//    *
		//   ***
		//  *****
		// *******
		//*********
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print(" ");
			
			for(int j=0;j<=(i*2); j++)	{
				System.out.print("*");
			}
			}}System.out.print(" ");
				
		}

	for(

	int i = 0;i<5;i++)
	{
		for (int j = 0; j <= 4 + i; j++) {
			if (j >= 4 - i) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}}