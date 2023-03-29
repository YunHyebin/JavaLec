package chap17_generic.nc230328;

import java.util.ArrayList;
import java.util.List;

public class _basic05_genericMethod {
	// 5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
	public static void main(String []args) {
		
		List<Double> intList = new ArrayList<Double>();
		for(int i=0; i<5; i++) {
			intList.add((double) (i+10));
		}
		
		System.out.println(_basic05_genericMethod.getMin(intList));
	}
	
	

	public static <T extends Number> double getMin(List<T> list) {
		double min = (double) list.get(0);
		for (int i = 0; i < list.size(); i++) {
			if ((double) list.get(i) < min) {
				min = (double) list.get(i);
			}
		}
		return min;

	}
}
