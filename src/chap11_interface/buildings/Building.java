package chap11_interface.buildings;

public interface Building {
	// 모든 변수는 자동으로 상수화됨
	String price = "expensive"; 	// 초기화를 꼭 해야 상수화로 됨 즉, 초기화안하면 에러남
	int floors = 120;

	// 모든 메소드는 자동으로 추상화됨
	void build();
	void turnOnAircon();
	void turnOffAircon();
	int getParkingPrice(int time);
	
	

}
