package chap98_homework.nc230329.casting;

public class Casting05 {

	public static void main(String[] args) {
//		5. int형 변수 iNum = 10과 long형 변수 lNum = 20의 값을 서로 교환하세요.
		
		int iNum = 10;	
		long lNum = 20L;
		
		System.out.println("교환 전");
		System.out.println(lNum == iNum);
		 
		//참조변수를 통한 값 교환
		Integer numInteger = (int)lNum;
		Long numLong =(long)iNum;
		iNum = numInteger;
		lNum = numLong;
		
		System.out.println("iNum의 결과: " + iNum + "\nlNum의 결과: " + lNum);
		System.out.println("교환 후");
		System.out.println(lNum == iNum);
		
		

	}

}
