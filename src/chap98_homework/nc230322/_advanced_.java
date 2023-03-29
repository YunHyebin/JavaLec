package chap98_homework.nc230322;

import java.util.Scanner;

public class _advanced_ {

	public static void main(String[] args) {
//		1. 사용자가 입력한 문자열을 순서대로 정리하세요.
//	    순서는 유니코드 값 오름차순으로 정리.
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
		String str1 = sc.nextLine();
		String answer = "";
		char[] chArr = str1.toCharArray();
		// chArr = {가, 나, 다, 라}

		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < i; j++) {
//				System.out.println("chArr[i]: " + chArr[i]);
//				System.out.print("chArr[j]: " + chArr[j]);
				if (i > 0 && chArr[i] < chArr[j]) {
					char temporary = chArr[i];
					chArr[i] = chArr[j];
					chArr[j] = temporary;
				}
				System.out.println("----------");
//				System.out.println(temporary);
				System.out.println(chArr[i]);
				System.out.println(chArr[j]);

			}

		}
	}

}
