import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import log.Eventlogger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	static Eventlogger logger= new Eventlogger("log.txt");

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Subjectmanager SMG = getObject("subjectmanager.ser");
		if(SMG==null) {
			SMG=new Subjectmanager(sc);
		}
		selectMenu(sc,SMG);
		putObject(SMG,"studentmanager.ser");
	}

	public static void selectMenu(Scanner sc, Subjectmanager SMG) {
		int num=0;
		while(num!=5) {
			try {
				showmenu();
				num=sc.nextInt();

				switch(num) {
				case 1:
					SMG.addSubject();
					logger.log("add a subject");
					break;
				case 2:
					SMG.deleteSubject();
					logger.log("delete a subject");
					break;
				case 3:
					SMG.editSubject();
					logger.log("edit a subject");
					break;
				case 4:
					SMG.viewSubjects();
					logger.log("view a subject");
					break;
				case 5:
					System.out.println("\n\n***END***\n\n");
					break;
				default:
					System.out.println("\n!!Input an integer between 1 to 5!!\n\n");
				}
			}
			catch(InputMismatchException e){
				System.out.println("\n!!You don't input integer!!");
				System.out.println("!!Input an integer between 1 to 5!!\n\n");
				if(sc.hasNext()) {
					sc.next();
				}
				num=0;
			}
		}
	}

	public static void showmenu() {
		System.out.println("<<<  Welcome to Review Management Menu  >>>\n");
		System.out.println("1. Add a subject(to review)");
		System.out.println("2. Delete a subject(to review)");
		System.out.println("3. Edit a subject(to review)");
		System.out.println("4. View subjects(to review)");
		System.out.println("5. Exit");
		System.out.print("Select one number(between 1 to 5): ");
	}

	public static Subjectmanager getObject(String filename) {
		Subjectmanager SMG = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			SMG=(Subjectmanager)in.readObject();
			in.close();
			file.close();
		} 
		catch (FileNotFoundException e) {
			return SMG;
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return SMG;
	}

	public static void putObject(Subjectmanager SMG, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(SMG);
			out.close();
			file.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
	}
}