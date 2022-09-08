package com.beaver.aug182.frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class BMIFrame implements ActionListener{

	private JTextField htf;
	private JTextField wtf;
	private JLabel rlb;
	
	public BMIFrame() {
		
	}

	public BMIFrame(JTextField htf, JTextField wtf, JLabel rlb) {
		super();
		this.htf = htf;
		this.wtf = wtf;
		this.rlb = rlb;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//���
		//String -> double
		System.out.println("���");
		double h = Double.parseDouble(htf.getText());
		double w = Double.parseDouble(wtf.getText());
		h /= 100;
		double bmi = w / (h * h);
		String result = "��ü��";
		if (bmi >= 40) {
			result = "����";
		}else if (bmi >= 35) {
			result = "�ߵ��";
		}else if (bmi >= 30) {
			result = "�浵��";
		}else if (bmi >= 25) {
			result = "��ü��";
		}else if (bmi >= 18.5) {
			result = "����";
		}
		
		// BMI : XX.X�̰�, ����� XX�Դϴ�. 
		// System.out.printf(); = String.format();
		// String�� ���� ��Ƽ� �����
		String finalResult = String.format("BMI : %.2f, ����� %s�Դϴ�.",bmi,result);
		rlb.setText(finalResult);
		
		
	}
}