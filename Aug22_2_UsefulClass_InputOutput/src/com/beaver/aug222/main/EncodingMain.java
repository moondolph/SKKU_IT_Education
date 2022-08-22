package com.beaver.aug222.main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncodingMain {
	// Encoding : ������ ���³� ������ ��ȯ�ϴ� ó�����
	// ��ǻ�� : ���ڱ�� (���Ⱑ �帣�ų�, ���帣�ų�)
	// '��' -> ������ �帧���� ǥ��(�� ��ȣ) -> encoding 
	
	// Decoding : ���ڵ� �� ������ ��� ���� �� ������ ������ ���·� ��ȯ
	// ������ �帧 -> '��' -> decoding
	
	// encoding ����� ���� ������ ���� !
	// �߼� --A���--> 1010 --A���--> �߼�
	// �߼� --B���--> 0101 --C���--> ����
	// �߼� --C���--> 0001 --???--> ?!?!?!
	
	// �� ���������� �ַ� : UTF-8(Unicode Transform Format)
	// �ѱ��� Ÿ�� : EUC-KR
	// MS���� : MS949
	
	// 9ȣ�� --UTF-9--> 1011 --MS949--> ???        ���ڵ��� �Ȱ��� �ڵ�� �ؾ� ��.
	
	
	public static void main(String[] args) {
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\��ѱ�\\ex.txt", true);
//		} catch (FileNotFoundException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		OutputStreamWriter osw = null;
//		try {
//			osw = new OutputStreamWriter(fos,"UTF-8");
//		} catch (UnsupportedEncodingException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//		BufferedWriter bw = new BufferedWriter(osw);
//		try {
//			bw.write("jaklfjklasjdfklajsdfsdsjklkf");
//			bw.append("\r\n");
//			bw.append("���ƾƾƾƾƾƾƾ�" + "\r\n");
//			bw.append("��������������" + "\r\n");
//			bw.flush();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\user\\Desktop\\��ѱ�\\ex.txt");
			
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			br = new BufferedReader(isr);
			
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	
		
		
	}
}
