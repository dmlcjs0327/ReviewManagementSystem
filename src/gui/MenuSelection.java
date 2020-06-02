package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelection extends JFrame{
	public MenuSelection() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JLabel l1=new JLabel("Menu Selection");
		
		JButton b1=new JButton("add a subject");
		JButton b2=new JButton("delete a subject");
		JButton b3=new JButton("edit a subject");
		JButton b4=new JButton("view a subject");
		JButton b5=new JButton("exit program");
		
		p1.add(l1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		this.add(p1,BorderLayout.NORTH);//패널에 안 넣고 바로 레이블을 넣으면 좌측부터 입력
		this.add(p2,BorderLayout.CENTER);
		this.setVisible(true);
	}
}
