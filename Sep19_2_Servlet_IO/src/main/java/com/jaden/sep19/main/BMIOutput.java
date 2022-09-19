package com.jaden.sep19.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")
public class BMIOutput extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		request.setCharacterEncoding("EUC-KR"); // post방식에서 이거 안하면 한글 깨져서 나옴 
		response.setCharacterEncoding("EUC-KR");
		String path = request.getServletContext().getRealPath("img");
		
		String a = request.getParameter("name");
		String h = request.getParameter("height");
		String w = request.getParameter("weight");
		
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>BMI</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h2>Output-POST</h2>");
		out.printf("<h2>%s이름</h2>", a);
		out.printf("<h2>%s키</h2>", h);
		out.printf("<h2>%s몸무게</h2>", w);
		out.printf("<h2>%s사진</h2>", p);
		out.print("</body>");
		out.print("</html>");
	
	
	
	
	
	
	
	
	}
}
