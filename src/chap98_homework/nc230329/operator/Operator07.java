package chap98_homework.nc230329.operator;

import java.util.Scanner;

public class Operator07 {

	public static void main(String[] args) {
		// 7. 사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수1 입력");
		double num1 = sc.nextDouble();
		System.out.print("실수2 입력");
		double num2 = sc.nextDouble();
		
		System.out.println("덧셈: " + (num1+num2));
		System.out.println("뺄셈: " + (num1-num2));
		System.out.println("곱셈: " + (num1*num2));
		System.out.println("나눗셈: " + (num1/num2));
		System.out.println("나머지: " + (num1%num2));

	}

}
