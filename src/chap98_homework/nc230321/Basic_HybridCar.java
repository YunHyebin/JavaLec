package chap98_homework.nc230321;

public class Basic_HybridCar implements Basic_ElectronicCar, Basic_FuelCar{

	@Override
	public void speedUp() {
		System.out.println("하이브리드 속도 증가");
	}

	@Override
	public void speedDown() {
		System.out.println("하이브리드 속도 하락");
	}

	@Override
	public void addFuel() {
		System.out.println("하이브리드 기름 충전");
	}

	@Override
	public void charge() {
		System.out.println("하이브리드 배터리 충전");
	}

}
