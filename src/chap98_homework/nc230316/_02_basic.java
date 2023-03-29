package chap98_homework.nc230316;

import java.util.Scanner;

public class _02_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2.int배열을 10개 생성해라
//		  사용자로부터 10개의 값을 입력받고
//		  순서대로 출력하고 
//		  총합을 구하세요
		Scanner sc = new Scanner(System.in);
		int [] array = new int [10];
		int sum = 0; 
		for (int i = 0; i < array.length; i++) {
			System.out.print("넣을 값: ");
			array[i] = sc.nextInt();
			sum += array[i];
		}
		System.out.println("총합: " + sum);
	}

}
