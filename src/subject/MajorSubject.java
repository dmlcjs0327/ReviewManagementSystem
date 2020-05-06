package subject;

import java.util.Scanner;

public class MajorSubject extends Subject implements SubjectInput{
	
	public MajorSubject(SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner sc) {
		setSubjectnum(sc);
		setSubjectname(sc);
		setProfessorname(sc);
		setReviewranking(sc);
	}
	
	public void printInfo() {
		String skind= getKindString();
		System.out.println("Subject kind: "+skind);
		System.out.println("Subject number: "+this.snum);
		System.out.println("Subject name: "+this.sname);
		System.out.println("Professor name : "+this.pname);
		System.out.println("Review ranking: "+this.rrank+"\n");
	}
}
