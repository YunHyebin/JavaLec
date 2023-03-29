package chap06_class.calc;

public class Add extends Calc {
	// 멤버변수
	// 접근제어자가 private로 선언되어 다른 클래스에서 절대 접근(수정 및 참조) 불가능 
	private int num1;
	private int num2;
	private int result;
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		if (num1 > 0 && num1 <= 10) {
			this.num1 = num1;
		}
	
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
//	public int add() {
//		result = num1 + num2;
//		return result;
//	}
	
	//오버라이딩으로 부모(Calc)클래스에 존재하는 메소드를 재정의 
	public int add(int a, int b) {
		return (a*a) + (b*b);
	}

}
