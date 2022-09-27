package com.beaver.http.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

public class BeaverHttpClient {
	// ������ ��û�ؼ� �ٿ�ޱ�
	public static InputStream download(String address) throws IOException {
		URL u = new URL(address);
		if (address.startsWith("https")) {
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			return huc.getInputStream();
		} else {
			HttpURLConnection huc = (HttpURLConnection) u.openConnection();
			return huc.getInputStream();
		}

	}
	
	//"X-Naver-Client-Id","cOqQBk8LzfFdqyU3L1JF"
	//"X-Naver-Client-Secret","ZaDYeUXfyd"
	//[], List, Set, Map
	//������ ��û�ؼ� �ٿ�ޱ�(���ó�� O)
	public static InputStream download(String address, HashMap<String, String> headers) throws IOException {
		URL u = new URL(address);
		if (address.startsWith("https")) {
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			Set<String> headerName = headers.keySet();
			for (String hn : headerName) {
				huc.addRequestProperty(hn, headers.get(hn));
			}
			return huc.getInputStream();
		} else {
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			Set<String> headerName = headers.keySet();
			for (String hn : headerName) {
				huc.addRequestProperty(hn, headers.get(hn));
			}
			return huc.getInputStream();
		}
	}
	
	
	
	
	// �ٿ������ String���� �ٲٱ�
	public static String convert(InputStream is, String charset) throws IOException {
		InputStreamReader isr = new InputStreamReader(is, charset);
		BufferedReader br = new BufferedReader(isr);
		
		String line = null;
		StringBuffer sb = new StringBuffer();
		
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		return sb.toString();
	}



}