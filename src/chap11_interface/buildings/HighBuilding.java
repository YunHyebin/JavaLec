package chap11_interface.buildings;

//인터페이스를 상속받아 추상메소드 중 일부만 구현하려면 추상클래스로 선언한다.
// 클래스가 인터페이스를 상속받을 때는 implements 키워드를 받아 사용한다.
public class HighBuilding implements Building{
	@Override
	public void turnOnAircon() {
		System.out.println("에어컨을 가동하다");
	}

	@Override
	public void build() {
		System.out.println("건물을 짓다.");
		
	}

	@Override
	public void turnOffAircon() {
		System.out.println("에어컨을 끄다");
		
	}
	@Override
	public int getParkingPrice(int time) {
		int totalprice = time + 1000;
		return totalprice;
	}
	
	
}
