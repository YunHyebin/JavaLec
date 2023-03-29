package chap98_homework.nc230314;

import java.util.Scanner;

public class _03_middle {

	public static void main(String[] args) {
		System.out.println("\n----------------------Middle 문제1----------------\n");
		System.out.print("나이 입력: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println(20<= age && age < 30 ? "20대입니다." : "20대가 아닙니다.");

	}

}
