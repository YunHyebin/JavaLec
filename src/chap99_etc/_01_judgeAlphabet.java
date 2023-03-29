package chap99_etc;

import java.io.IOException;

public class _01_judgeAlphabet {

	public static void main(String[] args) throws IOException { // 예외처리 던져라
		// TODO Auto-generated method stub
		//1. 사용자 입력 값 받기
		//read(): int 타입의 값을 반환하고 입력값을 문자로 인식 따라서 무조건 리턴되는 int 타입의 값은 문자의 unicode가 나오게 됨(10진수)
// 		int inputUni = System.in.read();

		System.out.print("영문자 하나를 입력하세요.: ");
		int inputUni = System.in.read();
		if(inputUni >= 65 && inputUni <= 90) {
			System.out.println("대문자입니다");
			System.out.println((char)inputUni);
			// 대문자로 들어왔을 때는 해당문자를 소문자로 변경해서 출력
			char output = (char)(inputUni + 32);
			System.out.println(output);
		} else if(inputUni >=97 && inputUni <= 122) {
			System.out.println("소문자입니다");
			System.out.println((char)inputUni);
			char output2 = (char)(inputUni - 32);
			System.out.println(output2);
			// 소문자로 들어왔을 때 해당문자를 소문자로 변경해서 출력
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}

}
