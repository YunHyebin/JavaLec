package chap06_class.calc;

public class Minus extends Calc {
	private int num1;
	private int num2;
	private int result;

	// 메소드 정의
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public int minus() {
		if (num1 >= num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;
	}
	
//	public int minus(int a, int b) {
//		return(a*a) - (b*b);
//	}

}
