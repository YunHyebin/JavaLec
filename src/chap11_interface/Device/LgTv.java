package chap11_interface.Device;

public class LgTv implements Tv{

	@Override
	public void sound() {
		System.out.println("Lg티비 소리킴");
		
	}

	@Override
	public void show() {
		System.out.println("Lg티비 화면킴");
		
	}

	@Override
	public void powerOn() {
		System.out.println("Lg티비 전원 킴");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Lg티비 전원 끔");
		
	}

	@Override
	public void changeChannel(int inputNum) {
		System.out.println("Lg티비 채널 변경" + inputNum);
		
	}

}
