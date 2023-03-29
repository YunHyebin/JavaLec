package chap02_variable;

public class _03_scopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 메인메소드 지역변수
		// num1은 메인메소드 안에서만 사용가능
		int num1 = 100;
		
		//2. 제어문의 지역변수
		if(num1 > 50) {
			int num2 = 50;
			int num3 = num1;
			
			// 제어문은 메인메소드에 포함되어있어 메인메소드의 지역변수인 num1 사용가능
			System.out.println(num1+ ", " + num2 + ", " + num3);
		}
		// num2, 3가 제어문의 지역변수이기 때문에 제어문 밖에서는 사용 불가능
		// System.out.println(num1+ ", " + num2 + ", " + num3);
		
		//메소드 호출
		//메소드가 호출될 때 메소드의 지역변수가 메모리에 저장됨
		checkScope();
		//메소드의 호출 끝났을 때 지역변수가 메모리에서 삭제
		// System.out.println(num4);
		// num4는 checkScope에서 선언된 지역변수로 메인메소드에서는 사용할 수 없다.
		
		int mainNum =10;
		int sum;
		if (mainNum > 10) {
			int ifNum = 10;
			sum = mainNum + ifNum;
		}else {
			int ifNum = 30;
			sum = mainNum + ifNum;
		}
//		System.out.println(ifNum); //ifNum은 if문의 {}안에 선언되어 종료되어 메모리에서 삭제됨(지역변수)
		//따라서 밖에선 선언 불가능
	
}

	// 메소드의 지역변수
	public static void checkScope() {
		// 사용자 정의 메소드 지역변수
		int num4 = 10;
		System.out.println(num4);
	}
	
	public static void getSum() {
		int localVal1 = 10;
		int localVal2 = 20;
		int localResult = localVal1 + localVal2;
			// getSum메소드 안의 지역변수
			// getSum메소드 호출됐을 때 생성되었다가 메소드 실행 끝나면 지역변수들은 메모리에서 삭제됨

}
