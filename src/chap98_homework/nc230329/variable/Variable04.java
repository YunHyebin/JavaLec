package chap98_homework.nc230329.variable;

import java.util.Scanner;

public class Variable04 {

	public static void main(String[] args) {
//		4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력할 정수의 갯수: ");
		int cnt = sc.nextInt();
		int sum = 0;
		
		for (int i=0; i<cnt; i++) {
			System.out.print("정수 입력: ");
			sum += sc.nextInt();
		}
		
		System.out.println("합계 : " +sum+ "\t평균: " +sum/cnt);
	}

}
