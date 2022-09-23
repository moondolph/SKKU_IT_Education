package com.beaver.sep233.calc;

import javax.servlet.http.HttpServletRequest;

public class Calculator {
	public static void calculate(HttpServletRequest request) {
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		
		int add = x + y;
		int substract = x- y;
		int multiply = x * y;
		double divide = x / (double) y;
		
		request.setAttribute("a", add);
		request.setAttribute("s", substract);
		request.setAttribute("m", multiply);
		request.setAttribute("d", divide);
		
		
	}
}
