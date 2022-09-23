package com.beaver.sep233.jstlc;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

public class JSTLCDataMaker {
	public static void make(HttpServletRequest req) {
		int[] ar = {123, 456, 78, 91, 234};
		req.setAttribute("ar", ar);
		
		ArrayList<beaver> al = new ArrayList<beaver>();
		al.add(new beaver("ºñ¹ö", 3, 50.5, 10.1));
		al.add(new beaver("º÷¾î", 2, 40.4, 9.9));
		al.add(new beaver("ºñºÛ", 5, 30.3, 6.6));
		al.add(new beaver("º÷¿ö", 1, 10.2, 3.3));
		req.setAttribute("al", al);
	}
	
	
	
	
	
	
	
}
