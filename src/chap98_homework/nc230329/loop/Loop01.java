package chap98_homework.nc230329.loop;

import java.util.Scanner;

public class Loop01 {

	public static void main(String[] args) {
		// 1. 1부터 10까지의 정수의 합을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("몇자리 수까지 더할까요? : ");
		int num = sc.nextInt();
		for(int i=1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
