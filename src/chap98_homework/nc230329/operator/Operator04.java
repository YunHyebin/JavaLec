package chap98_homework.nc230329.operator;

import java.util.Scanner;

public class Operator04 {

	public static void main(String[] args) {
//		4. 사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		
		System.out.println(input.equals("Hello"));

	}

}
