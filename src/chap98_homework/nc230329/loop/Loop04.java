package chap98_homework.nc230329.loop;

import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		// 4. 사용자가 입력한 정수의 약수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		if ((num != 2 || num != 3) || (num % 2 == 0 && num % 3 == 0)) {
			System.out.println(num / 2);
			num = num % 2;

		}
	}
}
