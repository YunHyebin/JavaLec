package chap98_homework.nc230329.variable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Variable05 {
	public static void main(String [] args) {
//		5. 사용자가 입력한 세 정수의 최소 값, 중간 값, 최대 값을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 정수의 갯수: ");
		int cnt = sc.nextInt();
		
		List<Integer> intArr = new ArrayList<Integer>();
		for (int i=0; i < cnt; i++) {
			System.out.print("정수 입력: ");
			intArr.add(Integer.valueOf(sc.nextInt()));
		}
		
		Collections.sort(intArr);
		System.out.println("입력한 배열 오름차순 정렬: " + intArr.toString());
		System.out.println("최소값: " + intArr.get(0));
		System.out.println("중간값: " + intArr.get(cnt/2));
		System.out.println("최대값: " + intArr.get(cnt-1));
		
		
		
		
	}

}
