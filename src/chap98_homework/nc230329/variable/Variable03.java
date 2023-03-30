package chap98_homework.nc230329.variable;

import java.util.Scanner;

public class Variable03 {

	public static void main(String[] args) {
			/*
			 * 3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.
			 * 넓이 : 2 * 3.14 * 반지름 ^ 2, 
			 * 둘레 : 4 * 3.14 * 반지름
			 * 단, 원주율 3.14는 상수로 선언하세요.
			 */
			
			 final double PI = 3.14;
			
			 Scanner sc = new Scanner(System.in);
			 System.out.print("반지름 입력: ");
			 int radius = sc.nextInt();
			 
			 double area = 2 *PI * (Math.pow(radius, 2));
			 double round = 4 * PI * radius;
			 
			 System.out.println("반지름이 " + radius + "인 넓이: " + String.format("%.2f", area));
			 System.out.println("반지름이 " + radius + "인 둘레: " + String.format("%.2f", round));
			 
	}

}
