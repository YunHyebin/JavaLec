package chap99_etc;

public class _02_countKorean {

	public static void main(String[] args) {
		String str = "가A나B다C라";
		String result = "";
		int kCnt = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (((int) ch >= 44032) && ((int) ch <= 55203)) {
				result += ch;
				kCnt++;
			}

		}
		System.out.println(result);
		System.out.println(kCnt);

	}

}
