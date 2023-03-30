package chap98_homework.nc230329.operator;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		//3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 
		//아니면 "2와 7의 공배수가 아님"이라고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		if(num % 2 == 0 && num % 7 ==0) {
			System.out.println("2와 7의 공배수");
		}else {
			System.out.println("2와 7의 공배수 아님");
		}

	}

}
