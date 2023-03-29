package chap99_etc;

import java.io.IOException;

public class _02_printAlphabet {

	public static void main(String[] args) throws IOException { // 예외처리 던져라
		// TODO Auto-generated method stub
		//1. 사용자 입력 값 받기
		System.out.print("영문자 하나를 입력하세요.: ");
		int inputUni = System.in.read();

		if(inputUni >= 65 && inputUni <= 90) {
			System.out.println("대문자입니다");
			// 대문자로 들어왔을 때는 해당문자를 소문자로 변경해서 출력
			// 1. 입력된 문자가 대문자면 입력된 문자부터 대문자 z까지 출력
			// 2. 대문자 a부터 입력된 문자까지 출력
			for (int UniZ = inputUni; UniZ <= 90; UniZ++) {
				System.out.print((char)UniZ);
			}
		} else if(inputUni >=97 && inputUni <= 122) {
			System.out.println("소문자입니다");
			// 1. 입력된 문자가 소문자면 입력된 문자부터 소문자 z까지 출력
			// 2. 소문자 a부터 입력된 문자까지 출력
			for (int Uniz = inputUni; Uniz <= 122; Uniz++) {
				System.out.print((char)Uniz);
			}
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		
	}

}
