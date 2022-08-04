
//이중 for문 == for문안에 for문 == 중첩 for문

public class RMain2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 6; i++) {
//			System.out.printf("i값 : %d-------\n", i);
//			for (int j = 1; j < 6; j++) {
//				System.out.printf("j값 : %d\n", j);
//			}
//		}

		// 구구단

//		for (int i = 2; i<10; i++) {
//			System.out.printf("-----<%d단>-----\n",i);
//			for (int j=1; j<10; j++) {
//				System.out.printf("%d × %d = %d\n",i,j,i*j);
//			}
//		}

//		for (int i = 2; i < 10; i++) {
//			System.out.printf("<<<%d단>>>\t", i);
//		}
//		for (int j = 1; j < 10; j++) {
//			System.out.println();
//			for (int i = 2; i < 10; i++) {
//				System.out.printf("%d * %d = %d\t", i, j, i * j);
//				
//			}
//		}

//		for(int i = 2; i <=9; i++) {
//			System.out.printf("<<< %d단 >>>\t", i);
//		}
//		System.out.println();
//		
//		for (int i = 1; i<10; i++) {
//			for (int dan =2; dan < 10; dan++) {
//				System.out.printf("%d x %d = %d\t",dan, i, dan* i);
//			}
//			System.out.println();
//		}
//	
		// 별찍기

		// ㅋ
		// ㅋㅋ
		// ㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋㅋ
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("ㅋ");
			}
			System.out.println("");
		}

		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋ
		// ㅋㅋㅋㅋ
		System.out.println("----------");

		for (int i = 1; i < 5; i++) {
			System.out.println("ㅋㅋㅋㅋ");
		}

		System.out.println("----------");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("ㅋ");
			}
			System.out.println();
		}

//		      ㅋ         세번 띄우고 한번 ㅋ
//		     ㅋㅋ			두번 띄우고 두번 ㅋ
//		    ㅋㅋㅋ		한번 띄우고 세번 ㅋ
//		  ㅋㅋㅋㅋ			안 띄우고  네번 ㅋ
		// i,j 세우고 if 조건문으로 띄어쓰기랑 ㅋ찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("ㅋ");
				}

			}
			System.out.println();
		}
//   ㅋ
//  ㅋㅋㅋ
// ㅋㅋㅋㅋㅋ
//ㅋㅋㅋㅋㅋㅋㅋ
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("ㅋ"); 
			}
			System.out.println();
		} 
		
		
		
	}
}