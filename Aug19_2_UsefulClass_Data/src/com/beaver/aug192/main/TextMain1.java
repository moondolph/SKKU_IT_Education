package com.beaver.aug192.main;

import java.util.StringTokenizer;

public class TextMain1 {
	// 獄穿 
	// 	  1.8.12
	//	  蒋切軒 : major獄穿(1)
	//	  急切軒 : minor獄穿(8.12)
	//	  	希 急切軒稽 哀呪系 希 minor
	//	  獄穿穣 (1.8.12 -> 1.8.13) : 詞側 呪舛
	//	  獄穿穣 (1.8.12 -> 1.9.0) : 痕鉢拭 嬢汗舛亀 汗界戚 身
	//	  獄穿穣 (1.8.12 -> 2.0.0) : 歯稽錘 覗稽益轡
	
	// 革闘趨滴研 搭背辞 汽戚斗研 閤焼神檎 : 越切莫殿
	// 革闘趨滴研 搭背辞 汽戚斗研 匝 凶 : 越切莫殿
	// 廃越坦軒亜 猿陥稽趨霜 呪 赤製 !
	public static void main(String[] args) {
		String s1 = "生焼焼焼焼焼焼焼焼"; // 舛縦? NO! / 鉦縦 Yes!
		String s2 = new String("稲 赤生檎 蓄汐! 格巷 重蟹推 !");
		
		//須酔走 源壱 達焼左奄 !!! (切疑刃失拭 赤澗 奄管 石嬢左檎辞 !)
		
		//s2拭辞 2腰属拭 赤澗 越切 窒径
		System.out.println(s2.charAt(2));
		
		//s2拭辞 恥 護越切昔走 窒径
		System.out.println(s2.length());
		
		//s2拭辞 '稲'戚虞澗 舘嬢稽 獣拙馬澗走  
		System.out.println(s2.startsWith("稲"));
		
		//s2拭 '格巷'虞澗 舘嬢亜 赤澗走
		//contains() 
		System.out.println(s2.contentEquals("格巷"));
		//s2拭辞 '蓄汐'聖 '竺劾'稽 郊蚊辞 窒径
		System.out.println(s2.replace("蓄汐", "竺劾"));
		//s2拭辞 2 ~ 5腰属 越切幻 窒径                   
		System.out.println(s2.substring(2, 6));   //(獣拙是帖, 魁是帖 -1)
		System.out.println("====================");
		
		//String 梓端研 持失馬澗汽 莫縦聖 説焼辞
		String s3 = String.format("巷惟 : %.2fkg", 123.456789);
		System.out.println(s3);
		System.out.println("======================");

		// s2拭 越切研 蓄亜
		s2 = s2 + "鎧鰍拭澗 乞砧 陥 設 菊生檎 疏畏嬢推!";
		System.out.println(s2);
		s2 += "乞砧 採切鞠室推 ~ ^-^";
		System.out.println(s2);
		
		s2 = new String(s2 + " ぞぞぞぞぞ");
		System.out.println(s2);
		
		// String 企勲生稽 蓄亜
		StringBuffer sb = new StringBuffer(s2);
		sb.append("析精 旋惟 馬鞠 儀精 弦戚 忽惟 背爽室推!");
		sb.append("せせせせせせ");
		sb.append("悦汽 爽源拭亀 郊孜革推?");
		System.out.println(sb);
		
		String s4 = sb.toString();
		System.out.println(s4);
		System.out.println("======================");
		
		//String 歳軒
		String s5 = "沿搾獄,酵搾獄,置搾獄,煽什鴇搾獄";
		
		//1. Split 
		String[] s5Ar = s5.split(","); //茨虞辞 紫遂 拝 呪 赤製
		System.out.println(s5Ar[0]);
		System.out.println(s5Ar[3]);
		System.out.println("======================");
		
		//2. StringTokenizer
		StringTokenizer st = new StringTokenizer(s5, ","); //授辞企稽 蟹身
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens()) { // 鋼差庚莫縦(while庚) + 授辞企稽 蟹身
			System.out.println(st.nextToken());
		}
		
		// 紗亀旋昔 檎 : StringTokenizer
		// data紗拭辞 痕呪亜 弦陥檎 : split
		
	}
}
