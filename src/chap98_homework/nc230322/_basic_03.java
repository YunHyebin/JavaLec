package chap98_homework.nc230322;

import java.util.Scanner;

public class _basic_03 {
//	3. 사용자가 입력한 문자열에서 알파벳의 모음을 제거하여 출력하세요.
//	   대문자 모음, 소문자 모음 모두 제거. 모음은 a, e, i, o, u

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		String vowels= "aeiouAEIOU";
		String result = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(vowels.indexOf(ch) == -1) {
				result += ch;
			}
		}
		System.out.println("결과: " +result);
	}
}
