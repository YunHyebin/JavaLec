package chap98_homework.nc230323._advanced;

import java.util.Scanner;

public interface Student {
	Scanner sc = new Scanner(System.in);
	default void saveInfo(int sno, StringBuffer name, String subject ) {
		System.out.println("------[[기본정보 입력]]--------");
		System.out.print("학번: ");
		System.out.print("이름: ");
		System.out.print("학과: ");
	}
	
	default void saveSubjectInfo(String subject, int finalExam) {
		System.out.println("------[[과목정보 입력]]--------");
		System.out.print("과목을 입력하세요: ");
		System.out.print("점수를 입력하세요: ");
	}
	
	
	
	default void printInfo() {
		System.out.println("------[[학생정보 검색]]--------");
		System.out.println("학번: ");
		System.out.println("이름: ");
		System.out.println("학과: ");
		System.out.println("평균점수: ");
	}
	double getAvg();

}
