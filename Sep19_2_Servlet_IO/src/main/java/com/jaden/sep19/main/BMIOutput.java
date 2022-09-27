package com.jaden.sep19.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/BMIOutput")
public class BMIOutput extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		System.out.println("ddd");
		request.setCharacterEncoding("EUC-KR"); // post��Ŀ��� �̰� ���ϸ� �ѱ� ������ ���� 
	
		response.setCharacterEncoding("EUC-KR");
		// ������ ���ε� �� �������� ������ ������
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path); //���� ����� ��ġ
		
		//���� ���ε�
		MultipartRequest mr = new MultipartRequest(
				request, path,
		//����� ������ �ִ� ũ��(byte)
				10 * 1024 * 1024,
		//��û�Ķ���� ���ڵ� ���
		"EUC-KR",
		//����ڰ� ���ε��� ���ϸ� �ߺ��� �� ó�� 
		//�ߺ��ÿ� ���ϸ� �ڿ� ���ڸ� ���̰� �ϴ� ���
		new DefaultFileRenamePolicy());		
		
		
		String a = mr.getParameter("name");
		String h = mr.getParameter("height");
		String w = mr.getParameter("weight");
		String fileName = mr.getFilesystemName("picture");
		
		fileName = URLEncoder.encode(fileName,"EUC-KR");
		
		String fileName2 = URLDecoder.decode(fileName, "EUC-KR");
				
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>BMI</title><meta charset='EUC-KR'></head>");
		out.print("<body>");
		out.print("<h2>Output-POST</h2>");
		out.printf("<h2>�̸� : %s </h2>", a);
		out.printf("<h2>Ű : %s</h2>", h);
		out.printf("<h2>������: %s</h2>", w);
		out.printf("<h2>���� : %s</h2>", fileName2);
		out.printf("<img src='img/%s'>", fileName);
		out.print("</body>");
		out.print("</html>");
	
	
	
	
	
	
	
	
	}
}
