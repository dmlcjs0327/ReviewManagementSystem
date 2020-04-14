import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Subjectmanager SMG = new Subjectmanager(sc);	
		int num=0;

		while(num!=5) {
			System.out.println("<<<  Welcome to Review Management Menu  >>>\n");
			System.out.println("1. Add a subject(to review)");
			System.out.println("2. Delete a subject(to review)");
			System.out.println("3. Edit a subject(to review)");
			System.out.println("4. View subjects(to review)");
			System.out.println("5. Exit\n");
			System.out.print("Select one number(between 1 to 5): ");
			num=sc.nextInt();
			if(num==1) {
				SMG.addSubject();
			}
			else if(num==2) {
				SMG.deleteSubject();
			}
			else if(num==3) {
				SMG.editSubject();
			}
			else if(num==4) {
				SMG.viewSubjects();
			}
			else if(num==5) {
				System.out.println("\n\n***END***\n\n");
			}
			else {
				System.out.println("\n!!Input an integer between 1 to 5!!\n\n");
			}
		}
	}
}