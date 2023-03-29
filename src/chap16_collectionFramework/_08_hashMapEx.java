package chap16_collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class _08_hashMapEx {
	static HashMap phoneBook = new HashMap();

	public static void main(String[] args) {
		

	
		
		
		
		
	} //main 함수 종료
	
	
	
	
	
	
	// 그룹에 전화번호 추가하는 메소드
	static void addPhoneNum(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
		
	}
	
	// 전화번호만 추가하는 메소드
	static void addPhoneNum(String name, String tel) {
		addPhoneNum("기타", name, tel);
	}
	
	// 그룹을 추가하는 메소드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
		
	}
	
	// 전화번호부 전체 출력하는 메소드
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			System.out.println("*" + e.getKey() + "[" + subSet.size() + "]");
			
			while(SubIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next());
			}
			
		}
		
	}
	
	
	
	
	
	
	

}
