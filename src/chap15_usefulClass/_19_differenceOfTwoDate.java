package chap15_usefulClass;

import java.util.Calendar;

public class _19_differenceOfTwoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar d1 = Calendar.getInstance();	// 오늘 날짜
		Calendar d2 = Calendar.getInstance();	// 날짜 세팅
		
		d2.set(2011, 3, 11);
		
		//getTimeInMill() : long 타입으로 지정된 날짜를 밀리세턴드로 반환
		
		long totalSec = d1.getTimeInMillis() - d2.getTimeInMillis();
		System.out.println("d2부터 d1까지 " + totalSec / 1000 +  "초가 지났습니다"); //단위를 초로 바꿈
		System.out.println("d2부터 d1까지 " + (totalSec / (1000*60))  +  "분이 지났습니다"); //단위를 분으로 바꿈
		System.out.println("d2부터 d1까지 " + (totalSec / (1000*60*60))  +  "시간이 지났습니다"); //단위를 분으로 바꿈
		System.out.println("d2부터 d1까지 " + (totalSec / (1000*60*60*24))  +  "일이 지났습니다"); //단위를 분으로 바꿈
		System.out.println("d2부터 d1까지 " + (totalSec / ((long)1000*60*60*24*30))  +  "달이 지났습니다"); //단위를 분으로 바꿈
		System.out.println("d2부터 d1까지 " + (totalSec / ((long)1000*60*60*24*30*12))  +  "년이 지났습니다"); //단위를 분으로 바꿈
		
		long year = (long)1000*60*60*24*30*12;
		totalSec %= (long)1000*60*60*24*30*12;
		long month = ((long)1000*60*60*24*30);
		totalSec %= ((long)1000*60*60*24*30));
		long date = totalSec / 60;
		totalSec -= date;
		long hour = totalSec / 24;
		totalSec -= hour;
		long min = totalSec /60;
		totalSec -= min;
		long sec = totalSec / 1000;
		
		System.out.println(year + "년 " + month + "달 " + date + "일" + hour + "시" +min+ "분" +sec+ "초 지났습니다.");
		
		

	}

}
