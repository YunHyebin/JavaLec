package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {
	public static void main(String [] args) {
		List<Integer> intList = new ArrayList<Integer>();
		for(int i=0; i < 10; i++) {
			intList.add(i + 1);
		}
//		System.out.println(_04_genericEx01.<Integer>getEven(intList));
		List<Integer> resultArr = _04_genericEx01.<Integer>getEven(intList);
		System.out.println(resultArr);
		
		
		
		
		
		
	}
	
	// 짝수 숫자만 리턴하는 메소드
	//Number를 상속받는 T
	// 리턴타입 List<T>
	// 함수명 getEven
	// 매개변수 List<T> list
	public static <T extends Number> List<T> getEven(List<T> list){
		List<T> resultList = new ArrayList<T>();
		for (T t : list) {
			if(t.intValue() % 2 ==0) {
				resultList.add(t);
			}
		}
		return resultList;		
	}
	

}
