package chap10_abstract.product;

public class LgTv extends Tv {
	public void powerOn() {
		System.out.println("Lg tv 켬");
	}

	public void powerOff() {
		System.out.println("Lg tv 끔");
	}

	public void operate(int channel) {
		System.out.println("Lg tv 채널 " + channel + "로 변경");
		super.lastChannel = channel;
	}
}
