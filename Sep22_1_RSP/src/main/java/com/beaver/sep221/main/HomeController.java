package com.beaver.sep221.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Java + JSP + CSS + Servlet  
// ���������� ���� �������� ���� ��!
// �������� �˾Ƽ�...
// WAS ������ ������ ������ ���̰� => ���� ������ ������ ���� ���̵���(�ٲ��)
//
//
//

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("rspInput.html").forward(request, response);
	
	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//Computer ��� ��� ����
		Computer.calculate(request);
	
	
	
	
	
	}
}
