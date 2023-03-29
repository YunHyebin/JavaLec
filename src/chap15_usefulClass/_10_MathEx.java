package chap15_usefulClass;

import java.util.Scanner;

public class _10_MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자가 5개 정수 입력받아 배열에 저장
		int[] arr = new int[5];

		// Math.max와 Math.min을 이용하여 최소값, 최대값 구하기

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력: ");
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			}
		System.out.println(max + "&" + min);
			
	}
}
