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
		
		// 우리집 주변 반경 5km 이내에 검색한 키워드가 포함된 가게들을 거리 기준으로 정렬
		// 기본 보여지는 결과 수 : 15개
		
		
			try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색 : ");
			String search = k.next();
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			
			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query=" + search;		//검색어
			// 37.3216002 / 127.1101031 (y / x)
			address += "&x=127.1101031&y=37.3216002";	// 좌표 설정 (중심이 될 기준점)
			address += "&radius=5000";					// 주변 반경 거리
			address += "&sort=distance";				// 정렬 방법
			
			
			// Authorization: KakaoAK 1332ff234b2b658c1ef873fe08e0b86f
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK 1332ff234b2b658c1ef873fe08e0b86f");
			InputStream is = BeaverHttpClient.download(address, headers);
			String str = BeaverHttpClient.convert(is, "UTF-8");
			System.out.println(str);
			
			JSONParser jp = new JSONParser(); // 파싱하려면 객체가 하나 필요
			JSONObject jo = (JSONObject) jp.parse(str);
			
			// 총 검색 결과 수   total_count
			JSONObject jo2 = (JSONObject) jo.get("meta");
			System.out.printf("총 검색 결과 수 : %s개\n", jo2.get("total_count"));
			
			// 현재 페이지 결과 수  pageable_count 
			System.out.printf("현재페이지 결과 수 : %s개\n", jo2.get("pageable_count"));
			System.out.println("---------------------------");
			
			
			// 주소 address_name
			// 전화번호 phone
			// 상호명 place_name 
			// 우리 집과의 거리 distance
			// 를 출력										//documents라는 배열에 담긴 객체
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject jo3 = null;
			for (int i = 0; i < ja.size(); i++) {
				jo3 = (JSONObject) ja.get(i);
				System.out.printf("주소 : %s\n", jo3.get("address_name"));
				System.out.printf("전화번호 : %s\n", jo3.get("phone"));
				System.out.printf("상호명 : %s\n", jo3.get("place_name"));
				System.out.printf("거리 : %s\n", jo3.get("distance"));
				System.out.println("-------------------------------");
			
			}
			


			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
