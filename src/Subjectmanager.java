import java.util.ArrayList;
import java.util.Scanner;
import subject.LiberalArtsSubject;
import subject.SelfStudySubject;
import subject.Subject;
import subject.SubjectKind;

public class Subjectmanager {
	ArrayList<Subject> Subjects=new ArrayList<Subject>();
	Subject R=new Subject();
	Scanner sc;

	Subjectmanager(Scanner sc){
		this.sc=sc;
	}
	public void addSubject() {
		System.out.println("\n\n\n"+"***1. Add a subject(to review)***\n");
		int kind=0;
		Subject S=null;	// kind가 동적선언이라 초기화 안 하면 subjects.add 에러
		System.out.println("*Select Subject kind: ");
		System.out.println(" 1. for Major");
		System.out.println(" 2. for Liberal arts");
		System.out.println(" 3. for Self study");
		while(kind!=1 && kind !=2 && kind !=3) {
			System.out.print(" kind(1~3): ");
			kind=sc.nextInt();
			sc.nextLine();
			if (kind==1) {
				S=new Subject();	//실행할 때마다 새로운 객체 생성
				S.getUserInput(sc);
				break;
			}
			else if (kind==2) {
				S=new LiberalArtsSubject(SubjectKind.LiberalArts);	//실행할 때마다 새로운 객체 생성
				S.getUserInput(sc);
				break;
			}
			else if (kind==3) {
				S=new SelfStudySubject(SubjectKind.SelfStudy);	//실행할 때마다 새로운 객체 생성
				S.getUserInput(sc);
				break;
			}
			else {
				System.out.println("\n!!Input an integer between 1~3!!\n");
			}
		}
		if(kind!=3) {//self study의 메소드 자체에서 print
			System.out.println(S.getSnum()+"/" +S.getSname()+ "/"+S.getPname()+"/"+S.getRrank()+" are saved\n");
		}
		Subjects.add(S);
	}

	public void deleteSubject() {
		System.out.println("\n\n\n***2. Delete a subject(to review)***\n");
		System.out.print("*Subject ID(int): ");
		int subjectId=sc.nextInt();
		if(R.register(Subjects, subjectId)<0){	//등록된 ID인지 평가
			System.out.println("The subject has not been registered\n\n\n");
		}
		else if(R.register(Subjects, subjectId)>=0) {
			Subjects.remove(R.register(Subjects, subjectId));
			System.out.println("The subject "+subjectId+" is deleted\n\n\n");
		}
		else {
			System.out.println("\nThe subject has not been registered\n\n\n");
			return;
		}
	}

	public void editSubject() {
		System.out.println("\n\n\n"+"***3. Edit a subject(to review)***\n");
		System.out.print("*Subject ID(int): ");
		int subjectId=sc.nextInt();
		if(R.register(Subjects, subjectId)<0){		//등록된 ID인지 평가
			System.out.println("The subject has not been registered\n\n\n");
		}
		for(int i=0;i<Subjects.size();i++) {
			Subject S=Subjects.get(i);
			if(S.getSnum()==subjectId) {
				int num=-1;
				while(num!=5) {
					System.out.println("\n*Subject Info Edit menu*\n");
					System.out.println("1. Edit subject number");
					System.out.println("2. Edit subject name");
					System.out.println("3. Edit professor name");
					System.out.println("4. Edit review ranking");
					System.out.println("5. Exit\n");
					System.out.print("Select one number(between 1 to 5): ");
					num=sc.nextInt();

					if(num==1) {
						System.out.print("Subject number(int): ");
						S.setSnum(sc.nextInt());
					}
					else if(num==2) {
						sc.nextLine();
						System.out.print("Subject name(str): ");
						S.setSname(sc.nextLine());
					}
					else if(num==3) {
						sc.nextLine();
						System.out.print("Professor name(str): ");
						S.setPname(sc.nextLine());
					}
					else if(num==4) {
						System.out.print("Review ranking(Natural num): ");
						S.setRrank(sc.nextInt());
					}
					else if(num==5) {
						System.out.println("\n\n**Edit END**\n\n");
					}
					else {
						System.out.println("\n!!Input an integer between 1 to 5!!\n\n");
					}
				}//while
				break;
			}//if
		}//for
	}//editSubject

	public void viewSubjects() {
		System.out.println("\n\n\n***4. View a subject(to review)***\n");

		System.out.println("*Registered Subjects: "+Subjects.size());
		for(int i=0;i<Subjects.size();i++) {
			Subjects.get(i).printInfo();
		}
		if(Subjects.size()==0) {
			System.out.println("No subjects have been registered\n\n");
		}
		System.out.println("\n");
	}
}
