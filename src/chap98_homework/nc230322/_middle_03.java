package chap98_homework.nc230322;

import java.util.Scanner;

public class _middle_03 {
	public static void main(String [] args) {
//		3. 사용자가 입력한 문자열에서
//		3의 배수 자리의 문자는 3으로
//		5의 배수 자리의 문자는 5로 변경하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		String str = sc.next();
		Integer changeint = Integer.valueOf(str);
		
		if (changeint%3==0) {
			System.out.println("3");
		}else if(changeint%5==0) {
			System.out.println("5");
		}else {
			System.out.println("3과 5의 배수가 아님");
		}
		
	}

}
