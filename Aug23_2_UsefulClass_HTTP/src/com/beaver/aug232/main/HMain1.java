package com.beaver.aug232.main;

import java.io.IOException;
import java.io.InputStream;

import com.beaver.http.client.BeaverHttpClient;

public class HMain1 {
	// ���ϴ� ����Ʈ ���� �ܼ�â�� ����ϱ�
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = BeaverHttpClient.download("https://www.youtube.com");
			String result = BeaverHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			is.close(); // ���� �ʿ���� ��
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
