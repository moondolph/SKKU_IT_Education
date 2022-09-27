package com.beaver.sep222.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//숫자야구
//3자리 숫자, 중복 숫자 X 011(X)
//1. 입력하는 부분도 숫자 아닌거 입력 못하게(값이 안 넘어가게), 
//2. 중복 숫자 입력하면 다시 입력하게 하는 유효성검사 기능
//3. 무조건 3자리 숫자여야 하도록 

@WebServlet("/HomeController")
public class HomeController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Input.jsp").forward(request, response);
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

	
	
	
	
	
	
	
	
}
