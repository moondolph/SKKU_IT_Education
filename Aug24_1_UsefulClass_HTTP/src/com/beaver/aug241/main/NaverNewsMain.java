package com.beaver.aug241.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.beaver.http.client.BeaverHttpClient;

//Client ID : cOqQBk8LzfFdqyU3L1JF
//Client Secret : ZaDYeUXfyd

//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%ED%83%9C%ED%92%8D

// ���ͳ� �ּ� ü�� 
// ��������:// - ��Ź�� 
//  	  ��ǻ���� �ּ�/	
//	 	  ������/������/.../���ϸ�
//		? ������ ������	������ = ��&������=��&������=��...
//		=> ��û �Ķ���� : Ŭ���̾�Ʈ�� �������� ���������� ������ ����

//	�ѱ�, Ư�����ڰ� �ٷ� ���� �ȵ�
//    ex) �� -> %2D (URL ���ڵ�)

public class NaverNewsMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("�˻��� : ");
			String search = k.next();
			System.out.println(search);
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);

			String address = "https://openapi.naver.com/v1/search/news.xml";
			address += "?query=" + search;

			// ������ title / description
			// ���� : Naver Open API - ???
			// ���� : Naver Search Result => �ȳ�����
			// HttpsURLConnection Ȱ�� -> �ȿ� �ִ� ���...

//			InputStream is = BeaverHttpClient.download(address);
//			String result = BeaverHttpClient.convert(is, "UTF-8");
//			System.out.println(result);

			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id", "cOqQBk8LzfFdqyU3L1JF");
			headers.put("X-Naver-Client-Secret", "ZaDYeUXfyd");
			InputStream is = BeaverHttpClient.download(address, headers);
			String result = BeaverHttpClient.convert(is, "UTF-8");
			System.out.println(result);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType();
			String tagName = null;
			String t = null;
			boolean data = false;

			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						data = true;
					}
				} else if (type == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
							t = xpp.getText();
							t = t.replace("<b>;", "");
							t = t.replace("</b>;", "");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "&");
							System.out.printf("���� : %s\n", t);
						} else if (tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>;", "");
							t = t.replace("</b>;", "");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "&");
							System.out.printf("���� : %s\n", t);
							System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
						}
					} else if (type == XmlPullParser.END_TAG) {
						tagName = "";
					}
				}
				xpp.next();
				type = xpp.getEventType();
			}
		} catch (
				Exception e) 
		{e.printStackTrace();
		}

	}
}
