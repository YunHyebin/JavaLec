package chap11_interface.Device;

public class SamsungTv implements Tv{

	@Override
	public void sound() {
		System.out.println("Samsung티비 소리남");
		
	}

	@Override
	public void show() {
		System.out.println("Samsung티비 화면 보임");
		
	}

	@Override
	public void powerOn() {
		System.out.println("Samsung티비 전원 킴");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung티비 전원 끔");
		
	}

	@Override
	public void changeChannel() {
		System.out.println("Samsung티비 채널 변경");
		
	}

	@Override
	public void changeChannel(int inputNum) {
		// TODO Auto-generated method stub
		
	}

}
