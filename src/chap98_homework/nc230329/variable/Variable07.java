package chap98_homework.nc230329.variable;

import java.util.Scanner;

public class Variable07 {

	public static void main(String[] args) {
//		7. 사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.(재귀메소드 없이, while이나 for 반복문을 사용)
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		int result = 1;
		
		for(int i= num; i > 0; i--) {
			result *= i;
		}
		System.out.println("result 결과: " + result);
		

	}

}
