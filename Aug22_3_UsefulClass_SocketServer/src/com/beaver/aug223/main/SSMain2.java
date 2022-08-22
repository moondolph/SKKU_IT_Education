package com.beaver.aug223.main;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SSMain2 {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(5353); // ��Ʈ
			System.out.println("...");
		
			Socket s = ss.accept();
			System.out.println("����� !");
			
			Scanner k = new Scanner(System.in);
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			while (true) {
				System.out.println("��] ");
				String msg = k.next();
				bw.write(msg + "\r\n");
				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		
			try {
				ss.close();
			} catch (Exception e1) {
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
	
	
	}
}
