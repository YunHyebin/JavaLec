package chap16_collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _06_hashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Set<String> strSet = new Set<String>(); 불가능
		// 왜냐하면 Set은 인터페이스이므로 객체 생성이 불가능함	
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("Java");
		strSet.add("JDBC");
		strSet.add("JavaScript");
		strSet.add("HTML/CSS");
		
		// 중복값 저장
		strSet.add("JDBC");
		strSet.add("Java");
		strSet.add("React.js");
		
		System.out.println("strSet의 크기 : " + strSet.size());
		
		Iterator<String> it = strSet.iterator();
		// Iterator로 꺼내올 때 set은 순서가 없어서 무작위로 꺼내옴.
		
		
		int idx = 0;
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(idx++ + " : " + str);
			if(str.equals("HTML/CSS")) {
				System.out.println(idx++ + " : " + str);
			}
		}
		strSet.remove("JDBC");
		System.out.println("strSet의 크기 : " + strSet.size());
		System.out.println(strSet);
		
		strSet.clear();
		if(strSet.isEmpty()) {
			System.out.println("strSet은 비었습니다. 요소 없음");
		}else {
			System.out.println("strSet은 비워져있지 않습니다. 요소 있음");
		}
		

	}

}
