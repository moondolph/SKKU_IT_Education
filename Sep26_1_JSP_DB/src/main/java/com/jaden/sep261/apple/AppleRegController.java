package com.jaden.sep261.apple;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AppleRegController")
public class AppleRegController extends HttpServlet {
	// ����Ϸ� form�� �ִ� �������� ���� 
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			AppleDAO.getAppledao().getAllApples(request);
			request.setAttribute("cp", "reg.jsp");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		
		}
			
		// ����ϱ� 
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// DB�� ��� 
			AppleDAO.getAppledao().reg(request);
			
			//�Խ��ǿ� ���� ������ ������
			AppleDAO.getAppledao().getAllApples(request);
			
			//��� �Ŀ� ������ �������� �̵�
			request.setAttribute("cp", "apple.jsp");
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}

}
