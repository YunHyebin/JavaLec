package chap98_homework.nc230324;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class advanced {

	public static boolean isLeap(int year) {
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1. 2001년 12월 19일이 결혼기념일인 부부가 있다. 
	    윤년이 있는 년도에는 결혼기념일의 날짜를 하루씩 더하기로 했다.
	    2022년의 결혼기념일 날짜를 구하세요.*/
		
		
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2001, 12, 19);
		for (int i=0; i < 20; i++) {
			cal1.add(Calendar.YEAR, 1);
			if (isLeap(cal1.get(Calendar.YEAR))){
				cal1.add(Calendar.DATE, 1);
			}
		}
		System.out.println("2022년 결혼기념일: " 
		+ cal1.get(Calendar.YEAR) + "년" + cal1.get(Calendar.MONTH) + "월" + cal1.get(Calendar.DATE));
		
		
		

	/*2. 사용자 입력한 문자열에서 연속된 동일한 문자를 찾고
	     연속된 동일한 문자를 발견했을 때 하나빼고 다 제거하여
	     출력하세요. (단, 대소문자 구분함. StringBuilder를 사용하세요.)
	     ex) aabbcdeffaaaaynguuuuuu -> abcdefayngu*/
	    
	/*
	 * 3. 사용자가 두 개의 날짜(yyyy-MM-dd 형식)를 입력하고 입력받은 두 날짜 사이의 날짜를 모두 출력하세요. (Calendar
	 * 클래스를 사용하세요). ex) 2023-01-29 2023-02-05 입력 출력 2023-01-29 2023-01-30 2023-01-31
	 * 2023-02-01 2023-02-02 2023-02-03 2023-02-04 2023-02-05
	 */

	}

}
