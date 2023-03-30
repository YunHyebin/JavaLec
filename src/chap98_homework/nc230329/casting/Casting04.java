package chap98_homework.nc230329.casting;

import java.util.Scanner;

public class Casting04 {

	public static void main(String[] args) {
//		4. 사용자가 한 개의 실수를 입력하면 그 실수의 제곱의 결과를 문자열로 변환하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 한개 입력: ");
		double num = sc.nextDouble();
		System.out.print("몇 승?: ");
		int powNum = sc.nextInt();
		
		//String.format() 메소드의 리턴형은 String
		String result = String.format("%f.2", Math.pow(num, powNum));
		
		System.out.println(num + "의 제곱: " + result);

	}

}
