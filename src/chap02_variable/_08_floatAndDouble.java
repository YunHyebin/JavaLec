package chap02_variable;

public class _08_floatAndDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. float타입 변수 선언 및 초기화
		float fNum1 = 3.14f;
		float fNum2 = 5.245F;
		
		//2. double타입 변수 선언 및 초기화
		double dNum1 = 89.1234;
		double dNum2 = 11.984;
		
		//3. float타입 변수의 연산
		double result1 = fNum1 + fNum2;
		// float끼리 연산한 후 double 타입으로 변환
		
		//4. double 타입의 연산
		double result2= dNum1 / dNum2;
		
		//5. 실수형 변수 출력
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);

	}

}
