package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _05_linkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList와 LinkedList 속도비교
		
		// 순차적 데이터 넣기
		List<String> aList = new ArrayList<String>();
		List<String> bList = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		
		for(int i=0; i <1000000; i++) {
			aList.add(String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("ArrayList에 순차적으로 데이터를 추가하는데 걸린 시간"
		+ (endTime-startTime) + "나노초 입니다");
		System.out.println("------------------------");
		
		// contains 메소드 속도 비교;
		System.out.println(aList.contains("900000"));
		
		startTime = System.nanoTime();
	
		
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 값 900000을 찾는데 걸린 시간"
		+ (endTime-startTime) + "나노초 입니다");
		System.out.println("------------------------");
		
		//get(int index) 메소드 속도 비교
		System.out.println(AList.get("80000"));
		
		startTime = System.nanoTime();
	
		
		endTime = System.nanoTime();
		System.out.println("ArrayList에서 인덱스 800000을 찾는데 걸린 시간"
		+ (endTime-startTime) + "나노초 입니다");
		System.out.println("------------------------");
		
		// list 중간에 값 속도 추가
		
		
		
		
		
		
		
		
		
		
	}

}
