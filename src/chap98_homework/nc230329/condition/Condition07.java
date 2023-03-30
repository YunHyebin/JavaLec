package chap98_homework.nc230329.condition;

import java.util.Scanner;

public class Condition07 {

	public static void main(String[] args) {
		/*7. 사용자가 입력한 문자열이 "Yes"인 경우 "예"를 출력하고
		 * "No"인 경우 "아니오"를 출력하고, 그 외의 경우에는
		 * "잘못 입력하셨습니다."를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		
		if(input.equals("Yes")) {
			System.out.println("예");
		}else if (input.equals("No")) {
			System.out.println("아니오");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

}
