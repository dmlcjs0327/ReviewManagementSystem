package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import manager.Subjectmanager;

public class WindowFrame extends JFrame{

	Subjectmanager SMG;
	MenuSelection ms;
	SubjectAdder sd;
	SubjectViewer sv;


	public WindowFrame(Subjectmanager SMG) {

		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.SMG=SMG;
		this.ms=new MenuSelection(this);
		this.sd=new SubjectAdder(this);
		this.sv=new SubjectViewer(this,this.SMG);

		this.setupPanel(ms);
		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();

	}

	public MenuSelection getMs() {
		return ms;
	}
	public void setMs(MenuSelection ms) {
		this.ms = ms;
	}
	public SubjectAdder getSd() {
		return sd;
	}
	public void setSd(SubjectAdder sd) {
		this.sd = sd;
	}
	public SubjectViewer getSv() {
		return sv;
	}
	public void setSv(SubjectViewer sv) {
		this.sv = sv;
	}
}
