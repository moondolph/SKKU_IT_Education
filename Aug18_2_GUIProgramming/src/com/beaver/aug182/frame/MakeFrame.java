package com.beaver.aug182.frame;

import java.awt.FlowLayout;
import java.lang.reflect.Array;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// JFrame : Swing���� �����츦 ��Ÿ���� Class
// 		JPanel(���� ������), JButton(��ư), Jlabel(��), JTextField(�����Է�), ...
// layout : 
//			flowLayout - �������
//			BorderLayout - Frame ����
//			GridLayout - ���� ����
//			setLocation, setBounds - ��ġ ���Ƿ� ����

public class MakeFrame extends JFrame {
	JPanel pl;
	
	public MakeFrame() {
		setSize(500, 500);		// Frame size
		setTitle("GUI ����");		// Frame title
		pl = new JPanel(); 		// �г� �ϳ� ����
		pl.setLayout(new FlowLayout()); // ��� �����ϰڴ�!
		for (int i = 0; i <=10; i++) {
			pl.add(new JButton("��ư" + i)); // pl�ȿ� button�� ���� ���� 
		}
		add(pl); // JPanel�� JFrame�ȿ� �ֱ�
		setVisible(true); // JFrame ���̰� �ϱ� (�ݴ� : false)
	}
}




