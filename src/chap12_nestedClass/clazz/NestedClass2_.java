package chap12_nestedClass.clazz;

public class NestedClass2_ {
	// 인스턴스 중첩 클래스
	// 외부클래스의 객체를 생성한 후 아래의 클래스에 접근 가능
	public class Mul{
		// static 변수나 메소드는 선언 불가
		// final static 변수나 메소드는 상수라서 가능
		int num1 = 100;
		int num2 = 2;
		
		int result = num1 * num2;

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
		public void setResult(int i) {
			// TODO Auto-generated method stub
			
		}
		public char[] getResult() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	// 정적 중첩 클래스
	//외부클래스의 객체 생성없이도 바로 접근 가능
	public static class Div{
		// num3, num4는 static이 아니라서 Div 클래스를 생성해야만 사용할 수 있는 변수임
		public int num3 = 10;
		public int num4 = 5;
		
		public int result = num3 / num4; 
		public static int result2 = 10/5;
		// num3와 num4가 static으로 선언되지 않아 메모리에 바로 생성되지 않아서
		// result 변수도 static으로 선언하면 안된다. (num3과 num4가 먼저 메모리에 생성되야 사용할 수 있어서)

		public int getNum3() {
			return num3;
		}

		public void setNum3(int num3) {
			this.num3 = num3;
		}

		public int getNum4() {
			return num4;
		}

		public void setNum4(int num4) {
			this.num4 = num4;
		}

		public int getResult() {
			return this.result;
		}

		public void setResult(int result) {
			this.result = result;
		}
		
		public int getResult2() {
			return this.result2;
		}
		
		public int setResult2() {
			return this.result2;
		}
		
	}

}
