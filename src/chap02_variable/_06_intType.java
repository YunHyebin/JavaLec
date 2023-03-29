package chap02_variable;

public class _06_intType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수 선언 및 초기화
		byte num1 = 10;
		short num2 = 20;
		
		int result = num1+num2;
		// num1과 num2가 int타입으로 변경된 후 연산
		// 자바에서 정수연산은 4byte로 진행되기 때문에
		double resultTest = num1+num2;
		
		System.out.println(result);
		System.out.println(resultTest);
		System.out.println((double)num1+num2);
		System.out.println((int)num1+num2);
		System.out.println((byte)(num1+num2));

	}

}
