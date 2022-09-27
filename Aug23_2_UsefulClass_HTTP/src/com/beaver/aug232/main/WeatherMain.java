package com.beaver.aug232.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.beaver.http.client.BeaverHttpClient;

//http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113565500

// hour : 시간
// temp : 온도
// wfKor : 날씨
// wdKor : 바람방향
// 콘솔에 출력

public class WeatherMain {
	public static void main(String[] args) {

		try {
			String address = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113565500";
			InputStream is = BeaverHttpClient.download(address);
//		String result = BeaverHttpClient.convert(is, "UTF-8");
//				System.out.println(result);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType();
			String tagName = null;

			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
						System.out.printf("시간 : ~%s시\n", xpp.getText());
					} else if (tagName.equals("temp")) {
						System.out.printf("온도 : %s℃\n", xpp.getText());
					} else if (tagName.equals("wfKor")) {
						System.out.printf("날씨 : %s\n", xpp.getText());
					} else if (tagName.equals("wdKor")) {
						System.out.printf("바람방향 : %s\n", xpp.getText());
						System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = ""; // XML에서는 띄어쓰기를 텍스트로 인식하는 경우가 있음
				}
				xpp.next(); // 다음걸로 넘어감
				type = xpp.getEventType(); // 다음 태그의 값을 가짐
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
