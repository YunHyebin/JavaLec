package chap98_homework.nc230329.casting;

import java.util.Scanner;

public class Casting01 {

	public static void main(String[] args) {
//		1. 사용자가 두 개의 정수를 입력하면 문자열로 받아서 두 개의 문자열 정수를 정수형으로 변환해서 합을 출력하세요. 
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 정수1 입력: ");
		String num1 = sc.next();
		System.out.print("문자열 정수2 입력: ");
		String num2 = sc.next();
		
		System.out.println(num1 + "+" + num2 + "=" 
					+ (Integer.parseInt(num1) + Integer.parseInt(num2)));

	}

}
