package chap98_homework.nc230314;

public class _06_advanceif {

	public static void main(String[] args) {
// 나의 방법
		String str = "dBEfIZ";
		String prStr = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			char convertch;
			if (ch >= 'A' && ch <= 'Z') {
				if ((ch + 33) > 'z') {
					convertch = (char)(('a' - 1) + ((ch + 33) - 'z'));
				} else {
					convertch = (char)(ch + 33);
				}
			} else {
				if ((ch - 33) < 'A') {
					convertch = (char)(('Z' + 1) - ('A' - (ch - 33)));
				} else {
					convertch = (char)(ch - 33);
				}
			}
			prStr = convertch + prStr;
		}
		System.out.println(prStr);

//				char convertCh = ch >= 'A' && ch <= 'Z'
//						? (ch + 33) > 'z' ? (char) (('a' - 1) + ((ch + 33) - 'z')) : (char) (ch + 33)
//						: (ch - 33) < 'A' ? (char) (('z' + 1) - ('A' - (ch - 33))) : (char) (ch - 33);
//
//				prStr = convertCh + prStr;

	}
}
