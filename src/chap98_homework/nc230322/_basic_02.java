package chap98_homework.nc230322;

import java.util.Scanner;

public class _basic_02 {

	public static void main(String[] args) {
//		2. 사용자가 입력한 문자열에서 가, 바의 개수를 새서 출력하세요.
//		   0개면 '가, 바가 존재하지 않습니다.'라고 출력.
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		
		int cnt = 0;
		for (int i =0; i <input.length(); i++) {
			if(input.charAt(i) == '가' || input.charAt(i) == '바') {
				cnt++;
			}
		}
		if(cnt ==0) {
			System.out.println("'가', '바' 가 존재하지 않습니다.");
		}else {
			System.out.println("가, 바의 총 갯수: " +cnt);
		}

	}

}
