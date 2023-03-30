package chap98_homework.nc230329.variable;

import java.util.Scanner;

public class Variable08 {

	public static void main(String[] args) {
		/*
		 * 8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.(소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.) 사용자가
		 * 입력할 수 있는 값은 2 ~ 30로 제한
		 */
		Scanner sc = new Scanner(System.in);
		int arr [] = new int[10];
		int input;
		for(int i=0; i<arr.length; i++) {
			while(true) {
				System.out.print((i+1) + "번째 정수 입력: ");
				input = sc.nextInt();
				if(input >= 2 && input <= 30) {
					break;
				}
			}
			arr[i] = input;
		}
		
		int cnt = 0;
		for(int num : arr) {
			if((num == 2 || num == 3 || num == 5 || num == 7) ||
					(num % 2 != 0 
					&& num % 3 != 0 
					&& num % 5 != 0 
					&& num % 7 != 0)) {
				cnt++;
			}
		}
		System.out.println("소수의 갯수: " + cnt + "개");
	}

}
