package chap98_homework.nc230323._advanced;

public abstract class CommonStat implements Student{
	int studentNo;
	StringBuffer name;
	String[] subject;
	int [] finalExam;
	static int subjectI = 0;
	
	@Override
	public void saveInfo(int sno, StringBuffer name, String subject) {
		this.studentNo = sno;
		this.name = name;
		this.subject[subjectI++] = subject;
		
	}
	@Override
	public void saveInfo(String[] subject, int[] finalExam) {
		this.subject[subjectI++] = subject;
		this.finalExam[] = finalExam;
	}
	@Override
	public void printInfo() {
		Student.super.printInfo();
		
		
	}
	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		return 0;
	}

}
