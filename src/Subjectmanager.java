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
			int num=0;
			
			while(num!=5) {
				System.out.println("**Subject Info Edit menu**\n");
				System.out.println("1. Edit subject number");
				System.out.println("2. Edit subject name");
				System.out.println("3. Edit professor name");
				System.out.println("4. Edit review ranking");
				System.out.println("5. Exit\n");
				System.out.print("Select one number(between 1 to 5): ");
				num=sc.nextInt();
				
				if(num==1) {
					System.out.print("Subject number(int): ");
					S.snum=sc.nextInt();
				}
				else if(num==2) {
					String buf=sc.nextLine();
					System.out.print("Subject name(str): ");
					S.sname=sc.nextLine();
				}
				else if(num==3) {
					String buf=sc.nextLine();
					System.out.print("Professor name(str): ");
					S.pname=sc.nextLine();
				}
				else if(num==4) {
					System.out.print("Review ranking(Natural num): ");
					S.rrank=sc.nextInt();
				}
				else if(num==5) {
					System.out.println("\n\n**Edit END**\n\n");
				}
				else {
					System.out.println("\n!!Input an integer between 1 to 5!!\n\n");
				}
			}
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
