package chap06_class.calc;

public class Multiple {
	private int num1;
	private int num2;
	private int result;

	// 곱하기 메소드 정의
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

	public int multiple() {
		result = num1 * num2;
		return result;
	}

	// 오버로딩 : 같은 이름의 메소드를 매개변수만 조작하여 다른 메소드로 만든다.

	public int multiple(int a) {
		return a * a;
	}

	public int multiple(int a, int b) {
		int result = 1;
		for (int i = 0; i < b; i++) {
			result *= a;
		}
		return result;

	}

}
