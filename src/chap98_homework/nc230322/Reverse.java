package chap98_homework.nc230322;

import java.util.Scanner;

public class Reverse {
	public static String reverseString(String str) {
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		return reverse;	
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		System.out.println("결과: " + reverseString(input));
	}
	
}


