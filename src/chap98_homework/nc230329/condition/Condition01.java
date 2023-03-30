package chap98_homework.nc230329.condition;

import java.util.Scanner;

public class Condition01 {

	public static void main(String[] args) {
		//1. 사용자가 입력한 두 정수 중에서 큰 정수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력");
		int num2 = sc.nextInt();
		
		if(num1 >= num2) {
			System.out.println("더 큰 수: " + num1);
		}else {
			System.out.println("더 큰 수: " + num2);
		}

	}

}
