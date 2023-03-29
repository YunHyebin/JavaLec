package chap98_homework.nc230315;

public class _13_advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3. AB + BA = 99 를 만족하는 모든 A와 B의 조합을 구하는 프로그램을 작성하세요.
		// 두 숫자를 문자로 변환한 후 결합 -> 다시 정수로 형변환 -> 정수로 캐스팅한 값을 99와 값이 맞는지 조건따져본 후 맞으면 출력
		String AB, BA;
		int ab, ba;
		for (int A = 0; A < 10; A++) {
			for (int B = 0; B < 10; B++) {
				AB = Integer.toString(A) + Integer.toString(B);		BA = Integer.toString(B) + Integer.toString(A);
				ab = Integer.parseInt(AB); 							ba = Integer.parseInt(BA);
				if (ab + ba == 99) {
					System.out.println(AB + "+" + BA + "=" + (ab + ba));
				}

			}
		}
	}

}
