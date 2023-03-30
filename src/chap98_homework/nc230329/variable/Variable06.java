package chap98_homework.nc230329.variable;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
//		6. 사용자가 입력한 정수의 구구단을 출력하세요.
//		(출력 양식 => 2를 입력했을 때 2 * 1 = 2
//								2 * 2 = 4
//								.....
//								2 * 9 = 18 
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 외우자 구구단을 외우자 몇단? : ");
		int num = sc.nextInt();
		
		for (int i=1; i<10; i++) {
			System.out.println(num + "*" + i + "=" + (num*i));
		}
	}

}
