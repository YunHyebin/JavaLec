package chap04_controlStatement;

public class _01_ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 68;

		if (score >= 90)
			System.out.println("A학점");
		else if (score >= 80)
			System.out.println("B학점");
		else if (score >= 70)
			System.out.println("C학점");
		else if (score >= 60)
			System.out.println("D학점");
		else
			System.out.println("F학점");

		int lunchPrice = 10000;

		if (lunchPrice >= 10000) {
			System.out.println("너무 비싸다");
		} else if (lunchPrice >= 8000) {
			System.out.println("조금 비싸다");
		} else if (lunchPrice >= 6000) {
			System.out.println("적정하다");
		} else {
			System.out.println("싼 편이다.");
		}

	}

}
