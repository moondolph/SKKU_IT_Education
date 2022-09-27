package com.beaver.aug241.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.beaver.http.client.BeaverHttpClient;

// AJAX - JavaScript
//  -> XML 많이 안 쓰임
//	-> JavaScript에 친화된 형태가 없을까 ?

//	JSON (JavaScript Object Notation)
//		DB에 있는 데이터를 JavaScript형태로 표현한 것
//		XML보다도 훨~~~~~~씬 좋음(압도적)
//		

//Java 배열 : {1, 2, 3}
//JS 배열 : [1, 2, 3] 

// Java객체 : dog d = new Dog();
//			d.getName("마루");
//			d.getage(3);
// JS객체 : { name : "마루", age : 3}

public class WeatherMain {
	public static void main(String[] args) {
		// api.openweathermap.org/data/2.5/forecast?q=bucheon&appid=5e6d6e938c64cabcecd3e680a2352ee1&units=metric&lang=kr

		try {
			Scanner k = new Scanner(System.in);
			System.out.println("City : ");
			String cityName = k.next();

			cityName = URLEncoder.encode(cityName, "UTF-8");
			String address = "https://api.openweathermap.org/data/2.5/weather";
			address += "?q=" + cityName; // 도시이름 넣기
			address += "&appid=5e6d6e938c64cabcecd3e680a2352ee1"; // API KEY
			address += "&units=metric&lang=kr"; // 섭씨 온도로 출력
			address += "&lang=kr"; // 한국어로 출력
//			System.out.println(address);
		
			InputStream is = BeaverHttpClient.download(address);
			String str = BeaverHttpClient.convert(is, "UTF-8");
//			System.out.println(str);
		
		
		JSONParser jp = new JSONParser(); // 파싱하려면 객체가 하나 필요
		
		// [] : 배열 
//		JSONArray js = (JSONArray) jp.parse(str);
//		System.out.println(ja);

		//{} : 객체
		JSONObject jo = (JSONObject) jp.parse(str);
		System.out.println(jo);
		
		//나라 이름
		JSONObject sys = (JSONObject) jo.get("sys");
		String country = (String) sys.get("country");
		System.out.println(country);
		
		//도시 이름
		String cityName2 = (String) jo.get("name");
		System.out.println(cityName2);
		
		//description
		JSONArray ja2 = (JSONArray) jo.get("weather");
		JSONObject jo2 = (JSONObject) ja2.get(0);
		String description = (String) jo2.get("description");
		System.out.println(description);
		
		JSONObject main = (JSONObject) jo.get("main");
		// 기온
		double temp = (double) main.get("temp");
		System.out.println(temp);
		
		// 체감온도
		double feelslike = (double)main.get("feels_like");
		System.out.println(feelslike);		
		
		// 최저기온
		double tempMin = (double) main.get("temp_min");
		System.out.println(tempMin);
		
		// 최고기온
		double tempMax = (double) main.get("temp_max");
		System.out.println(tempMax);
		
		// 기압
		long pressure = (long) main.get("pressure");
		System.out.println(pressure);
		
		// 습도
		long humidity = (long) main.get("humidity");
		System.out.println(humidity);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
