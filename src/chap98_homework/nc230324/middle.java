package chap98_homework.nc230324;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class middle {

	public static void main(String[] args) {
		/*
		 * 1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에
		 *  add 메소드로 3일뒤로 변경하고 
		 *  yyyy-MM-dd 형식으로출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의 parse() 메소드를 이용하면 String-> Calendar로 변환가능)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("yyyy-MM-dd 형식 날짜 입력: ");
		String dateStr = sc.nextLine();
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date = sdf1.parse(dateStr);
			calendar.setTime(date);
			calendar.add(Calendar.DATE, 3);
			Date date2= calendar.getTime();
			System.out.println(sdf1.format(date2));
			
			
		}catch(ParseException e) {
			e.printStackTrace();
		}


		/*
		 * 2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의
		 * 요일을 한글로 출력하세요.
		 */
		String[] days = {"", "일요일", "월요일", "화요일", "수요일", "토요일", "금요일", "토요일"};
		System.out.print("yyyy-MM-dd 형식 날짜 입력: ");
		String dateStr2 = sc.nextLine();
		
		try {
			Date date = sdf1.parse(dateStr2);
			calendar.setTime(date);
			System.out.println("요일: " + days[calendar.get(Calendar.DAY_OF_WEEK)]);
			
			
		}catch(ParseException e) {
			e.printStackTrace();
		}
		

		


		//3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를 시 분 초 형태로 나타내시오.
		
		Calendar cal3 = Calendar.getInstance();
		cal3.set(2023, 3, 15, 20, 31, 45);
		
		
		// 두번째 날짜 데이터 cal -> date 형변환
		Calendar cal4 = Calendar.getInstance();
		cal4.set(2021, 7, 8, 11, 58, 04);
		
		long diff = cal3.getTimeInMillis() - cal4.getTimeInMillis();
		
		long hour = ((long)1000 * 60 * 60);
		long min = diff % ((long)1000 * 60 * 60)/ (1000* 60);
		long sec = diff % ((long)1000*60*60*60) / 1000;
		
		
		
		System.out.println(hour + "시 " + min + "분 " + sec + "초가 지났습니다." );
		

		

	}

}
