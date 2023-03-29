package chap98_homework.nc230317.basic;

public class InkjetPrinter extends Printer {
	//------------------[[멤버변수]]-------------------
	private int numRemainInk;	//잉크 잔량
	
	//------------------[[디폴트 생성자]]-------------------
	public InkjetPrinter() {
		company = "삼성";
		numRemainPaper = 0;
	}

	// ---------------[[InkjetPrint 하위클래스 멤버변수 get&set 메소드]]-------------
	public int getNumRemainInk() {
		return numRemainInk;
	}

	public void setNumRemainInk(int numRemainInk) {
		this.numRemainInk = numRemainInk;
	}

	//------------------[[인쇄 & 종이, 잉크 잔량 반환 메소드]]-------------------
	// 종이나 토너 잔량이 0일 경우 인쇄를 시작하지 못했습니다. 
	public void print() {
		this.numRemainPaper--;
		this.numRemainInk--;
		System.out.println("----------인쇄 시작-----------");
		System.out.println("인쇄 종이 잔량 : " + this.getNumRemainPaper());
		System.out.println("잉크 잔량 : " + this.getNumRemainInk());
	}

	// ------------------[[프린터 정보 반환 메소드]]-------------------
	public void showAllInfo() {
		System.out.println("---------프린터 정보----------");
		System.out.println("모델명: " + this.modelName);
		System.out.println("제조사: " + this.company);
		System.out.println("인터페이스 타입: " + this.interfaceType);
		System.out.println("인쇄종이 잔량: " + this.numRemainPaper);
		System.out.println("잉크 잔량: " + this.numRemainInk);

	}
}
