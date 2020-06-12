package gui;

import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import manager.Subjectmanager;
import subject.SubjectInput;

public class SubjectViewer extends JPanel{
	
	WindowFrame frame;
	Subjectmanager SMG;

	public SubjectViewer(WindowFrame frame,Subjectmanager SMG) {
		this.frame=frame;
		this.SMG=SMG;
		System.out.println("***"+SMG.size()+"***");
		
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("subject number");
		model.addColumn("subject name");
		model.addColumn("professor name");
		model.addColumn("review rank");

		for(int i=0;i<SMG.size();i++) {
			Vector row=new Vector();
			SubjectInput si=SMG.get(i);
			row.add(si.getSnum());
			row.add(si.getSname());
			row.add(si.getPname());
			row.add(si.getRrank());
			model.addRow(row);
		}
		
		JTable table=new JTable(model);
		JScrollPane sp=new JScrollPane(table);

		this.add(sp);
	}
}
