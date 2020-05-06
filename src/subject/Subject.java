package subject;
import java.util.Scanner;

public abstract class Subject implements SubjectInput{
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
	public abstract void printInfo();
	public abstract void getUserInput(Scanner sc);
	public void setSubjectnum(Scanner sc) {
		System.out.print("Subject number(int): ");
		this.setSnum(sc.nextInt());
		sc.nextLine();
	}
	public void setSubjectname(Scanner sc) {
		System.out.print("Subject name(str): ");
		this.setSname(sc.nextLine());
	}
	public void setProfessorname(Scanner sc) {	
		System.out.print("Professor name(str): ");
		this.setPname(sc.nextLine());
	}
	public void setReviewranking(Scanner sc) {
		System.out.print("Review ranking(Natural num): ");
		this.setRrank(sc.nextInt());
	}
	public String getKindString() {
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
		return skind;
	}
}