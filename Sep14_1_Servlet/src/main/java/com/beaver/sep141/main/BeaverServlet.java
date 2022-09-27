package com.beaver.sep141.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BeaverServlet")
public class BeaverServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BeaverServlet() {
        super();
    }
    
    // GET��� ��û(�⺻) ������ 
	// �ּҸ� �˰� ������ ���� Ÿ�����ؼ� ���� O
    // 
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// ������ �پ��ִ� ����� ���� (PrintWriter)
//		PrintWriter out = response.getWriter();
//		out.print("<html>");
//		out.print("<head><title>Hello!</title><meta charset='EUC-KR'></head>");
//		out.print("<body>");
//		
//		for (int i = 0; i < 5; i++) {
//			out.print("<marquee>Hello!<marquee>");
//		}
//		out.print("</body>");
//		out.print("</html>");
	
		// ����������.. �ּ�â ��û�Ķ���� lang�� ������
		// korean�� �Է��ϸ� '��'
		// English�� �Է��ϸ� 'Yes'
		// �� �ܿ��� '����'
		//<h1>�±׷�
		
		// Ŭ���̾�Ʈ���� �������� � ������� ���ڵ��� �ߴ��� �˷����! (�׻�!)
		response.setCharacterEncoding("EUC-KR");
		
		// ?������=��&������=��&...
		String language = request.getParameter("lang");
		
		
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>����</title></head><body>");
		
		out.print("<h1>");
		
		if(language.equals("korean")) {
			out.print("��");
		}else if(language.equals("English")) {
			out.print("Yes");
		}else {
			out.print("����");
		}
		out.print("</h1>");
		out.print("</body>");
		out.print("</html>");
		
		
		
		
	
	}

    // POST��� ��û ������ 
    // ���α׷��� ���ؼ��� ���� (������ ��й�ȣ���� �ּҰ��� ����� ���� �͵�...)
		
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}



}