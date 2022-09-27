package com.beaver.aug241.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.beaver.http.client.BeaverHttpClient;

// AJAX - JavaScript
//  -> XML ���� �� ����
//	-> JavaScript�� ģȭ�� ���°� ������ ?

//	JSON (JavaScript Object Notation)
//		DB�� �ִ� �����͸� JavaScript���·� ǥ���� ��
//		XML���ٵ� ��~~~~~~�� ����(�е���)
//		

//Java �迭 : {1, 2, 3}
//JS �迭 : [1, 2, 3] 

// Java��ü : dog d = new Dog();
//			d.getName("����");
//			d.getage(3);
// JS��ü : { name : "����", age : 3}

public class WeatherMain {
	public static void main(String[] args) {
		// api.openweathermap.org/data/2.5/forecast?q=bucheon&appid=5e6d6e938c64cabcecd3e680a2352ee1&units=metric&lang=kr

		try {
			Scanner k = new Scanner(System.in);
			System.out.println("City : ");
			String cityName = k.next();

			cityName = URLEncoder.encode(cityName, "UTF-8");
			String address = "https://api.openweathermap.org/data/2.5/weather";
			address += "?q=" + cityName; // �����̸� �ֱ�
			address += "&appid=5e6d6e938c64cabcecd3e680a2352ee1"; // API KEY
			address += "&units=metric&lang=kr"; // ���� �µ��� ���
			address += "&lang=kr"; // �ѱ���� ���
//			System.out.println(address);
		
			InputStream is = BeaverHttpClient.download(address);
			String str = BeaverHttpClient.convert(is, "UTF-8");
//			System.out.println(str);
		
		
		JSONParser jp = new JSONParser(); // �Ľ��Ϸ��� ��ü�� �ϳ� �ʿ�
		
		// [] : �迭 
//		JSONArray js = (JSONArray) jp.parse(str);
//		System.out.println(ja);

		//{} : ��ü
		JSONObject jo = (JSONObject) jp.parse(str);
		System.out.println(jo);
		
		//���� �̸�
		JSONObject sys = (JSONObject) jo.get("sys");
		String country = (String) sys.get("country");
		System.out.println(country);
		
		//���� �̸�
		String cityName2 = (String) jo.get("name");
		System.out.println(cityName2);
		
		//description
		JSONArray ja2 = (JSONArray) jo.get("weather");
		JSONObject jo2 = (JSONObject) ja2.get(0);
		String description = (String) jo2.get("description");
		System.out.println(description);
		
		JSONObject main = (JSONObject) jo.get("main");
		// ���
		double temp = (double) main.get("temp");
		System.out.println(temp);
		
		// ü���µ�
		double feelslike = (double)main.get("feels_like");
		System.out.println(feelslike);		
		
		// �������
		double tempMin = (double) main.get("temp_min");
		System.out.println(tempMin);
		
		// �ְ���
		double tempMax = (double) main.get("temp_max");
		System.out.println(tempMax);
		
		// ���
		long pressure = (long) main.get("pressure");
		System.out.println(pressure);
		
		// ����
		long humidity = (long) main.get("humidity");
		System.out.println(humidity);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
