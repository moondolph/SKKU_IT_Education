package com.beaver.sep222.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���ھ߱�
//3�ڸ� ����, �ߺ� ���� X 011(X)
//1. �Է��ϴ� �κе� ���� �ƴѰ� �Է� ���ϰ�(���� �� �Ѿ��), 
//2. �ߺ� ���� �Է��ϸ� �ٽ� �Է��ϰ� �ϴ� ��ȿ���˻� ���
//3. ������ 3�ڸ� ���ڿ��� �ϵ��� 

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Input.jsp").forward(request, response);
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	
	
	
	
	
	
	
	
}
