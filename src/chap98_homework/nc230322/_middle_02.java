package chap98_homework.nc230322;

import java.util.Scanner;

public class _middle_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		String result = "";
		
		for(int i=0; i<input.length(); i++) {
			if(input.indexOf(input.charAt(i)) == i) {
				result += input.charAt(i);
			}
		}
		System.out.println(result);
		

	}

}
