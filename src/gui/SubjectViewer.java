package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SubjectViewer extends JFrame{

	public SubjectViewer() {
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("subject number");
		model.addColumn("subject name");
		model.addColumn("professor name");
		model.addColumn("review rank");

		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);

		this.add(sp);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
