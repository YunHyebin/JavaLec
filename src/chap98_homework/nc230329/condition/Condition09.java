package chap98_homework.nc230329.condition;

import java.util.Scanner;

public class Condition09 {

	public static void main(String[] args) {
		/*
		 * 9. 사용자가 입력한 세 정수가 모두 짝수인 경우 "모두 짝수입니다." 
		 * 모두 홀수인 경우 "모두 홀수입니다." 그 외의 경우
		 * "짝수 : xxx개, 홀수 : xxx개 입니다."를 출력하세요.
		 */
		
		int evenCnt = 0;
		int oddCnt = 0;
		
		Scanner sc = new Scanner(System.in);
		for (int i=1; i<4; i++) {
			System.out.println("정수 " +i+ " 입력: ");
			int input = sc.nextInt();
			if(input % 2 == 0) {
				evenCnt++;
			}else {
				oddCnt++;
			}
		}
		if(evenCnt == 3) {
			System.out.println("모두 짝수입니다.");
		}else if(oddCnt == 3) {
			System.out.println("모두 홀수입니다.");
		}else {
			System.out.println("짝수: " + evenCnt + "개, 홀수 : "+ oddCnt + "개");
		}
		
		
	}

}
