package com.beaver.sep212.main;

import javax.servlet.http.HttpServletRequest;

// Model : 일반 Java Class
//		실제 업무(계산, DB, ...)

//		Back-end 개발자 B
public class M {
	public static void add(HttpServletRequest request) { //요청객체
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		int z = x + y ;
		request.setAttribute("z", z);
	}
}
