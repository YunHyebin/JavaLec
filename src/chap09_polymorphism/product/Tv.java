package chap09_polymorphism.product;

public class Tv extends ElectronicDevice{
	public int lastChannel = 1;
	
	public void powerOn() {
		System.out.println("tv의 전원을 켭니다.");
		moveTo(lastChannel);
	}
	
	public void powerOff() {
		System.out.println("tv의 전원을 끕니다.");
	}
	
	public void moveTo(int channer) {
		System.out.println(channer + "로 이동합니다.");
	}
	
	public void channelUp() {
		lastChannel++;
	}
	public void channerDown() {
		lastChannel--;
	}
	public void operate(int channel) {
		lastChannel = channel;
		moveTo(channel);
	}

}
