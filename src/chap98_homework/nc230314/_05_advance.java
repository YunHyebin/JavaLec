package chap98_homework.nc230314;

public class _05_advance {

	public static void main(String[] args) {
		System.out.println("\n----------------------advanced 문제1----------------");
		String str = "ajEfcC";
		String capStr = "";
		String resultASC = "";
		String resultDESC = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
//			boolean aa = (1==1)? true : (2==1)? true : false; // 삼항연산식

			char capch = (char) (((int) ch - 33 >= 65 && (int) ch - 33 <= 122) ? (int) ch - 33
					: (int) ch - 33 + 66 > 122 ? (int) 'a' : (int) ch - 33 + 66);
			resultASC = resultASC + capch;
		}
//		System.out.println(resultASC); // 1차 변환된 값 CcfEja 출력
		for (int i = resultASC.length() - 1; i >= 0; i--) {
			resultDESC += resultASC.charAt(i);
		}
		System.out.println(resultDESC); // 2차 역순정렬 값 ajEfcC 출력 dBEfIZ
	}

}
