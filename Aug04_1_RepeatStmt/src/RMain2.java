
//戚掻 for庚 == for庚照拭 for庚 == 掻淡 for庚

public class RMain2 {
	public static void main(String[] args) {
//		for (int i = 1; i < 6; i++) {
//			System.out.printf("i葵 : %d-------\n", i);
//			for (int j = 1; j < 6; j++) {
//				System.out.printf("j葵 : %d\n", j);
//			}
//		}

		// 姥姥舘

//		for (int i = 2; i<10; i++) {
//			System.out.printf("-----<%d舘>-----\n",i);
//			for (int j=1; j<10; j++) {
//				System.out.printf("%d ／ %d = %d\n",i,j,i*j);
//			}
//		}

//		for (int i = 2; i < 10; i++) {
//			System.out.printf("<<<%d舘>>>\t", i);
//		}
//		for (int j = 1; j < 10; j++) {
//			System.out.println();
//			for (int i = 2; i < 10; i++) {
//				System.out.printf("%d * %d = %d\t", i, j, i * j);
//				
//			}
//		}

//		for(int i = 2; i <=9; i++) {
//			System.out.printf("<<< %d舘 >>>\t", i);
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
		// 紺啄奄

		// せ
		// せせ
		// せせせ
		// せせせせ
		// せせせせせ
		for (int i = 1; i < 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("せ");
			}
			System.out.println("");
		}

		// せせせせ
		// せせせせ
		// せせせせ
		// せせせせ
		System.out.println("----------");

		for (int i = 1; i < 5; i++) {
			System.out.println("せせせせ");
		}

		System.out.println("----------");

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}

//		      せ         室腰 句酔壱 廃腰 せ
//		     せせ			砧腰 句酔壱 砧腰 せ
//		    せせせ		廃腰 句酔壱 室腰 せ
//		  せせせせ			照 句酔壱  革腰 せ
		// i,j 室酔壱 if 繕闇庚生稽 句嬢床奄櫛 せ啄奄
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("せ");
				}

			}
			System.out.println();
		}
//   せ
//  せせせ
// せせせせせ
//せせせせせせせ
		for(int i=0;i<4;i++){
			for(int j=0;j<3-i;j++){
				System.out.print(" "); 
			}
			for(int j=0;j<2*i+1;j++){
				System.out.print("せ"); 
			}
			System.out.println();
		} 
		
		
		
	}
}