package chap98_homework.nc230315;

import java.util.Scanner;

public class _11_advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 각 몇개로 변환되는지 출력하세요
		   // 출력 개수는 단위가 큰 것 순서로 계산합니다
		   // 예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] cnt = new int[9];

		Scanner sc = new Scanner(System.in);
		System.out.print("입금 액수 입력; ");
		int inputMoney = sc.nextInt();
		
		for (int i=0; i < money.length; i++) {
			cnt[i] = inputMoney / money[i];
			inputMoney %= money[i];
			System.out.println(money[i] + "원 " + cnt[i] + "개");
		}
		

	}

}
