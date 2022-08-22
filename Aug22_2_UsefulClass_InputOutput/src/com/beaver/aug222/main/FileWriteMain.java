package com.beaver.aug222.main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// CPU		: ������ġ 
// RAM		: ������ġ(�ӽ�) - ������ϸ� ���ư�
//			   static /  stack - ���α׷��� ����(�����ϸ�) ���ư�
//			   heap - �ڵ����� ���ư� X (GC������ �ڵ����� ���ư�)
// HDD(SSD) : ������ġ(����) - ����
// GPU		: �׷���ó����(CPU + RAM + HDD)

// ���α׷������� �����͸� �ܺο��� �а�, �ٽ� �ܺη� ����ϴ� �۾��� ���� �Ͼ�µ� 
// �����ʹ� ����ڷκ��� Ű���带 ���ؼ� �Էµ� ���� �ְ�, (Scanner)
// ����, ��Ʈ��ũ������ �Էµ� �� �ִ� (???) 	 (Input)

// �ݴ�� �����ʹ� ����͸� ���ؼ� ��µ� ���� �ְ�, (System.out.println)
// ����, ��Ʈ��ũ�ε� ��µ� �� �ִ� (???)  	 (Output)

//System.in -> InputStream
//System.out -> PrintStream

// 'Stream' : '����'
//		�⺻��
//			InputStream : ��ġ(Ű����,����,��Ʈ��ũ,...) ->���α׷����� �Է�(1byte��)
//			InputStreamReader : ��ġ -> ���α׷�(2byte��) (���� ũ�� Up!)
//			BufferedReader : (1String - line) (���� ũ�� Up!)
//			OutputStream : ���α׷��� ����� -> ��ġ(Ű����, ����, ��Ʈ��ũ,...)�� ���(1byte��) 
//			OutputStreamWriter : 2byte��
//			BuffedWriter : 1String - line
//		������(Ư�������� �°�)
//			PrintStream(OutputStream ����) - ���� ���ϰ� ������ �޼ҵ�� �߰� 
//			FileReader(InputStreamReader ����) - ���Ͽ��� �����͸� �о���� ���ϰ� 
//			FileWriter(OutputStreamWriter ����) - ������ ����ϱ� ���ϰ�
//			...

public class FileWriteMain {
	public static void main(String[] args) {
		//System.in : �ܼ�â -> ���α׷� (InputStream)
		//JDK 1.5�� Scanner�� �߰� 
		//InputStream�� ����ϱ� ���ϰ� ����Ʈ !
		Scanner k = new Scanner(System.in);
		System.out.print("�Է� : ");
		String cmt = k.next();
		
		// System.out : ���α׷� -> �ܼ�â
		System.out.println("--------------");
		
		// FileWriter 
		// 		���α׷� -> ����(OutputStreamWriter ������)
		//		������ ������ ����� �ֱ⵵ ��
		//		������ �ȸ������
		//		Linux�� ��� : C:/Users/user/Desktop/��ѱ�/ex.txt  --> /�� ��μ���
		//		Windows�� ��� : C:\\Users\\user\\Desktop\\��ѱ�\\ex.txt   --> \\�� ��μ��� 
        //																		+ \�ϳ��ε� ����
		// 		Java�� \�� : \t, \r, \n, \0, ... �� ��� (�̽������� ����)
		//		����, ������ ��Ÿ, ... -> ����ó�� !
		//
		
		BufferedWriter bw = null;
		try {
			// ������ ������ �̹� �����ϰ� ������ ����� ������
			// ������ �ִ� ������ ������ ������� ��
			// ������ ���� �ڿ� �����̰� ������(�����͸� �߰��ϰ� �ʹٸ�)
			// �� ��° �Ķ���� ������ true�� �ָ� ��
			
			// Encoding ��� X --> ANSI
			FileWriter fw = new FileWriter("C:/Users/user/Desktop/��ѱ�/dd.txt", true);
		
			
			
			// �� ����Ʈ�� ������ϱ⺸�ٴ�
			// '����'�� �̿��ؼ� �ѹ��� ���� ����Ʈ�� ������ϴ� ���� ����
			//		=> ��κ��� ����� �۾����� ���
			// ���� : CPU�� HDD ���̿��� ���Ǵ� �ӽ� ���� ����
			// ���۸� : <������>�� ���۷� �����ϴ� ���� 
			//	   => ���༺�� ��� ��ų �� ����
			//
			
			
			
			bw = new BufferedWriter(fw);
			bw.write(cmt + "\r\n");
			bw.write("--------------");
			bw.flush();		// ���� �뷮�� �� ��ä������ ���������� ��������(��� ������ �� ������) 
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
