package chap98_homework.nc230320.animal;

public class Tiger extends Feline {
	public boolean climb;
	
	public Tiger(int age, int size, int legCnt, boolean hasWing, boolean pattern, boolean climb){
		super(age, size, legCnt, hasWing, pattern);
		this.climb = climb ;
	}
	
	public void isClimbing() {
		System.out.println("나무를 오른다");
	}

}
