package chap16_collectionFramework;

public class Member {
	private int memberId;			// 회원 아이디
	private String memberName;		// 회원 이름
	
	
	// 매개변수 생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}


	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String toString() {
		return "회원 이름: " + memberName + "\t회원 아이디: " + memberId;
	}
	

}
