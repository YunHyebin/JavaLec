package chap98_homework.nc230329.variable;

import java.util.Scanner;

public class Variable01 {

	public static void main(String[] args) {
		// 1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		System.out.print("성별 입력: ");
		String gender = sc.next();
		
		System.out.println("===========[[입력받은 결과 출력]]============");
		System.out.println("이름: " + name + "\n나이: " + age + "\n성별: "+ gender);
		
		
	}

}
