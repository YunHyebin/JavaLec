package chap98_homework.nc230316;

import java.util.Random;

public class _03_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3.int 배열로 10개의 공간을 생성하라
//		  1 ~ 10까지의 임의의 수를 저장하고
//		  홀수만 골라서 출력하라
		Random rand = new Random();
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10) + 1;
		}

		for (int a : array) {
			if (a % 2 == 0) {
				System.out.println(a);
			}

		}

	}
}
