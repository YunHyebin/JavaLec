package chap02_variable;

public class _12_constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 상수 선언 및 초기화
		final int COUNT_MONTHS = 12;
		final int COUNT_WEEKDAYS = 7;
		final double PI = 3.14;
		final int MAX_VALUE;
		
		//2. 상수를 먼저 선언만 해놓은 상태에서 초기화

		//상수 변수만 선언된 상태(초기화x)에선 값 할당 가능
		//값이 지정되어있지 않은 상수에는 값을 저장 가능
		MAX_VALUE = 100;
		//상수 선언 및 초기화까지 해놓은 상태에선 값 할당 불가능
		//이미 값이 저장된 상수의 값(초기화o)은 변경할 수 없다.
//		COUNT_WEEKDAYS = 10;
		
		//3. 상수출력
		System.out.println(MAX_VALUE);
		System.out.println("1년은 " + COUNT_MONTHS + "개월입니다.");
		System.out.println("일주일은 " + COUNT_WEEKDAYS + "일입니다.");
		System.out.println("반지름이 2인 원의 넓이는 " + (2*2*PI) + "입니다\n");
		
		
		
		

		
	}

}
