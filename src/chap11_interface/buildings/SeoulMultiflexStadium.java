package chap11_interface.buildings;

import chap11_interface.multiInherit.multiflexStadium;

// multiflexStidimu이 스타디움과 콘서트 홀의 형태를 가지고 있기 때문에
// 서울 멀티플렉스스타디움도 경기장과 콘서트홀의 형태을 가질 수 있다.
// 스타디움 타입의 변수나 콘서트홀 타입의 변수로도 사용 가능하다.
public class SeoulMultiflexStadium implements multiflexStadium{

	@Override
	public void printSchedule(int month) {
		System.out.println(month +"월에 예정된 콘서트는 수원 대 서울입니다.");
		
	}

	@Override
	public int getTicketPrice(int people) {
		return people * 7000;
		
	}

	@Override
	public void getSportsSchedule(int month) {
		System.out.println(month +"월에 예정된 경기는 수원 대 서울입니다.");
		
	}

	@Override
	public int getSportsTicketPrice(int people) {
		return people * 7000;
	}

	@Override
	public void getRemainSeat() {
		System.out.println("남아있는 총 좌석은 총 1000자리 입니다.");
		
	}

	@Override
	public void getSupportersItem(int people) {
		System.out.println(people + "명의 아이템 구매 가격은" + (people * 15000) + "원 입니다.");
		
	}

	@Override
	public void playSportsAndConcert() {
		// TODO Auto-generated method stub
		System.out.println("수원 대 서울 경기에서 싸이콘서트도 동시에 진행될 예정입니다.");
		
	}
	

}
