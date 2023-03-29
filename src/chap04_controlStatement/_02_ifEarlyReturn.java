package chap04_controlStatement;

public class _02_ifEarlyReturn {

	public static void main(String[] args) {
		/*
		 * ifEarlyReturn 방법 if (score >= 90) grade = "A학점"; if (score >= 80) grade =
		 * "B학점"; if (score >= 70) grade = "C학점"; if (score >= 60) grade = "D학점"; if
		 * (score < 60) grade = "F학점";
		 * 
		 * // 중첩조건문 if (score >= 90) { if (score >= 95) grade = "A+"; else grade = "A";
		 * }
		 */
		int lunchPrice = 10000;
		String str = getFeeling(lunchPrice);
		System.out.println(str);
	}

	public static String getGrade(int a) {
		String Grade = "";
		if (a >= 90)
			if (a >= 95)
				Grade = "A+";
		Grade = "A0";
		if (a >= 80)
			if (a >= 85)
				Grade = "B+";
		Grade = "B0";
		if (a >= 70)
			if (a >= 75)
				Grade = "C+";
		Grade = "C0";
		if (a >= 60)
			if (a >= 65)
				Grade = "D+";
		Grade = "D0";
		return Grade;

	}

	public static String getGrade() {
		int score = 76;
		if (score >= 90) {
			return "A"; // return하면 getGrade가 바로 종료됨
		}
		return "A가 아님";
	}

	public static String getFeeling(int price) {
		if (price >= 10000)
			return "너무 비싸다";
		return getFeeling2(price);
	}

	public static String getFeeling2(int price) {
		if (price >= 8000) 
			return "조금 비싸다";
		return "적정하거나 싼편이다.";
	}

}


