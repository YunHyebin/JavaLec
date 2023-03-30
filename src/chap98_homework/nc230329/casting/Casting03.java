package chap98_homework.nc230329.casting;

import java.util.Scanner;

public class Casting03 {

	public static void main(String[] args) {
//		3. 사용자가 실수 한 개를 입력하면 정수형으로 변환해서 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 한개 입력: ");
		double num = sc.nextDouble();
		
		System.out.println(num + "--- 정수변환 ---> " + (int)num);

	}

}
