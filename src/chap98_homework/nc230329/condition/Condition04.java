package chap98_homework.nc230329.condition;

import java.util.Scanner;

public class Condition04 {

	public static void main(String[] args) {
		// 4. 사용자가 입력한 숫자가 3의 배수면 "3의 배수입니다."라고 출력하고
		//3의 배수가 아니면 "3의 배수가 아닙니다."를 출력하세요.
		//(switch~case~default 사용)
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int result = sc.nextInt() % 3;
		
		switch(result) {
		case 0 : System.out.println("3의 배수입니다."); break;
		default: System.out.println("3의 배수가 아닙니다."); break;
		}

	}

}
