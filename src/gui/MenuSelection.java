package gui;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.ButtonAddListener;
import listeners.ButtonViewListener;

public class MenuSelection extends JPanel{
	
	WindowFrame frame;
	
	public MenuSelection(WindowFrame frame) {
		this.frame=frame;
		
		this.setLayout(new BorderLayout());

		JPanel p1=new JPanel();
		JPanel p2=new JPanel();
		JLabel l1=new JLabel("Menu Selection");
		
		JButton b1=new JButton("add a subject");
		JButton b2=new JButton("delete a subject");
		JButton b3=new JButton("edit a subject");
		JButton b4=new JButton("view a subject");
		JButton b5=new JButton("exit program");
		
		b1.addActionListener(new ButtonAddListener(frame));
		b4.addActionListener(new ButtonViewListener(frame));
		
		p1.add(l1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		
		this.add(p1,BorderLayout.NORTH);
		this.add(p2,BorderLayout.CENTER);
	}
}
