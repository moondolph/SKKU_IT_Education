package com.beaver.aug191.main;

import java.util.Scanner;

// 覗稽益轡 叔楳 => 嬬車但拭 察娃越松稽 ~~~~ 蟹神澗 杏 => 拭君 / 獄益 / 神嫌 硝顕 / 井壱庚

// error 
// 		廃厩嬢 - 腰蝕 -> 慎嬢
// 		紫引			 apple 	
//		郊蟹蟹		 banana
//		駒艇           ???
// 	Java税 庚狛拭 照限惟 潤辞 陳督析戚 災亜管廃 雌殿 
// 	鯵降切 設公 ! 
// 	刃失沙精 蟹神走 省製

// 	warning
//		走煽歳廃 坪球
//		鯵降切 設公 !
//		陳督析精 亜管馬艦 => 刃失沙精 蟹身(叔楳馬澗汽 庚薦 蒸製 O)
//		戚適験什亜 接社軒研 敗..!
//		ex) Scanner 梓端 幻級壱 蟹辞 => 戚 奄管聖 照 丸製

// 	exception
//		覗稽益轡精 100% 刃失!		
//		叔楳拝 凶 杭亜 須採旋昔 推昔拭 税背辞 拙疑戚 薦企稽 照鞠澗 雌伐 ...
//		鯵降切 設公精 焼還 
//		鯵降切 脊舌 -> 鯵降切亜 雌伐聖 森著背辞 企奪精 室趨兜切 ...!
//

public class EMain1 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("x : ");
		int x = k.nextInt();

		System.out.print("y : ");
		int y = k.nextInt();

		System.out.printf("x + y : %d\n", x + y);
		System.out.printf("x - y : %d\n", x - y);
		System.out.printf("x * y : %d\n", x * y);
//		System.out.printf("x / y : %d\n", x / y);

		// 幻鉦拭 y 葵拭 0聖 隔生檎 ...? => Exception 降持 !
		
		// Exception 坦軒研 拝 呪 赤澗 号狛 !
//		try {
//			析舘 戚 採歳聖 叔楳 - (鎧遂)
//		} catch (森須政莫 痕呪誤) {
//			try楕聖 叔楳馬陥亜 背雁 政莫税 森須亜 降持馬檎 戚 採歳聖 叔楳 
//			幻鉦, 森須 蒸戚 舛雌旋生稽 叔楳菊聖 井酔, catch採歳精 益撹 走蟹帖壱
//			益 陥製 社什研 叔楳
//		} catch (Exception e) {
//			...
//		} finally {
//			舛雌旋生稽 覗稽益轡戚 叔楳菊揮走,
//			森須亜 斗然揮走 雌淫蒸戚 叔楳.
//			return左陥 胡煽 叔楳

		
		// 砧亜走 庚薦亜 疑獣拭 斗遭 井酔? => 胡煽 蟹紳 catch税 鎧遂幻 窒径
		// JAVA税 脊舌拭辞 湛腰属 森須亜 斗然聖 凶
		// 聡獣 叔楳 掻走 板 背雁 森須坦軒採歳生稽 角嬢亜奄 凶庚!
		
		// x : 10, y : 0 => 70 - 71 (Arith) - 75 - 76
		// x : 10, y : 1 => 70 - 71 - 72 - 73 - 76 - 77 
		// x : 2, y : 1 => 70 - 71 - 72 - 73 
		
		 try {
			 System.out.printf("x / y : %d\n", x / y);
			int[] ar = {1, 2, 3};
			 System.out.println(ar[x]);	
		} catch (Exception e) { // 乞~~~窮 exception聖 陥 説焼捜
			System.out.println("管走 怯喰 せ");
			e.printStackTrace();	//雌伐 窒径 (鯵降切遂)
		} finally {
			System.out.println("埴せせせせせせせせせせせ");
		}
		
		 
	}
}

