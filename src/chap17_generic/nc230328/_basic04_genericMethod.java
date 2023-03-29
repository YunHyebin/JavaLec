package chap17_generic.nc230328;

import java.util.ArrayList;
import java.util.List;

public class _basic04_genericMethod {

	public static void main(String[] args) {
//		4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
		List<Integer> numInt = new ArrayList<Integer>();
		for (int i = 0; i < 12; i++) {
			numInt.add(i + 1);
		}
		printArr(numInt);

	}

	public static void printArr(List<?> list) {
		for (Object l : list) {
			if (list.indexOf(l) % 3 == 0)
				System.out.println(list.indexOf(l) +"의 요소: " + l);
		}
	}

}
