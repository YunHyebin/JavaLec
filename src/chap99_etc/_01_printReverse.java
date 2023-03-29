package chap99_etc;

public class _01_printReverse {

	public static void main(String[] args) {
		String str = "abcDeF";
		//fedCBA
		
		//대소문자 변환된 문자열
		String capStr = "";
		for(int i =0; i <str.length(); i++) {
			char ch = str.charAt(i);
			
			char capCh = (ch >= 'A' && ch <= 'Z')?
					(char)((int)ch + 32) : 
					(char)((int)ch - 32);
			capStr = capCh + capStr;
		}
		
		System.out.println(capStr);
//		// 반대로 출력
//		for(int i = capStr.length() - 1; i >= 0; i--) {
//			System.out.print(capStr.charAt(i));
		}
		
	}

