package com.beaver.aug241.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.beaver.http.client.BeaverHttpClient;

// 1332ff234b2b658c1ef873fe08e0b86f
// 37.3216002 / 127.1101031 (y / x)


public class LocSearchMain {
	public static void main(String[] args) {
		
		// �츮�� �ֺ� �ݰ� 5km �̳��� �˻��� Ű���尡 ���Ե� ���Ե��� �Ÿ� �������� ����
		// �⺻ �������� ��� �� : 15��
		
		
			try {
			Scanner k = new Scanner(System.in);
			System.out.print("�˻� : ");
			String search = k.next();
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			
			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query=" + search;		//�˻���
			// 37.3216002 / 127.1101031 (y / x)
			address += "&x=127.1101031&y=37.3216002";	// ��ǥ ���� (�߽��� �� ������)
			address += "&radius=5000";					// �ֺ� �ݰ� �Ÿ�
			address += "&sort=distance";				// ���� ���
			
			
			// Authorization: KakaoAK 1332ff234b2b658c1ef873fe08e0b86f
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK 1332ff234b2b658c1ef873fe08e0b86f");
			InputStream is = BeaverHttpClient.download(address, headers);
			String str = BeaverHttpClient.convert(is, "UTF-8");
			System.out.println(str);
			
			JSONParser jp = new JSONParser(); // �Ľ��Ϸ��� ��ü�� �ϳ� �ʿ�
			JSONObject jo = (JSONObject) jp.parse(str);
			
			// �� �˻� ��� ��   total_count
			JSONObject jo2 = (JSONObject) jo.get("meta");
			System.out.printf("�� �˻� ��� �� : %s��\n", jo2.get("total_count"));
			
			// ���� ������ ��� ��  pageable_count 
			System.out.printf("���������� ��� �� : %s��\n", jo2.get("pageable_count"));
			System.out.println("---------------------------");
			
			
			// �ּ� address_name
			// ��ȭ��ȣ phone
			// ��ȣ�� place_name 
			// �츮 ������ �Ÿ� distance
			// �� ���										//documents��� �迭�� ��� ��ü
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject jo3 = null;
			for (int i = 0; i < ja.size(); i++) {
				jo3 = (JSONObject) ja.get(i);
				System.out.printf("�ּ� : %s\n", jo3.get("address_name"));
				System.out.printf("��ȭ��ȣ : %s\n", jo3.get("phone"));
				System.out.printf("��ȣ�� : %s\n", jo3.get("place_name"));
				System.out.printf("�Ÿ� : %s\n", jo3.get("distance"));
				System.out.println("-------------------------------");
			
			}
			


			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
