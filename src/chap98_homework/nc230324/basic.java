package chap98_homework.nc230324;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class basic {

	public static void main(String[] args) {
		/*Calendar 객체를 오늘날짜로 생성하세요.
		1. 객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
		2. 위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.
		 */
		
		Calendar today = Calendar.getInstance();
		today.set(2020, 4, 8);
		System.out.println(today.get(Calendar.YEAR) + "년 " + today.get(Calendar.MONTH)+ "월 " + today.get(Calendar.DATE)+ "일" );
		today.add(Calendar.YEAR, 5);
		today.add(Calendar.MONTH, 2);
		today.add(Calendar.DATE, 3);
		System.out.println(today.get(Calendar.YEAR) + "년 " + today.get(Calendar.MONTH)+ "월 " + today.get(Calendar.DATE)+ "일" );
	
		
		
		/*Calendar 객체를 오늘날짜로 생성하세요.
		 * 1. 오늘날짜를 2023-03-24 형식으로 출력하세요.
		 * 2. 오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.
		 */
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		
		

		Calendar today2 = Calendar.getInstance();
		today2.set(2023, 3, 24);
		
		Date d1 = new Date(today2.getTimeInMillis());
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d1);
		
		System.out.println(cal2.get(Calendar.YEAR)+ "년 " 
		+ cal2.get(Calendar.MONTH) + "월 " 
		+ cal2.get(Calendar.DATE) + "일 "
		+ cal2.get(Calendar.HOUR_OF_DAY) + "시 "
		+ cal2.get(Calendar.MINUTE) + "분 "
		+ cal2.get(Calendar.SECOND) + "초");
		
				

	}

}
