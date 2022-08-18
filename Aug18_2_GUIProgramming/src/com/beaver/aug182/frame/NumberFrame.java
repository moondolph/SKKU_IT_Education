package com.beaver.aug182.frame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// JFrame 생성 (500, 500)
// JPanel안에 숫자가 1 ~ 30까지의 숫자가 랜덤한 위치에 나오게 

// 숫자를 여러개 뽑을때 >> 반복문
// array[]

// 글자가 표현되게 하려면 => JLabel

// set~~
// 배경색도 바꿔보고...
// 글자색도 바꿔보고...
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
		setTitle("뒤죽박죽 숫자");
		setSize(500, 500);
		setVisible(true);
	}	
}	
		
		
		
