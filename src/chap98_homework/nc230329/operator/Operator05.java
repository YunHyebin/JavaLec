package chap98_homework.nc230329.operator;

import java.util.Scanner;

public class Operator05 {

	public static void main(String[] args) {
		//5. 삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int input = sc.nextInt();
		String result = input%2 != 0 ? "홀수" : "짝수";
		System.out.println(result);

	}

}
