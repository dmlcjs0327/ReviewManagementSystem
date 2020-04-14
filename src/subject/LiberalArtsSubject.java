package subject;

import java.util.Scanner;

public class LiberalArtsSubject extends Subject {
	public void getUserInput(Scanner sc) {
		System.out.print("*Subject id(int): ");
		this.setSnum(sc.nextInt());
		sc.nextLine();
		System.out.print("*Subject name(str): ");
		this.setSname(sc.nextLine());
		System.out.print("*Professor name(str): ");
		this.setPname(sc.nextLine());
		char answer='x';
		while(answer!='Y'||answer!='y'||answer!='n'||answer!='N') {
			System.out.print("Need to review?(Y/N): ");
			answer=sc.next().charAt(0);
			if(answer=='Y' || answer=='y') {
				System.out.print("*Review ranking(Natural num): ");
				this.setRrank(sc.nextInt());
				break;
			}
			else if(answer=='N' || answer=='n') {
				this.setRrank(Integer.MIN_VALUE);
				break;
			}
			else {
				System.out.println("\n!!Input Y/N!!");
			}
		}
	}
}
