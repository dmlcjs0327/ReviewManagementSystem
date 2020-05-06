package subject;

import java.util.Scanner;

public abstract class NonMajorSubject extends Subject {
	
	public NonMajorSubject(SubjectKind kind) {
		super(kind);
	}
	public abstract void printInfo();
	
	public abstract void getUserInput(Scanner sc);
	
	public void setProfessorwithYN(Scanner sc) {
		char answer='x';
		while(answer!='Y'||answer!='y'||answer!='n'||answer!='N') {
			System.out.print("Need to review it soon?(Y/N): ");	//교양이므로 당장 복습할 필요가 있는지 질문
			answer=sc.next().charAt(0);
			if(answer=='Y' || answer=='y') {
				System.out.print("*Review ranking(Natural num): ");
				this.setRrank(sc.nextInt());
				break;
			}
			else if(answer=='N' || answer=='n') {
				this.setRrank(Integer.MAX_VALUE);
				break;
			}
			else {
				System.out.println("\n!!Input Y/N!!");
			}
		}
	}
}
