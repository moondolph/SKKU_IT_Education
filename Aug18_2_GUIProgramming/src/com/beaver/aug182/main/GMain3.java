package com.beaver.aug182.main;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.beaver.aug182.frame.TempFrame;



//화씨온도 -> 섭씨온도 변환기
public class GMain3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JPanel jp = new JPanel();
		jf.add(jp);
		
		JLabel label1 = new JLabel("화씨온도 : ") ;
		JLabel label2 = new JLabel("섭씨온도 : ") ;
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);
		JButton button = new JButton("변환");

		jp.add(label1);
		jp.add(field1);
		jp.add(label2);
		jp.add(field2);
		jp.add(button);
		
		TempFrame tFrame = new TempFrame(jp, label1, label2, field1, field2, button);
		button.addActionListener(tFrame);
		
		
		
		jf.setSize(300, 150);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임을 종료하면 프로그램을 종료!
		jf.setTitle("온도 변환기");
		jf.setVisible(true);
		
		
		
		
	}
		
		
}
