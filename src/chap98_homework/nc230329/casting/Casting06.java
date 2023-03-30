package chap98_homework.nc230329.casting;

import java.util.Scanner;

public class Casting06 {

	public static void main(String[] args) {
//		6. 사용자가 입력한 두 개의 문자 각각의 유니코드를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 1 입력: ");
		char var1 = sc.next().charAt(0);
		System.out.println("문자 2 입력: ");
		char var2 = sc.next().charAt(0);
		
		System.out.println("문자1의 유니코드: " + (int)var1);
		System.out.println("문자2의 유니코드: " + (int)var2);

	}

}
