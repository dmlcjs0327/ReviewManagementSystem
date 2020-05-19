package subject;

import java.util.Scanner;

import exceptions.RankException;


public interface SubjectInput {
	public int getSnum();
	public void setSnum(int snum);
	public String getSname();
	public void setSname(String sname);
	public String getPname();
	public void setPname(String pname);
	public int getRrank();
	public void setRrank(int rrank) throws RankException;
	public void getUserInput(Scanner sc);
	public void printInfo();
	public void setSubjectnum(Scanner sc);
	public void setSubjectname(Scanner sc);
	public void setProfessorname(Scanner sc);
	public void setReviewranking(Scanner sc);
}
