package chap10_abstract.academy;

public class ComputerAcademy extends Academy{
	
	public ComputerAcademy(String subjectName) {
		super(subjectName);
	}
	
	public void teach() {
		System.out.println(this.getSubjectName() + "를 가르치다.");
	}
	public void doAssignment() {
		System.out.println("컴퓨터 숙제를 하다.");	
	}
	public void takeRest() {
		System.out.println("컴퓨터 학원에서 쉬는시간");	
	}
	public void checkAttendance() {
		System.out.println("컴퓨터학원에서 출석 체크를 한다.");	
	}
	
	public void showInfo() {
		System.out.println("-----[[컴퓨터 학원 정보]]-----");
		System.out.println("학생 수: " + this.getStudentNum());
		System.out.println("교사 수: " + this.getTeacherNum());
		System.out.println("과목 수: " + this.getSubjectNum());
		
	}

}
