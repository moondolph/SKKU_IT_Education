package com.beaver.sep212.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Controller : Servlet
// 		��Ȳ�Ǵ��ؼ�  M/V ��ȯ
// 			-> � ��û�� ������ ��, �Ǵ��ؼ� M/V�� ��ȯ
//		�� ����Ʈ�� ������( ������ ���⼭ !!!)
//
//		Back-end �� ������ A - PL��(Project Leader)
	

@WebServlet("/C")
public class C extends HttpServlet {
	//� ����Ʈ�� �����ϴ� ���
	// 1. �ּҸ� ���� �Է�
	// 2. �˻� -> <a> ������
	//		�� �� GET��� ��û(� ����Ʈ�� POST�� ù ���� - X)
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	RequestDispatcher rd = request.getRequestDispatcher("V1.html");
//	rd.forward(request, response);
	request.getRequestDispatcher("V1.html").forward(request,response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		M.add(request); // ����� ���� �ϰ� ����� ���� !
		request.getRequestDispatcher("V2.jsp").forward(request, response);
	}
}
