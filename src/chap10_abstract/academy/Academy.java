package chap10_abstract.academy;

public abstract class Academy {
	protected int teacherNum;
	protected int studentNum;
	protected int subjectNum;
	protected String subjectName;
	
	//--------------------생성자----------------
	public Academy(String subjectName) {
		this.subjectName = subjectName;
	}
	
	//---------------getter&setter-------------
	public String getSubjectName() {
		return subjectName;
	}

	public int getTeacherNum() {
		return teacherNum;
	}
	public void setTeacherNum(int teacherNum) {
		this.teacherNum = teacherNum;
	}
	public int getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}
	public int getSubjectNum() {
		return subjectNum;
	}
	public void setSubjectNum(int subjectNum) {
		this.subjectNum = subjectNum;
	}
	
	//-----------추상메소드------------
	public abstract void teach();
	
	public abstract void doAssignment();
	
	public abstract void takeRest();
	
	public abstract void checkAttendance();
	
	public abstract void showInfo();
	
	

}
