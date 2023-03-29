package chap98_homework.nc230316;

import java.util.Scanner;

public class _04_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 정수 10개를 입력받아 배열에 저장하고, 
		
//		이 정수중에서 2의 배수와 3의 배수를 출력하세요
		int array [] = new int [10];
		Scanner sc = new Scanner(System.in);
		
		for(int i =0; i < array.length; i++) {
			System.out.print("배열에 넣을 정수: ");
			array[i] = sc.nextInt();
		}
		
		for (int a : array) {
			if (a%2==0 && a%3==0) {
				System.out.println(a);
			}
		}
		

	}

}
