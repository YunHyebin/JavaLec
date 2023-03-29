package chap02_variable;

public class _01_initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수의 선언과 사용
		// 1. 변수의 선언
		int num1;
		int num2;
		
		// 2. 같은 자료형의 변수 여러개를 선언
		int num3, num4, num5;
		
		// 3. 값의 할당
		num1 = 10;
		num2 = 20;
		num3 = 30;
		
		// 4. 선언과 동시에 초기화
		int num6 = 60;
		
		// 5. 초기화되지 않은 상태로 변수 사용
		// System.out.println(num4);
		// The local variable num4 may not have been initialized
		
		// 6. 값이 할당된 변수의 사용
		// 연산 또는 출력에 변수 사용
		// 연산의 결과를 통한 초기화
		int result = num1 + num2; // result란 변수도 연산하면서 바로 초기화
		System.out.println(result);
		System.out.println(num6);
		
		float result2 = num1 +num2;
		System.out.println(result2);
		double result3 = num1+num2;
		System.out.println(result3);
		
		//7. 값의 변경
		System.out.println("num6 = " + num6);
		num6 = 100;
		System.out.println("num6 = " + num6);
		// 자료형이 다른 경우엔 에러
		// num6 = 100F; 
		
		// 리터럴
		
		
	}

}
