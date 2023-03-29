package chap07_inherit.animal;

public class Whale extends Animal {
	public String color;
	public String type;
	public int teeth;
	
	public Whale(String color, String type, int teeth, int age, int size, int legCnt, boolean hasWing) {
		super();
		this.color = color;
		this.age = age;
		this.legCnt = legCnt;
		this.size = size;
		this.hasWing = hasWing;
		this.type = type;
		this.teeth = teeth;
	}
	
	public void cry() {
		System.out.println("고래가 웁니다.");
	}
	
	
	
	

}
