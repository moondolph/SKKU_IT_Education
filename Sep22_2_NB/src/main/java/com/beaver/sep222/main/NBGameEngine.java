package com.beaver.sep222.main;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;

public class NBGameEngine {
	private int t;
	private String ans;
	
	private static final NBGameEngine NGE = new NBGameEngine();
	
	private NBGameEngine() {
	
	}
	
	public static NBGameEngine getNge() {
		return NGE;
	}
	
	public void pickAns() {
		int a = new Random().nextInt(976) + 12 ;
		String ans = String.format("%03d", a);	
		if (ans.charAt(0) == ans.charAt(1) 
			|| ans.charAt(0) == ans.charAt(1)
			|| ans.charAt(1) == ans.charAt(2)){
				pickAns();
				return;
			}
			this.ans = ans;
	}
	
	public void doNB(HttpServletRequest request) {
		System.out.println(ans);
		String userAns = request.getParameter("userAns");
		request.setAttribute("ua", "������ �� : " + userAns);
		int strike = 0;
		int ball = 0;
		
		for(int i=0; i<3 ; i++) {
			for(int j=0; j<3 ; j++) {
				if(userAns.charAt(i) == ans.charAt(j)) {
					if(i==j) {
						strike++;
					} else {
						ball++;
					}
					break;
				}
			}
		
		t++;
		request.setAttribute("t", t + "��° �õ� !");
		request.setAttribute("s", "s : " + strike );
		request.setAttribute("b", "b : " + ball);
			
		if (strike == 3) {
			String result = "���� ! " + ans + " �̾����ϴ� !";
			request.setAttribute("r", result);
			request.setAttribute("ua", null);
			request.setAttribute("s", null);
			request.setAttribute("b", null);
			
			
			
		}
		
		}	
	}
}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

