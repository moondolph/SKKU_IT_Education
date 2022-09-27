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
		request.setCharacterEncoding("EUC-KR"); // post방식에서 이거 안하면 한글 깨져서 나옴 
	
		response.setCharacterEncoding("EUC-KR");
		// 파일이 업로드 될 서버상의 폴더의 절대경로
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path); //절대 경로의 위치
		
		//파일 업로드
		MultipartRequest mr = new MultipartRequest(
				request, path,
		//허용할 파일의 최대 크기(byte)
				10 * 1024 * 1024,
		//요청파라미터 인코딩 방식
		"EUC-KR",
		//사용자가 업로드한 파일명 중복될 때 처리 
		//중복시에 파일명 뒤에 숫자를 붙이게 하는 방식
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
		out.printf("<h2>이름 : %s </h2>", a);
		out.printf("<h2>키 : %s</h2>", h);
		out.printf("<h2>몸무게: %s</h2>", w);
		out.printf("<h2>사진 : %s</h2>", fileName2);
		out.printf("<img src='img/%s'>", fileName);
		out.print("</body>");
		out.print("</html>");
	
	
	
	
	
	
	
	
	}
}
