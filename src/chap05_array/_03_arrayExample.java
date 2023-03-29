package chap05_array;

public class _03_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] chArr = {'B', 'c', 'T', 'P', 'p', 'i'};
		char [] convertArr = new char[6];
		
		//소문자는 대문자로, 대문자는 소문자로 변경
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 65 && chArr[i] <=90) {
				convertArr[i] = (char)((int)chArr[i] + 32);	
			}
			if (chArr[i] >= 97 && chArr[i] <=122) {
				convertArr[i] = (char)((int)chArr[i] - 32);	
			}
		}
		
		// 강사님 방법
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] >= 'A' && chArr[i] <= 'Z') {
				convertArr[i] = (char)(chArr[i] + 32);	
			}
			if (chArr[i] >= 'a' && chArr[i] <='z') {
				convertArr[i] = (char)(chArr[i] - 32);	
			}
		}
		
		for (int i = 0; i < convertArr.length; i++) {
			System.out.print(convertArr[i]);
		}

	}

}
