package chap98_homework.nc230329.loop;

import java.util.Scanner;

public class Loop03 {

	public static void main(String[] args) {
		// 3. 사용자가 입력한 정수까지의 모든 소수를 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.println(i + " / " + j + " = " + (i / j));
				if(i%j==0 && i%1==1) {
					System.out.println(i);

				}
			}
		}
	}

}
