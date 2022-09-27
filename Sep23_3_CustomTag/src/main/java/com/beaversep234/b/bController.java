package com.beaversep234.b;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beaver.sep233.calc.Calculator;
import com.beaver.sep233.jstlc.JSTLCDataMaker;

@WebServlet("/bController")
public class bController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!request.getParameterNames().hasMoreElements()) {
			request.setAttribute("contentPage", "b.jsp");
		} else {
			JSTLCDataMaker.make(request);
			request.setAttribute("contentPage", "output2.jsp");
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
