package subject;
import java.util.ArrayList;
import java.util.Scanner;

public class Subject {

	protected SubjectKind kind= SubjectKind.Major;
	protected int snum;
	protected String sname;
	protected String pname;
	protected int rrank;

	public Subject() {
	}
	
	public Subject(SubjectKind kind) {
		this.kind=kind;
	}

	public Subject(int snum, String sname, String pname, int rrank) {
		this.snum=snum;
		this.sname=sname;
		this.pname=pname;
		this.rrank=rrank;
	}
	
	public Subject(SubjectKind kind, int snum, String sname, String pname, int rrank) {
		this.kind=kind;
		this.snum=snum;
		this.sname=sname;
		this.pname=pname;
		this.rrank=rrank;
	}
	
	public SubjectKind getKind() {
		return kind;
	}

	public void setKind(SubjectKind kind) {
		this.kind = kind;
	}

	public int getSnum() {
		return snum;
	}

	public void setSnum(int snum) {
		this.snum = snum;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getRrank() {
		return rrank;
	}

	public void setRrank(int rrank) {
		this.rrank = rrank;
	}
	
	
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case Major:
			skind="Major";
			break;
		case LiberalArts:
			skind="Liberal Arts";
			break;
		case SelfStudy:
			skind="Self Study";
		default:
		}
		System.out.println("Subject kind: "+skind);
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
	
	public void getUserInput(Scanner sc) {
		System.out.print("*Subject id(int): ");
		this.setSnum(sc.nextInt());
		sc.nextLine();
		System.out.print("*Subject name(str): ");
		this.setSname(sc.nextLine());
		
		System.out.print("*Professor name(str): ");
		this.setPname(sc.nextLine());
		
		System.out.print("*Review ranking(Natural num): ");
		this.setRrank(sc.nextInt());
	}
}