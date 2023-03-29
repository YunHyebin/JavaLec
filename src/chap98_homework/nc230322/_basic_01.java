package chap98_homework.nc230322;

import java.util.Scanner;

public class _basic_01 {

	public static void main(String[] args) {
//		1. 사용자가 입력한 문자열을 받아서 가운데 문자를 출력하세요. 
//	    문자열의 길이가 짝수면 가운데 두 글자 출력. ex) 비둘기 -> 둘, 비트캠프 -> 트캠
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		if (input.length() % 2 == 0) {
			System.out.println(input.substring(input.length()/2-1, input.length()/2+1));
		}else {
			System.out.println(input.substring(input.length()/2, input.length()/2+1));
		}

	}

}
