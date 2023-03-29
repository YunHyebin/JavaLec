package chap13_objectArray;

public class Programming extends ILectureClass{
	public Programming (String subject, int studentCnt, int lectureTime) {
		super(subject, studentCnt, lectureTime);
	}

	@Override
	public String getSubject() {
		// TODO Auto-generated method stub
		return super.getSubject();
	}

	@Override
	public void setSubject(String subject) {
		// TODO Auto-generated method stub
		this.setSubject(subject);
	}

	@Override
	public int getStudentCnt() {
		// TODO Auto-generated method stub
		return super.getStudentCnt();
	}

	@Override
	public void setStudentCnt(int studentCnt) {
		// TODO Auto-generated method stub
		super.setStudentCnt(studentCnt);
	}

	@Override
	public int getLectureTime() {
		// TODO Auto-generated method stub
		return super.getLectureTime();
	}

	@Override
	public void setLectureTime(int lectureTime) {
		// TODO Auto-generated method stub
		super.setLectureTime(lectureTime);
	}
}
