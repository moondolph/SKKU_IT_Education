package com.beaver.sep213.main;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class Doctor {
	public static void calculate(HttpServletRequest request) {

		try {
			request.setCharacterEncoding("EUC-KR");
			String path = request.getServletContext().getRealPath("img");
			System.out.println(path);

			MultipartRequest mr = new MultipartRequest(request, path, 30 * 1024 * 1024, "EUC-KR",
					new DefaultFileRenamePolicy());

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

			// BMI��ġ => �Ҽ��� ��°�ڸ������� (*** �Ʒ������� �ȵǴϱ� ���⼭ �ذ�!)
			String bmi2 = String.format("%.2f", bmi);
			double bmi3 = Double.parseDouble(bmi2);

			String image = mr.getFilesystemName("photo");
			image = URLEncoder.encode(image, "EUC-KR");
			image = image.replace("+", " ");

			Guest g = new Guest(name, height, weight, bmi3, image, result);
			
			request.setAttribute("g", g);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
