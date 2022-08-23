package com.beaver.aug232.main;

import java.io.IOException;
import java.io.InputStream;

import com.beaver.http.client.BeaverHttpClient;

public class HMain1 {
	// 원하는 사이트 내용 콘솔창에 출력하기
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
			is.close(); // 별로 필요없긴 함
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
