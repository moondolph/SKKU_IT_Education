package com.jaden.sep141.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output2")
public class Output2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setCharacterEncoding("EUC-KR");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String place = request.getParameter("place");
		String hobby = request.getParameter("hobby");
		String msg = request.getParameter("msg");

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Hi</title><meta charset='EUC-KR'></head>");
		out.print("<body>");

		out.print("<h2>Output-POST</h2>");
		out.printf("<h2>ID%s</h2><hr>", id);
		out.printf("<h2>PW%s</h2><hr>", pw);
		out.printf("<h2>성별%s</h2><hr>", gender);
		out.printf("<h2>지역%s</h2><hr>", place);
		out.printf("<h2>취미%s</h2><hr>", hobby);
		out.printf("<h2>자기소개%s</h2><hr>", msg);

		out.print("</body>");
		out.print("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

		request.setCharacterEncoding("EUC-KR"); // post방식에서 이거 안하면 한글 깨져서 나옴
		response.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String gender = request.getParameter("gender");
		String place = request.getParameter("place");
		String hobby = request.getParameter("hobby");
		String msg = request.getParameter("msg");

		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Hi</title><meta charset='EUC-KR'></head>");
		out.print("<body>");

		out.print("<h2>Output-POST</h2>");
		out.printf("<h2>ID%s</h2><hr>", id);
		out.printf("<h2>PW%s</h2><hr>", pw);
		out.printf("<h2>성별%s</h2><hr>", gender);
		out.printf("<h2>지역%s</h2><hr>", place);
		
		
		out.printf("<h2>취미%s</h2><hr>", hobby);
		
		
		
		out.printf("<h2>자기소개%s</h2><hr>", msg);
		out.print("</body>");
		out.print("</html>");

	}

}
