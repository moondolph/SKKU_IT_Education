public class RMain1 {
	// 紺啄奄

	// せ
	// せせ
	// せせせ
	// せせせせ
	// せせせせせ

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		// せ
		// せ
		// せ
		// せ
		// せ

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (i == j) {
					System.out.print("せ");
				} else {
					System.out.print("  "); // 句嬢床奄 砧 腰馬檎 希 森旨
				}
			}
			System.out.println();
		}

		// 2腰属 号狛
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("  "); // j亜 i左陥 拙精 因娃精 句嬢床奄稽 五蚊捜
			}
			System.out.println("せ"); // i=j亜 吉 授娃 鎧採 for 凹走壱 せ 廃腰 啄壱 陥製 匝稽 角嬢姶
		}

		// 3腰属 号狛
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "せ" : "  ");
			}
			System.out.println();
		}
		// せせせせせ
		// ぞぞぞぞ
		// せせせ
		// ぞぞ
		// せ

//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				if (i % 2 == 0) {
//					System.out.print("せ");
//				} else {
//					System.out.print("ぞ");
//				}
//			}
//			System.out.println();
//		}
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 0) ? "せ" : "ぞ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		// せ
		// ぞぞぞ
		// せせせせせ
		// ぞぞぞぞぞぞぞ
		// せせせせせせせせせ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2 * i + 1; j++) { // j<=2i亀 亜管
				System.out.print((i % 2 == 0) ? "せ" : "ぞ");
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