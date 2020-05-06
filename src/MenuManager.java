import java.util.Scanner;

public class MenuManager {

	public static void showmenu() {
		System.out.println("<<<  Welcome to Review Management Menu  >>>\n");
		System.out.println("1. Add a subject(to review)");
		System.out.println("2. Delete a subject(to review)");
		System.out.println("3. Edit a subject(to review)");
		System.out.println("4. View subjects(to review)");
		System.out.println("5. Exit");
		System.out.print("Select one number(between 1 to 5): ");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Subjectmanager SMG = new Subjectmanager(sc);	
		int num=0;

		while(num!=5) {
			showmenu();
			num=sc.nextInt();

			switch(num) {
			case 1:
				SMG.addSubject();
				break;
			case 2:
				SMG.deleteSubject();
				break;
			case 3:
				SMG.editSubject();
				break;
			case 4:
				SMG.viewSubjects();
				break;
			case 5:
				System.out.println("\n\n***END***\n\n");
				break;
			default:
				System.out.println("\n!!Input an integer between 1 to 5!!\n\n");
			}
		}
	}
}