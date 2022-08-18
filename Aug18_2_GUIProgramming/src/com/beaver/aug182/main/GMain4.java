package com.beaver.aug182.main;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.beaver.aug182.frame.BMIFrame;

public class GMain4 {
	public static void main(String[] args) {

		// ������ BMI�˻��� JFrame
		JFrame jf = new JFrame("BMI �˻�");
		
		 //3�� 2��¥�� GridLayout
		GridLayout gl = new GridLayout(3,2);
		
		//JFrame�� ���̾ƿ� �Ӽ��� gl�� ���
		jf.setLayout(gl);

		
		JLabel heightLb = new JLabel("Ű(cm) : ") ;
		jf.add(heightLb); 
		
		JTextField heightTf = new JTextField();
		jf.add(heightTf); 
		
		JLabel weightLb = new JLabel("������(kg) : ") ;
		jf.add(weightLb); 
		
		JTextField weightTf = new JTextField();
		jf.add(weightTf); 

		JLabel resultLb = new JLabel("��� : ");
		jf.add(resultLb);
		
		JButton okay = new JButton("Ȯ��");
		jf.add(okay);
		
		BMIFrame bf = new BMIFrame(heightTf,weightTf,resultLb);
		okay.addActionListener(bf);
		
		
		jf.setSize(450, 300);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.setVisible(true);
		
		
		
	}
}