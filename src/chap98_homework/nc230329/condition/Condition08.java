package chap98_homework.nc230329.condition;

import java.util.Scanner;

public class Condition08 {

	public static void main(String[] args) {
		/*
		 * 8. 사용자가 입력한 두 정수를 비교하여 같으면 "두 수가 같습니다." 
		 * 첫 번째 수가 더 크면 "첫 번째 수가 더 큽니다."
		 *  두 번째 수가 더 크면 "두 번째 수가 더 큽니다."를 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1 입력: ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력: ");
		int num2 = sc.nextInt();
		
		if(num1 == num2) {
			System.out.println("두 수가 같습니다.");
		}else if (num1 > num2) {
			System.out.println("첫번째 수가 더 큽니다.");
		}else {
			System.out.println("두번째 수가 더 큽니다.");
		}
		

	}

}
