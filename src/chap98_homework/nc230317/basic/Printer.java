package chap98_homework.nc230317.basic;

public class Printer {
	//------------------[[멤버변수]]-------------------
	protected String modelName;			//모델명
	protected String company;			//제조사
	protected String interfaceType;		//인터페이스 타입
	protected int numberOfPrint;		//인쇄매수
	protected int numRemainPaper;		//인쇄 종이 잔량
	
	//------------------[[디폴트 생성자]]-------------------
	public Printer() {
		company = "삼성";
		numRemainPaper = 0;
	}
	
	//---------------[[ Print 상위클래스 멤버변수 get&set 메소드]]-------------
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getInterfaceType() {
		return interfaceType;
	}
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}
	public int getNumberOfPrint() {
		return numberOfPrint;
	}
	public void setNumberOfPrint(int numberOfPrint) {
		this.numberOfPrint = numberOfPrint;
	}
	public int getNumRemainPaper() {
		return numRemainPaper;
	}
	public void setNumRemainPaper(int numRemainPaper) {
		this.numRemainPaper = numRemainPaper;
	}
	
	
	//------------------[[인쇄 & 종이 잔량 반환 메소드]]-------------------
	// 종이 잔량이 0일 경우 인쇄를 시작하지 못했습니다. 
	public void print() {
		this.numRemainPaper--;
		System.out.println("인쇄 시작");
		System.out.println("인쇄 종이 잔량: " + this.getNumRemainPaper());
	}
	
	//------------------[[프린터 정보 반환 메소드]]-------------------
	public void showAllInfo() {
		System.out.println("---------프린터 정보----------");
		System.out.println("모델명: " + this.modelName);
		System.out.println("제조사: " + this.company);
		System.out.println("인터페이스 타입: " + this.interfaceType);
		System.out.println("인쇄종이 잔량: " + this.numRemainPaper);
	}

}
