package chap06_class.calc;

public class Divide {
	private int num1;
	private int num2;
	private int result;

	// 나누기 메소드
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

	public int divide() {
		if (num1 >= num2) {
			result = num1 / num2;
		} else {
			result = num2 / num1;
		}
		return result;
	}

}
