package com.beaver.sep222.main;

import java.util.Random;

public class test {

	public static String pickAns() {
		int a = new Random().nextInt(976) + 12;	// 12 ~ 987
		String ans = String.format("%03d", a);	// "012" ~ "987"
	
	if(ans.charAt(0) == ans.charAt(1)
		|| ans.charAt(0) == ans.charAt(2)
		|| ans.charAt(1) == ans.charAt(2)) {
			return pickAns();
	}
		return ans;
	}
	public static void main(String[] args) {
		String ans = pickAns();
		System.out.println(ans);
	}








}

