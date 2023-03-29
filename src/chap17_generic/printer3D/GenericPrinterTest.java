package chap17_generic.printer3D;

public class GenericPrinterTest {

	public static void main(String[] args) {
		// Powder 형인 GenericPrinter 클래스 객체 생성 후 Powder 타입의 powderPrinter 변수에 저장
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getmaterial();
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getmaterial();
		System.out.println(plasticPrinter);
		
		// 대입된 자료형 명시하지 않을 때 강제형변환
		GenericPrinter powderPrinter2 = new GenericPrinter();
		powderPrinter2.setMaterial(new Powder());
		Powder powder2 = (Powder)powderPrinter2.getmaterial();
		System.out.println(powderPrinter2);
		
		// 3DPrinter는 물을 재료로 사용할 수 없음.
		// Material이란 추상클래스를 만들고 
		//그 인터페이스를 상속받은 클래스만 타입매개변수로 사용할 수 있게 하는
		//<T extends 클래스>를 사용함.
		
		
		
		
		
		

	}

}
