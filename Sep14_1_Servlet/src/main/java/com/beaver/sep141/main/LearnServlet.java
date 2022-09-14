package com.beaver.sep141.main;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// main�� ���� ?!?!
//	main�� tomcat�� ���ο� ����

// Servlet (Server + Application)

// @XXX : Annotation
// ������ ���� �� �����ؾ� �ߴµ�... -> �ڵ� ó���� ����! Ҭ
@WebServlet("/LearnServlet") //	LearnServlet�� Tomcat�� ��� (*** ����� ������ �ȵ� !)
public class LearnServlet extends HttpServlet {
	// HttpServlet Ŭ������ �ִ� ���(��û������ �����ϱ�)�� ��� ����
	// ������ �� �߰� O
	
	//�۾��ϸ鼭 ���� ǥ���϶��..(������ ������)
	private static final long serialVersionUID = 1L;
    
	// ������ - �� LearnServlet ��ü�� ����°� tomcat
	// ���� �� �� ����(������ ������)
    public LearnServlet() {
        super();
    }

    // event-driven-programming (�̺�Ʈ ��� ���α׷���)
    // Tomcat�� ������ -> LearnServlet�� ����
    // 		-> tomcat�� LearnServlet�̶�� ��ü�� ���� ���ѷ���
    // 		-> � �̺�Ʈ�� �߻��ϸ� �װ��� ó���ϰ� ������ ����
    
        
    // ** �ٽɺκ� !!!
    // �������ٰ� Ŭ���̾�Ʈ�� �� Servlet���� GET��� ��û�ϸ� 
	// Tomcat�� doGet�޼ҵ带 �ڵ����� ȣ��
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

    // �������ٰ� Ŭ���̾�Ʈ�� �� Servlet���� POST��� ��û�ϸ� 
    // Tomcat�� doPost�޼ҵ带 �ڵ����� ȣ��
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
