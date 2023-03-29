package chap17_generic.nc230328;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _basic03_wildCard {

	public static void main(String[] args) {		
//		3. public static Integer add(List<?> list) 와일드 카드를 이용한 메소드를 구현하세요.
		List<Integer> test1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		for (int i=0; i < 4; i++) {
			System.out.println("숫자 입력: ");
			test1.add(sc.nextInt());	
		}
		System.out.println(add(test1));
	}
	
	public static Integer add(List<?> list) {
		//return 반환형 : Integer
		//매개변수형: 모든 타입의 List배열
		int addResult = 0;
		for (Object t : list) {
			addResult += (Integer)t;
		}
		return addResult;
	}

}
