package chap11_interface.Device;

public interface Tv extends Display, Speaker{
	void changeChannel(int inputNum);
}
