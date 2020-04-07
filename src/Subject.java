import java.util.ArrayList;

public class Subject {
	int snum;
	String sname;
	String pname;
	int rrank;

	public Subject() {
	}

	public Subject(int snum, String sname, String pname, int rrank) {
		this.snum=snum;
		this.sname=sname;
		this.pname=pname;
		this.rrank=rrank;
	}

	public void printInfo() {
		System.out.println("Subject number: "+this.snum);
		System.out.println("Subject name: "+this.sname);
		System.out.println("Professor name : "+this.pname);
		System.out.println("Review ranking: "+this.rrank+"\n");
	}
	
	public int register(ArrayList<Subject> Subjects,int subjectId) {
		int index=-1;
		for(int i=0;i<Subjects.size();i++) {
			if(Subjects.get(i).snum == subjectId) {
				index=i;
				break;
			}
		}
		if(index<0) {
			return index;
		}
		return index;
	}
}
