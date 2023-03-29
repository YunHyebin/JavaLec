package chap10_abstract.academy;

public class EnglishAcademy extends Academy{
	
	public EnglishAcademy(String subjectName) {
		super(subjectName);
	}
	@Override
	public void teach() {
		System.out.println(this.getSubjectName() + "를 가르치다.");
	}
	public void doAssignment() {
		System.out.println("영어 숙제를 하다.");	
	}
	public void takeRest() {
		System.out.println("영어학원에서 쉬는시간");	
	}
	public void checkAttendance() {
		System.out.println("영어학원 출석 체크를 한다.");	
	}
	
	public void showInfo() {
		System.out.println("-----[[영어 학원 정보]]-----");
		System.out.println("학생 수: " + this.getStudentNum());
		System.out.println("교사 수: " + this.getTeacherNum());
		System.out.println("과목 수: " + this.getSubjectNum());
		
	}
	

}
