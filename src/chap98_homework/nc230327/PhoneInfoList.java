package chap98_homework.nc230327;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneInfoList {
	//3. 16일 숙제였던 PhoneInfo를 List<Map<String, String>>이용하여 재구성하세요.

	// phoneInfo 클래스 타입 phoneList 선언
	private List<Map<String, String>> phoneList;
	
	
	// phoneList에 PhoneInfo map 생성하여 넣는 생성자
	public PhoneInfoList() {
		phoneList = new ArrayList<Map<String, String>>();
	}
	
	// 정보 추가
	public void addData() {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		
		// 객체 생성 & 객체 필드에 접근하여 map에 저장 후 phoneList에 저장
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.println("번호 입력: ");
		String number = sc.next();
		PhoneInfo phoneInfo = new PhoneInfo(name, number);
		map.put("이름", phoneInfo.getName());
		map.put("번호", phoneInfo.getPhoneNum());
		phoneList.add(map);	
	}
	
	// 모든 정보 출력 메소드
	public void showAllInfo() {
		for(int i=0; i<phoneList.size(); i++) {
			System.out.println(phoneList.get(i));
			
			
		}
	}
	
}
