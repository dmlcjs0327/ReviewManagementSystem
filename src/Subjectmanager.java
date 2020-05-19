import java.util.ArrayList;
import java.util.Scanner;
import subject.LiberalArtsSubject;
import subject.MajorSubject;
import subject.SelfStudySubject;
import subject.SubjectInput;
import subject.SubjectKind;

public class Subjectmanager {
	ArrayList<SubjectInput> Subjects=new ArrayList<SubjectInput>();
	Scanner sc;

	Subjectmanager(Scanner sc){
		this.sc=sc;
	}
	public void addSubject() {
		System.out.println("\n\n"+"***1. Add a subject(to review)***\n");
		int kind=0;
		SubjectInput S=null;	// kind가 동적선언이라 초기화 안 하면 subjects.add 에러
		while(kind<1 || kind>3) {
			try {
				ShowKind();
				System.out.print(" kind(1~3): ");
				kind=sc.nextInt();
				sc.nextLine();
				if (kind==1) {
					S=new MajorSubject(SubjectKind.Major);	//실행할 때마다 새로운 객체 생성
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
			catch(Exception e) {
				System.out.println("\n!!You don't input integer!!");
				System.out.println("!!Input an integer between 1 to 3!!\n\n");
				if(sc.hasNext()) {
					sc.next();
				}
				kind=0;
			}
		}
		if(kind!=3) {//self study의 메소드 자체에서 print
			System.out.println(S.getSnum()+"/" +S.getSname()+ "/"+S.getPname()+"/"+S.getRrank()+" are saved\n");
		}
		Subjects.add(S);
	}

	public void deleteSubject() {
		System.out.println("\n\n***2. Delete a subject(to review)***\n");
		System.out.print("*Subject ID(int): ");
		int subjectId=sc.nextInt();
		
		switch(register(Subjects, subjectId)) {// 등록된 ID인지 평가
		case -1:
			System.out.println("The subject has not been registered\n\n");
			break;
		default:
			Subjects.remove(register(Subjects, subjectId));
			System.out.println("The subject "+subjectId+" is deleted\n\n");
		}
	}

	public void editSubject() {
		System.out.println("\n\n"+"***3. Edit a subject(to review)***\n");
		System.out.print("*Subject ID(int): ");
		int subjectId=sc.nextInt();
		if(register(Subjects, subjectId)<0){		//등록된 ID인지 평가
			System.out.println("The subject has not been registered\n\n");
		}
		else {
			for(int i=0;i<Subjects.size();i++) {
				SubjectInput S=Subjects.get(i);
				if(S.getSnum()==subjectId) {
					int num=-1;
					while(num!=5) {
						showEditMenu();
						num=sc.nextInt();
						
						switch(num) {
						case 1:
							S.setSubjectnum(sc);
							break;
						case 2:
							S.setSubjectname(sc);
							break;
						case 3:
							S.setProfessorname(sc);
							break;
						case 4:
							S.setReviewranking(sc);
							break;
						case 5:
							System.out.println("\n\n**Edit END**\n\n");
							break;
						default:
							System.out.println("\n!!Input an integer between 1 to 5!!\n\n");
						}
					}//while
					break;//for문 탈출
				}//if
			}//for
		}//else
	}//editSubject

	public void viewSubjects() {
		System.out.println("\n\n***4. View a subject(to review)***\n");

		System.out.println("*Registered Subjects: "+Subjects.size());
		for(int i=0;i<Subjects.size();i++) {
			Subjects.get(i).printInfo();
		}
		if(Subjects.size()==0) {
			System.out.println("No subjects have been registered\n\n");
		}
		System.out.println("\n");
	}
	
	//보조 메서드
	public void showEditMenu() {
		System.out.println("\n*Subject Info Edit menu*\n");
		System.out.println("1. Edit subject number");
		System.out.println("2. Edit subject name");
		System.out.println("3. Edit professor name");
		System.out.println("4. Edit review ranking");
		System.out.println("5. Exit\n");
		System.out.print("Select one number(between 1 to 5): ");
	}
	public int register(ArrayList<SubjectInput> Subjects,int subjectId) {
		int index=-1;
		for(int i=0;i<Subjects.size();i++) {
			if(Subjects.get(i).getSnum() == subjectId) {
				index=i;
				break;
			}
		}
		if(index<0) {
			return index;
		}
		return index;
	}
	public void ShowKind() {
		System.out.println("*Select Subject kind: ");
		System.out.println(" 1. for Major");
		System.out.println(" 2. for Liberal arts");
		System.out.println(" 3. for Self study");
	}
}
