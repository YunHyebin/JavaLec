package chap10_abstract.product;

abstract public class Tv {
	public int lastChannel = 1;
	
	//----------추상 메소드
	// 전원을 켜다 
	// 선언부만 정의하고 구현부는 자식클래스에서 정의
	public abstract void powerOn();
	
	public abstract void powerOff();
	
	public abstract void operate(int channel);

	public void moveTo(int channer) {
		System.out.println(channer + "로 이동합니다.");
	}
	public void channelUp() {
		lastChannel++;
	}
	public void channerDown() {
		lastChannel--;
	}

}
