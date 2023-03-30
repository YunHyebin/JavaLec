package chap98_homework.nc230329.variable;

import java.util.Scanner;

public class Variable02 {
	public static void main(String args[]) {
//		2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아 두 정수로 해당 연산을 진행한 결과를 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력: ");
		int num1 = sc.nextInt();

		System.out.print("정수2 입력: ");
		int num2 = sc.nextInt();
		
		
		System.out.println("<<+,-,*,/,%>> 중\n문자char 연산자 입력: ");
		char character1 = sc.next().charAt(0);
		
		switch(character1) {
		case '+' : System.out.println(num1 + "+" + num2 + "=" + (num1+num2)); break;
		case '-' : System.out.println(num1 + "-" + num2 + "=" + (num1-num2)); break;
		case '*' : System.out.println(num1 + "*" + num2 + "=" + (num1*num2)); break;
		case '/' : System.out.println(num1 + "/" + num2 + "=" + (num1/num2)); break;		
		case '%' : System.out.println(num1 + "%" + num2 + "=" + (num1%num2)); break;
		}
		
		
		
		
	}

}
