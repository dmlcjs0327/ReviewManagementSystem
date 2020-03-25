import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=5;
		while(num!=6) {
			System.out.println("***Welcome to Review Management Menu!!***\n");
			System.out.println("1. Add a subject(to review)");
			System.out.println("2. Delete a subject(to review)");
			System.out.println("3. Edit a subject(to review)");
			System.out.println("4. View a subject(to review)");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit\n");
			System.out.print("Select one number(between 1 to 6): ");
			num=sc.nextInt();
			if(num==1) {
				addSubject();
			}
			else if(num==2) {
				deleteSubject();
			}
			else if(num==3) {
				editSubject();
			}
			else if(num==4) {
				viewSubject();
			}
			else if(num==5) {
				continue;
			}
			else if(num==6) {
				System.out.println("\n\n***END***\n\n");
			}
			else {
				System.out.println("\n!!Input an integer between 1 to 6!!\n\n");
			}
		}
	}

	public static void addSubject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n"+"***1. Add a subject(to review)***\n");
		System.out.print("Subject ID(int): ");
		int SI=sc.nextInt();
		String buf=sc.nextLine();
		System.out.print("Subject name(str): ");
		String SN=sc.nextLine();
		System.out.println(SI);
		System.out.println(SN+"\n");
	}
	
	public static void deleteSubject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n"+"***2. Delete a subject(to review)***\n");
		System.out.print("Subject ID(int): ");
		int SI=sc.nextInt();
	}
	
	public static void editSubject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n"+"***3. Edit a subject(to review)***\n");
		System.out.print("Subject ID(int): ");
		int SI=sc.nextInt();
	}
	
	public static void viewSubject() {
		Scanner sc=new Scanner(System.in);
		System.out.println("\n"+"***4. View a subject(to review)***\n");
		System.out.print("Subject ID(int): ");
		int SI=sc.nextInt();
	}
}