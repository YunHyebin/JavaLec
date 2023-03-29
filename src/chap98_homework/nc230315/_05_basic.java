package chap98_homework.nc230315;

public class _05_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5. 1 ~ 100까지 합을 do ~ while문으로 출력
		int i = 1;
		int result = 0;
		do {
			result += i;
			i++;
		} while(i <= 100);
		
		System.out.println(result);

	}

}
