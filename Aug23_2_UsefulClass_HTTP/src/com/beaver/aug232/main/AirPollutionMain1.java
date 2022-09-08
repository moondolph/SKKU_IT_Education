package com.beaver.aug232.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.beaver.http.client.BeaverHttpClient;

// ������ (Ŭ���̾�Ʈ�� ������Ʈ�� ��û -> ����Ʈ�� ����)
// �ǽð� �����͸� XML Parsing (Ŭ���̾�Ʈ�� �����͸� ��û -> XML / JSON ����)
//  (���߿�) �� �����͸� ������ ������ �̹���ȭ�� ���Ѽ� ���� 
//		data.go.kr
//		data.seoul.go.kr
//		dev.naver.com
//		dev.kakao.com
//		...

// ���� ���������� ���� DB - �̼����� ������ 

// DB�� �ִ� �����͸� ����鿡�� ������� �ϴ� ���...
//		��κ��� ������� SQL�� �� �� ����...
// 		������Ʈ : ���������� DB���� ���ϰ� 

//		�����ڰ� �����͸� �������� ����
//		�����͸� Ư���� �������� ǥ������� �ϴµ� 
//		DB�� �ִ� �����͸� ǥ���ϴ� ���� : XML, JSON, 

// parsing - kxml2.jar(�ȵ���̵忡�� ���� o)
// 	�ʿ���� �����ʹ� �Ⱦ��, ���ϴ� ���·� �����ϴ� �۾� 

// XML (eXtensible Mark-up Language)
//		DB�� �ִ� �����͸� HTML���·� ǥ���� ��
//		<xxx> 		: �����±� (xxx : �±׸�)
//			yyy 	: �ؽ�Ʈ 
//		</xxx> 		: �����±�

// START_DOCUMENT 	: ������ ����
// END_DOCUMENT 	: ������ ��
// START_TAG		: �����±� (<xxx>)
// END_TAG			: �����±� (</xxx>)
// TEXT				: �ؽ�Ʈ (�����±׿� �����±� ������ ����)

// http://openAPI.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/

public class AirPollutionMain1 {
	public static void main(String[] args) {

		try {
			String address = "http://openAPI.seoul.go.kr:8088" + "/4f626857416f6c6c3632586a416843" + "/xml"
					+ "/RealtimeCityAir" + "/1" + "/25" + "/";
			InputStream is = BeaverHttpClient.download(address);
//			String result = BeaverHttpClient.convert(is, "UTF-8");
//					System.out.println(result);

			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");

			int type = xpp.getEventType();
			String tagName = null;

			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("MSRSTE_NM")) {
						System.out.printf("���� �� : %s\n", xpp.getText());
					} else if (tagName.equals("PM10")) {
						System.out.printf("�̼����� : %s��/m^3\n", xpp.getText());
					} else if (tagName.equals("PM25")) {
						System.out.printf("�ʹ̼����� : %s��\n", xpp.getText());
					} else if (tagName.equals("03")) {
						System.out.printf("���� : %sppm\n", xpp.getText());
					} else if (tagName.equals("NO2")) {
						System.out.printf("�̻�ȭ���� : %sppm\n", xpp.getText());
					} else if (tagName.equals("CO")) {
						System.out.printf("�ϻ�ȭź�� : %sppm\n", xpp.getText());
					} else if (tagName.equals("SO2")) {
						System.out.printf("�ƻ�ȭ���� : %sppm\n", xpp.getText());
					} else if (tagName.equals("IDEX_MN")) {
						System.out.printf("���մ��ȯ���� : %s\n", xpp.getText());
					} else if (tagName.equals("IDEX_MVL")) {
						System.out.printf("���մ��ȯ������ : %s\n", xpp.getText());
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
