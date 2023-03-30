package chap98_homework.nc230329.operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		//1. 사용자가 입력한 두 정수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
		//(메소드로 따로 만들지 말고 메인메소드에서 구현)
		Scanner sc= new Scanner(System.in);
		
		System.out.println("정수 1 입력: ");
		int num1 = sc.nextInt();
		System.out.println("정수 2 입력: ");
		int num2 = sc.nextInt();
		
		int addition = num1+num2;
		int subtraction = num1-num2;
		int multiplication = num1*num2;
		int division = num1/num2;
		int remain = num1 % num2;
		System.out.println("정수1: " + num1 + "\t정수2: " + num2);
		System.out.println("======================");
		System.out.println(" 덧셈 결과 || " + addition);
		System.out.println(" 뺄셈 결과 || " + subtraction);
		System.out.println(" 곱셈 결과 || " + multiplication);
		System.out.println("나눗셈 결과 || " + division);
		System.out.println("나머지 결과 || " + remain);
		
		

	}

}
