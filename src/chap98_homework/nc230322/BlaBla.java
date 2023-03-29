package chap98_homework.nc230322;

import java.util.Scanner;

public class BlaBla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		input = input.replace("비트", "").replace("네이버", "").replace("클라우드", "");
		System.out.println(input);
		

	}

}
