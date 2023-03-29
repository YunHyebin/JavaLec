package chap98_homework.nc230323;

import java.util.Scanner;

public class _middle_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1. 크기가 30인 StringBuffer에 "hello"라는 문자열이 담겨있다.
//	    비어있는 바이트의 공간을 b, i, t가 반복되어 들어가도록 모두 채우세요.
		
		
		
		
//		2. "유용한 클래스는 많다. 다양한 라이브러리를 활용한다."라는 문자열이 있을때
//	     사용자가 정수를 입력하고 문자열을 거꾸로 만든 문자열의 정수 인덱스의 문자를 출력하세요.
		StringBuffer str = new StringBuffer("유용한 클래스는 많다. 다양한 라이브러리를 활용한다.");
		System.out.print("문제2 정수 입력: ");
		int num2 = sc.nextInt();
		System.out.println(str.reverse().charAt(num2));
		
		
			

//		3. 처음에 은행에 맡긴 돈은 10000원입니다
//		   금리는 연 10%입니다
//		   복리이자로 계산했을 때 10년후 얼마가 될까요?
		System.out.print("맡긴 원금: ");
		int money = sc.nextInt();
		System.out.print("이자율: ");
		double rate = sc.nextDouble();
		System.out.print("연수: ");
		int year = sc.nextInt();
		System.out.println("복리이자 계산 결과: " + getWelfare(money, rate, year)+"원");
		
		
//		4. 재귀메소드를 이용해 사용자가 입력한 숫자까지의 합을 구하시오.
		System.out.println("4번 문제 숫자 입력: ");
		int num = sc.nextInt();
		System.out.println("4번 문제 결과: " + addAll(num));
		
		
		
		
		
	}

	static int addAll(int inputNum) {
		int result = 0;
		if(inputNum == 0) {
			result = 0;
		}else {
			result = inputNum + addAll(inputNum-1);
		}
		return result;
	}
	
	static double getWelfare(int money, double rate, int year) {
		return money * (Math.pow((1+rate), year));
	}
}
