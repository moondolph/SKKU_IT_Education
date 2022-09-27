package com.beaver.aug232.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.beaver.http.client.BeaverHttpClient;

//http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=4113565500

// hour : �ð�
// temp : �µ�
// wfKor : ����
// wdKor : �ٶ�����
// �ֿܼ� ���

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
						System.out.printf("�ð� : ~%s��\n", xpp.getText());
					} else if (tagName.equals("temp")) {
						System.out.printf("�µ� : %s��\n", xpp.getText());
					} else if (tagName.equals("wfKor")) {
						System.out.printf("���� : %s\n", xpp.getText());
					} else if (tagName.equals("wdKor")) {
						System.out.printf("�ٶ����� : %s\n", xpp.getText());
						System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = ""; // XML������ ���⸦ �ؽ�Ʈ�� �ν��ϴ� ��찡 ����
				}
				xpp.next(); // �����ɷ� �Ѿ
				type = xpp.getEventType(); // ���� �±��� ���� ����
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
