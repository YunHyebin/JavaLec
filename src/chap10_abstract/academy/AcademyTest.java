package chap10_abstract.academy;

public class AcademyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academy ac1 = new EnglishAcademy("영어");
		System.out.println("------------영어학원----------------");
		ac1.setStudentNum(30);
		ac1.setSubjectNum(2);
		ac1.setTeacherNum(1);
		ac1.checkAttendance();
		ac1.teach();
		ac1.takeRest();
		ac1.doAssignment();
		ac1.showInfo();
		
		System.out.println("\n------------컴퓨터학원----------------");
		ac1 = new ComputerAcademy("컴퓨터");
		ac1.setStudentNum(15);
		ac1.setSubjectNum(4);
		ac1.setTeacherNum(4);
		ac1.checkAttendance();
		ac1.teach();
		ac1.takeRest();
		ac1.doAssignment();
		ac1.showInfo();
		

	}

}
