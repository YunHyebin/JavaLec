package chap98_homework.nc230320.animal;

public class Feline extends Mammalia{
	public boolean pattern;
	
	public Feline(int age, int size, int legCnt, boolean hasWing, boolean pattern) {
		super(age, size, legCnt, hasWing);
		this.pattern = pattern;
		
	}
	
	public void isGrooming() {
		System.out.println("그루밍을 합니다.");
	}

}
