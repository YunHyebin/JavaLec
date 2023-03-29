package chap13_objectArray;

import chap13_objectArray.clazz.Lecture;

public class _01_objectArray {

	public static void main(String[] args) {
		// 객체배열 선언
		Lecture[] lecArr = new Lecture[3];
		
		// 객체배열 초기화
		lecArr[0] = new Lecture("자바", 30, 50);
		lecArr[1] = new Lecture("c언어", 29, 45);
		lecArr[2] = new Lecture("파이썬", 45, 60);
		
		try {
			for(int i=0; i<lecArr.length; i++) {
				lecArr[i].proceedLecture();
			}	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//for문을 이용한 객체배열의 사용
		for(int i=0; i<lecArr.length; i++) {
			lecArr[i].proceedLecture();
		}
		
		
		

	}

}
