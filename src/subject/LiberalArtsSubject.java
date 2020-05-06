package subject;

import java.util.Scanner;

public class LiberalArtsSubject extends NonMajorSubject implements SubjectInput{

	public LiberalArtsSubject(SubjectKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner sc) {
		setSubjectnum(sc);
		setSubjectname(sc);
		setProfessorname(sc);
		setProfessorwithYN(sc);
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
