package chap98_homework.nc230320.animal;

public class Mammalia {
	public int age;
	public int size;
	public int legCnt;
	public boolean hasWing;
	
	public Mammalia(int inputAge, int inputSize, int inputLegCnt, boolean inputHasWing) {
		this.age = inputAge;
		this.size = inputSize;
		this.legCnt = inputLegCnt;
		this.hasWing = inputHasWing;
	}

	public void giveBirth() {
		System.out.println("새끼를 낳습니다.");
	}
}
