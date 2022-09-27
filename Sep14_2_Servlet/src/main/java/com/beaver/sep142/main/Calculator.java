package com.beaver.sep142.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		 Ŭ���̾�Ʈ���� �������� � ������� ���ڵ��� �ߴ��� �˷����! (�׻�!)
				response.setCharacterEncoding("EUC-KR");
				
				int x = Integer.parseInt(request.getParameter("x"));   //���ͳݿ��� �������� ���� String���� �������Ƿ� ����ȯ�������
				int y = Integer.parseInt(request.getParameter("y"));   //���ͳݿ��� �������� ���� String���� �������Ƿ� ����ȯ�������
				
				
				PrintWriter out = response.getWriter();
				out.print("<html>");
				out.print("<head><title>��Ģ����</title><meta charset='EUC-KR'></head>");
				out.print("<body>");
				out.print("<h1>��Ģ����</h1>");
				out.print("<table border='1'>");
				out.printf("<tr><td>%d + %d = %d</td></tr>", x, y, x + y);
				out.printf("<tr><td>%d - %d = %d</td></tr>", x, y, x - y);
				out.printf("<tr><td>%d * %d = %d</td></tr>", x, y, x * y);
				out.printf("<tr><td>%d / %d = %.2f</td></tr>", x, y, x / (double) y);
				out.print("</table>");
				out.print("</body>");
				out.print("</html>");
	}
				
//				// ?������=��&������=��&...					?n1=10 & n2=5 & op <--�̷��� ġ�� �� 
//				String n1 = request.getParameter("n1");
//				String n2 = request.getParameter("n2");
//				String op = request.getParameter("op");                
//
//				response.setContentType("text/html;charset=EUC-KR");
//				PrintWriter out = response.getWriter();
//				
//				out.print("<html><head><title>����</title></head><body>");
//				
//				out.print("<h1>");
//				
//        switch ("op") {
//            case "+":
//                out.println("Answer = "+(Integer.parseInt(n1) + Integer.parseInt(n2)));
//                break;
//            case "-":
//                out.println("Answer = "+(Integer.parseInt(n1) - Integer.parseInt(n2)));
//                break;
//            case "*": 
//                out.println("Answer = "+(Integer.parseInt(n1) * Integer.parseInt(n2)));
//                break;
//            default:
//                out.println("Answer = "+(Integer.parseInt(n1) / Integer.parseInt(n2)));
//                break;
//        } 
//        out.print("</h1>");
//        out.print("</body>");
//        out.print("</html>");
 
    
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
