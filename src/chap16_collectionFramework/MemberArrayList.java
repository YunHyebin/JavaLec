package chap16_collectionFramework;

import java.util.ArrayList;

public class MemberArrayList {

	// Member클래스 타입 지정한 ArrayList 선언
	private ArrayList<Member> arrayList;

	// Member 형으로 선언한 ArrayList 객체 생성하는 생성자?
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); 
	}
	

	// ArrayList에 회원을 추가하는 메소드
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// 해당 아이디를 가진 회원을 ArrayList에서 찾아 제거하는 메소드
	public boolean removeMember(int memberId) {
		for (int i = 0; i < arrayList.size(); i++) {
			// get 메소드로 회원을 순차적으로 가져옴
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			// 회원 아이디가 매개변수와 일치하면 해당 회원 삭제
			if (tempId == memberId) {
				arrayList.remove(i);
				return true;
			}
		}
		// 반복문이 끝날 때까지 해당 아이디를 못찾은 경우
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {
		for (Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}

}
