package chap98_homework.nc230315;

import java.util.Scanner;

public class _12_advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 369게임을 작성합니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("369 게임 시작");
		System.out.print("1~99까지의 정수를 입력하세요: ");
		String pStr = sc.next();
		int clapCnt = 0;
		
		for (int i = 0; i < pStr.length(); i++) {
			char ch = pStr.charAt(i);
			if (ch == '3' || ch == '6' || ch == '9')
				++clapCnt;
		}
		System.out.println("박수" + "짝".repeat(clapCnt));

	}

}
