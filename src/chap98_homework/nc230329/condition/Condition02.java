package chap98_homework.nc230329.condition;

import java.util.Scanner;

public class Condition02 {

	public static void main(String[] args) {
//		2. 사용자가 입력한 정수가 양수면 "양수" 음수면 "음수"라고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("양수");
		}else {			
			System.out.println("음수");
		}

	}

}
