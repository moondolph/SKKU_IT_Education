// JAVA GUI���α׷� (Graphic User Interface)
// AWT, Swing, JavaFX

// AWT : �ڹ� ��â�⿡ ���� GUI ���̺귯�� 
// 		�ü��(OS)�� ���� ����� �� �޶��� ������, ������ ����� �������̾���.

// Swing :  AWT �������� ���� ���̺귯�� 
// 		 ������ ���α׷� - �ڹٷ� X : ����, �� ����ȭ�� C�������� ���� !
//		 ������ ���α׷� �� �� ����... -> ��/�������� �Ѿ�� �߼�!			 
//		- ��������δ� ����!, �����ε� ����!
//		- Android App ���� �����ϴµ� ������ ��
// JavaFX : Swing�� ���� ó���ӵ��� �����ؼ� ��õ�
// 		�پ��� ��ɵ鵵 �߰� + ���� �ܰ� �ٹ̴� �͵� �������� 
//		������ ��/���ʿ��� ������ �ϸ� �Ǳ� ������... �״� !....
//		


package com.beaver.aug181.main;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.beaver.aug181.avengers.Hulk;

public class OMain2 {
	public static void main(String[] args) {
	
	JFrame jf = new JFrame("����");
	JButton jb = new JButton("����");
	jf.add(jb);
	
	//��ũ - actionPerformed()�� �ݵ�� �ʿ�!
	//			(�̿ϼ��� �޼ҵ�)
	
	// ��ũ ����
	Hulk h = new Hulk();
	
	// ������ ���㿵������ ��ũ�� �����
	// ������ ��û
	jb.addActionListener(h);
	
	// ũ��, ���� ���̰� 
	jf.setSize(500, 500);
	jf.setVisible(true);
	
	
	
	}
}
