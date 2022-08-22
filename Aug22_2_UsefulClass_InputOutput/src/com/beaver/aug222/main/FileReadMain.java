package com.beaver.aug222.main;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadMain {
	public static void main(String[] args) {
		// Windows�� ��ο� ��ҹ��� ��������
		// Linux�� ��ҹ��ڸ� ������

		// fr���� br�� ���������
		// �����Ȱ͵� �߿��� �ϳ��� ������ �� ó��
		
		BufferedReader br = null;
		try {
			// ���� -> ���α׷�(InputStreamReader ����)
			FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\beaver1.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while (( line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
