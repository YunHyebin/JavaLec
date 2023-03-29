package chap98_homework.nc230315;

public class _08_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. 1000이하의 자연수 중에서 
		//2의 배수이면서 7의 배수인 숫자를 출력하고,
		  //그 출력된 숫자들의 합을 구하는 프로그램을 작성하세요
		int i = 0;
		int sum = 0;
		while (i <=1000) {
			i++;
			if (i % 2 == 0 && i % 7 == 0) {
				System.out.println("2의 배수이면서 7의 배수: " + i);
				sum += i;
			}
		}
		System.out.println("2와 7의 공배수들 합: " + sum);

	}

}
