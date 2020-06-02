package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class SubjectAdder extends JFrame{
	public SubjectAdder() {
		JPanel p1=new JPanel();
		p1.setLayout(new SpringLayout());

		JLabel labelnum=new JLabel("subject number: ",JLabel.TRAILING);
		JTextField fieldnum=new JTextField(10);
		labelnum.setLabelFor(fieldnum);
		p1.add(labelnum);
		p1.add(fieldnum);

		JLabel labelsname=new JLabel("subject name: ",JLabel.TRAILING);
		JTextField fieldsname=new JTextField(10);
		labelsname.setLabelFor(fieldsname);
		p1.add(labelsname);
		p1.add(fieldsname);

		JLabel labelpname=new JLabel("professor name: ",JLabel.TRAILING);
		JTextField fieldpname=new JTextField(10);
		labelpname.setLabelFor(fieldpname);
		p1.add(labelpname);
		p1.add(fieldpname);

		JLabel labelrrank=new JLabel("review rank: ",JLabel.TRAILING);
		JTextField fieldprrank=new JTextField(10);
		labelrrank.setLabelFor(fieldprrank);
		p1.add(labelrrank);
		p1.add(fieldprrank);

		p1.add(new JButton("save"));
		p1.add(new JButton("cancle"));

		SpringUtilities.makeCompactGrid(p1,5,2,6,6,6,6);

		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(p1);
		this.setVisible(true);
	}
}
