package chap98_homework.nc230329.casting;

import java.util.Scanner;

public class Casting02 {

	public static void main(String[] args) {
//		2. 사용자가 두 개의 정수(a, b)를 입력해서 a / b의 연산결과를 실수로 출력하세요.(단, b는 0을 입력할 수 없습니다.)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수a 입력: ");
		int numA = sc.nextInt();
		System.out.print("정수b 입력: ");
		int numB = sc.nextInt();
		while(numB == 0) {
			System.out.print("정수b 입력: ");
			numB = sc.nextInt();
		}
		
		System.out.println(numA + "/" + numB + "=" + ((double)Math.round((numA/numB)*100)/100));
		

	}

}
