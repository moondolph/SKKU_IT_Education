package com.beaver.aug182.frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JFrame ���� (500, 500)
// JPanel�ȿ� ���ڰ� 1 ~ 30������ ���ڰ� ������ ��ġ�� ������ 

// ���ڸ� ������ ������ >> �ݺ���
// array[]

// ���ڰ� ǥ���ǰ� �Ϸ��� => JLabel

// set~~
// ������ �ٲ㺸��...
// ���ڻ��� �ٲ㺸��...
// Color.XXX

public class NumberFrame extends JFrame {
	JPanel p = new JPanel();
	JLabel[] l = new JLabel[31];	
	
	public NumberFrame() {
		p.setLayout(null);
		p.setBackground(Color.PINK);
		Random r = new Random();
		int x = 0;
		int y = 0;
		for (int i = 1; i<=30; i++) {
			l[i] = new JLabel("" + i);
			x = r.nextInt(500)+1;
			y = r.nextInt(500)+1;
			l[i].setForeground(Color.BLACK);
			l[i].setLocation(x, y);	
			l[i].setSize(50, 50);	
			
			p.add(l[i]);
			
		}
		add(p);
		setTitle("���׹��� ����");
		setSize(500, 500);
		setVisible(true);
	}	
}	
		
		
		
