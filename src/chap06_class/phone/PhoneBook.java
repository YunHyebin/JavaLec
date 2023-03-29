package chap06_class.phone;

import java.util.Scanner;

public class PhoneBook {
	// 멤버변수
	String[] name = new String[100];
	String[] phoneNum = new String[100];
	int index = 0; // 배열의 현재 인덱스를 담고있는 변수

	// 생성자
	public PhoneBook() {
		choiceMenu();
	}

	Scanner sc = new Scanner(System.in);

	// 메뉴 선택 메소드
	public void choiceMenu() {
		boolean run = true;
		while (run) {
			System.out.println("\n-------[[전화번호부 프로그램]]---------");
			System.out.println("1.정보입력\n2.모든 정보 출력\n3.인덱스로 정보 검색\n4.종료");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				insertPhoneNum();
				break;
			case 2:
				printAllPhoneNum();
				break;
			case 3:
				printPhoneNum();
				break;
			case 4:
				run = false;
				break;
			}
		}
	}

	// 전달받은 이름과 전화번호를 저장하는 메소드
	public void insertPhoneNum() {
		System.out.println("\n-------[[전화번호부 정보 입력]]--------");
		System.out.print("이름 입력: ");
		String inputName = sc.next();
		System.out.println("번호 입력: ");
		String inputPhoneNum = sc.next();
		this.name[index] = inputName;
		this.phoneNum[index] = inputPhoneNum;
		index++;
	}

	// 저장된 모든 이름과 전화번호를 출력하는 메소드
	public void printAllPhoneNum() {
		System.out.println("\n------[[저장된 전화번호부 목록]]------");
		for (int i = 0; i < index; i++) {
			System.out.println("이름: " + this.name[i] + "\t전화번호: " + this.phoneNum[i]);
		}
	}

	// 전달받은 번호(인덱스)의 해당하는 이름과 전화번호를 출력하는 메소드
	public void printPhoneNum() {
		System.out.println("\n------[[특정 전화전호부 정보 찾기]]------");
		System.out.print("전화번호부 인덱스 번호 입력: ");
		int inputIndex = sc.nextInt();
		if (inputIndex >= index) {
			System.out.println("해당 번호에는 저장된 정보가 없습니다.");
		} else {
			System.out.println("이름: " + this.name[inputIndex] + "\t전화번호: " + this.phoneNum[inputIndex]);
		}
	}
}
