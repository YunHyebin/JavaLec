package chap07_inherit.animal;

public class Bear extends Animal{
	public String color;
	
	public Bear(int age, int size, int legCnt, boolean hasWing, String color) {
		super(age, size, legCnt, hasWing);
		this.color = color;
		
	}
	
	public void walk() {
		System.out.println("걷는다.");
	}

}
