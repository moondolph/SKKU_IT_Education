package com.beaver.sep192.main;

import java.io.IOException;
import java.io.PrintWriter;
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
		response.setCharacterEncoding("EUC-KR");
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path);
		
		MultipartRequest mr = new MultipartRequest(request, path,
				30 * 1024 * 1024, "EUC-KR", new DefaultFileRenamePolicy());
		
		String name = mr.getParameter("name");
		double height = Double.parseDouble(mr.getParameter("height"));
		double weight = Double.parseDouble(mr.getParameter("weight"));
		height /= 100;
		double bmi = weight / (height * height);
		String result = "��ü��";
		if (bmi >= 40) {
			result = "����";
		} else if (bmi >= 35) {
			result = "�ߵ��";
		} else if (bmi >= 30) {
			result = "�浵��";
		} else if (bmi >= 25) {
			result = "��ü��";
		} else if (bmi >= 18.5) {
			result = "����";
		}
		
		String image = mr.getFilesystemName("photo");
		image = URLEncoder.encode(image, "EUC-KR");
		image = image.replace("+", " ");
		
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>BMI Result</title><meta charset='EUC-KR'></head>");
		out.print("<body>");

		out.print("<h1>BMI ���</h1>");
		out.printf("�̸� : %s<p>", name);
		out.printf("Ű : %.1fcm<p>", height * 100);
		out.printf("������ : %.1fkg<p>", weight);
		out.printf("BMI : %.2f<p>", bmi);
		out.printf("<h2>����� %s�Դϴ�</h2><p>", result);
		
		out.printf("<img src='img/%s'style='max-width:400px;'>", image);		
		out.print("</body>");
		out.print("</html>");
		
	}

}














