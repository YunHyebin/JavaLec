package chap04_controlStatement;

import java.util.Scanner;

public class _06_infiniteWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Scanner를 사용할 때
		// next 메소드를 혼용해서 사용하는 것은 별로 좋지않음
		// nextInt, nextLine -> 형도 계속 바뀔 뿐더러 받아주는 변수도 계속 선언해야 하기 때문에
		// 하나의 next메소드만 사용하여 형변환 해주는 것이 낫다.
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1은 종료. 나머지는 계속");
			String inputStr = sc.nextLine();
			if (inputStr.equals("1")) {
				System.out.println("종료되었습니다.");
				break;
			}
		}

	}

}
