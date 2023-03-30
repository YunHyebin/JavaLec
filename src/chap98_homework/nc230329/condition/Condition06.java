package chap98_homework.nc230329.condition;

import java.util.Scanner;

public class Condition06 {

	public static void main(String[] args) {
		// 6. 사용자가 입력한 5개의 정수중 가장 큰 수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		int max = 0;
		for (int i=0; i<5; i++) {
			System.out.print("정수 입력: ");
			int input = sc.nextInt();
			if (input > max) {
				max = input;
			}
		}
		System.out.println("가장 큰 값: " + max);

	}

}
