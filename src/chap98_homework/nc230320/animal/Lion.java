package chap98_homework.nc230320.animal;

public class Lion extends Feline{
	public boolean group;
	
	public Lion(int age, int size, int legCnt, boolean hasWing, boolean pattern, boolean group) {
		super(age, size, legCnt, hasWing, pattern);
		this.group = group;
	}
	
	public void aroundInGroup() {
		System.out.println("무리지어 다닌다.");
	}

}
