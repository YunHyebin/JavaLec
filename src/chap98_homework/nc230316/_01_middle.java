package chap98_homework.nc230316;

import java.util.Random;

public class _01_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 20개 배열을 선언하세요
//	    20개의 값을 난수를 이용해서 0 ~ 100까지의 값으로 채워넣고

//	    먼저 인덱스의 홀수번째는 앞에서부터 출력하고
//	    짝수번째는 뒤에서부터 출력하세요
		int cnt = 0;
		int[] array = new int[20];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100) + 1;
		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				System.out.println("홀수번째 요소: " + array[i]);
			}
		}
		System.out.println("----------------------------");
		for (int i = array.length - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				System.out.println("짝수번째 요소: " + array[i]);
			}

		}

	}
}
