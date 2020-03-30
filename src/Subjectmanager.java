import java.util.Scanner;

public class Subjectmanager {
	Subject S=new Subject();
	Scanner sc;

	Subjectmanager(Scanner sc){
		this.sc=sc;
	}
	public void addSubject() {
		System.out.println("\n"+"***1. Add a subject(to review)***\n");
		System.out.print("Subject number(int): ");
		S.snum=sc.nextInt();
		String buf=sc.nextLine();
		System.out.print("Subject name(str): ");
		S.sname=sc.nextLine();
		System.out.print("Professor name(str): ");
		S.pname=sc.nextLine();
		System.out.print("Review ranking(Natural num): ");
		S.rrank=sc.nextInt();
		System.out.println(S.snum+"\n"+S.sname+"\n"+S.pname+"\n"+S.rrank+"\n");
	}

	public void deleteSubject() {
		System.out.println("\n"+"***2. Delete a subject(to review)***\n");
		System.out.print("Subject ID(int): ");
		int subjectId=sc.nextInt();
		if(S == null) {
			System.out.println("The subject has not been registered");
			return;
		}
		if(S.snum == subjectId) {
			S=null;
			System.out.println("The subject is deleted");
		}
	}

	public void editSubject() {
		System.out.println("\n"+"***3. Edit a subject(to review)***\n");
		System.out.print("Subject ID(int): ");
		int subjectId=sc.nextInt();
		if(S.snum==subjectId) {
			System.out.println("The Subject to be edited is "+subjectId);
		}
	}

	public void viewSubject() {
		System.out.println("\n"+"***4. View a subject(to review)***\n");
		System.out.print("Subject ID(int): ");
		int subjectId=sc.nextInt();
		if(S.snum==subjectId) {
			S.printInfo();
		}
		if(S == null) {
			System.out.println("The subject has not been registered");
			return;
		}
	}


}
