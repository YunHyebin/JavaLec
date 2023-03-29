package chap98_homework.nc230322;

import java.util.Scanner;

public class _basic_04 {

	public static void main(String[] args) {
//		4. 사용자가 입력한 문자열1, 문자열2 문자열1이 문자열2를 포함하면
//		   '포함합니다.'를 출력, 아니면 '포함하지 않습니다.'를 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 1 입력: ");
		String input1 = sc.next();
		
		System.out.print("문자열 2 입력: ");
		String input2 = sc.next();
		
		if (input1.contains(input2) == true) {
			System.out.println("포함합니다.");
		}else{
			System.out.println("포함하지 않습니다.");
		}
		

	}

}
