package chap13_objectArray;

public class ILectureClass implements ILecture{
	private String subject;
	private int studentCnt;
	private int lectureTime;
	
	public ILectureClass(String subject, int studentCnt, int lectureTime) {
		this.subject = subject;
		this.studentCnt = studentCnt;
		this.lectureTime = lectureTime;
	}

	@Override
	public void proceedLecture() {
		System.out.println(this.subject + "수업을 " +this.studentCnt +
				"명의 학생이 듣습니다. 수업시간은 " + lectureTime + "분 입니다.");
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getStudentCnt() {
		return studentCnt;
	}

	public void setStudentCnt(int studentCnt) {
		this.studentCnt = studentCnt;
	}

	public int getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(int lectureTime) {
		this.lectureTime = lectureTime;
	}

}
