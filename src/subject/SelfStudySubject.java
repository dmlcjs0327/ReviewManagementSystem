package subject;

import java.util.Scanner;

public class SelfStudySubject extends NonMajorSubject implements SubjectInput{
	
	protected String purpose;
	
	public SelfStudySubject(SubjectKind kind) {
		super(kind);
	}
	
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getPurpose() {
		return purpose;
	}
	
	public void getUserInput(Scanner sc) {
		setSubjectnum(sc);
		setSubjectname(sc);
		this.setPname("-");	//독학이므로 교수명 생략
		setProfessorwithYN(sc);
		setPurpose(sc);
		System.out.println(getSnum()+"/" +getSname()+ "/"+getPname()+"/"+getRrank()+"/"+getPurpose()+" are saved\n");
	}
	
	public void printInfo() {
		String skind= getKindString();
		System.out.println("Subject kind: "+skind);
		System.out.println("Subject number: "+this.snum);
		System.out.println("Subject name: "+this.sname);
		System.out.println("Professor name : "+this.pname);
		System.out.println("Review ranking: "+this.rrank);
		System.out.println("Review purpose: "+this.purpose+"\n");
	}

	public void setPurpose(Scanner sc) {
		sc.nextLine();
		System.out.print("*Subject purpose(str): ");//Subjectmanager.addSubject()에서는 purpose 출력이 없기 때문
		this.setPurpose(sc.nextLine());
	}
}
