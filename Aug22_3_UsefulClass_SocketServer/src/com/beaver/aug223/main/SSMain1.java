package com.beaver.aug223.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

// ���
//	  �Ϲ����� ��� (��û�ϸ� �� ���°�) - HTTP ���
//	  �ǽð� ��� (���� �� ���°�) - Socket���

// ���� - ���񽺸� �����ϴ� ��ǻ��

// Ŭ���̾�Ʈ - ���񽺸� �̿��ϴ� ��ǻ�� 

// IP�ּ� - ��Ʈ��ũ ����� �� �� ����ϴ� ��ȭ��ȣ ����
//		Ȯ�� : ���� - cmd - ipconfig
//		IPv4 �ּ� : 203.252.32.98

// ��Ʈ��ȣ - ���� ���� �̿��Ϸ�...
// 			0 ~ 65535
//			������ : 80�� 
//			OracleDB : 1521��
//			�̹� ��ӵ� ��Ʈ��ȣ�� �־ 4�ڸ� �Ѱ� ����
//			


public class SSMain1 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(2532); // ��� �����
			System.out.println("...");

			Socket s = ss.accept();
			System.out.println("����� !");

			Scanner k = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			JFrame jf = new JFrame();
			JTextArea jta = new JTextArea();
			jf.add(jta);
			jf.setSize(500, 500);
			jf.setVisible(true);

			Thread t = new Thread() {
				@Override
				public void run() {
					super.run();
					while (true) {
						try {
							jta.append("���] " + br.readLine() + "\r\n");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			};
			t.start();
			while (true) {
				System.out.print("��] ");
				String msg = k.next();
				bw.write(msg + "\r\n");
				jta.append("��] " + msg + "\r\n");
				bw.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();

			try {
				ss.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}

	}
}
