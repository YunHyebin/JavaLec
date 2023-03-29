package chap03_operator;

public class _02_arithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 대입연산자
		// 왼쪽 항의 변수에 오른쪽 항의 값을 대입
		int a = 10;
		int b = 6;
		int c = b;

		// 2. 산술연산자
		int num1 = 30;
		int num2 = 7;
		int result;

		// 덧셈연산
		result = num1 + num2;
		System.out.println("num1+num2 = " + result);
		// 뺄셈
		result = num1 - num2;
		System.out.println("num1-num2 = " + result);
		// 곱셉
		result = num1 * num2;
		System.out.println("num1*num2 = " + result);
		// 나눗셈
		result = num1 / num2;
		System.out.println("num1/num2 = " + result);
		// 나머지 : 몇의 배수인지 검사할 때 주로 사용.
		// 2로 나눈 나머지가 0이면 2의 배수
		// 3로 나눈 나머지가 0이면 3의 배수
		result = num1 % num2;
		System.out.println("num1&num2 = " + result);
		System.out.println("-------------------\n");

		// 3. 복합대입연산자
		int num3 = 10;
		int num4 = 3;

		// 덧셈복합연산자
		num3 += num4; // num3 = num3 + num4
		System.out.println("num3 += num4 => " + num3);

		// 뺄셈복합연산자
		num3 -= num4; // num3 = num3 + num4
		System.out.println("num3 -= num4 => " + num3);

		// 곱셉복합연산자
		num3 *= num4; // num3 = num3 + num4
		System.out.println("num3 *= num4 => " + num3);

		// 나눗셈복합연산자
		num3 /= num4; // num3 = num3 + num4
		System.out.println("num3 /= num4 => " + num3);

	}

}
