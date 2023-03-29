package chap04_controlStatement;

public class _09_duplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 삼각형 별 찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		for (int i = -5; i <= 5 ; i++) {
			for (int j = 4; j >= 0; j--) {
				if (i >= j) {
					System.out.print("*");
				} else {
					System.out.println(" ");
				}
			}
			System.out.println();
		}
//
//		for (int i = 5; i > 0; i--) {
//			for (int j = 0; j < 5; j++) {
//				if (i > j) {
//					// System.out.println(i + ","+ j);
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				System.out.print("*");
//			}
//			System.out.print(" ");
//		}
//		System.out.println(" ");

//		for (int i = 5; i >= 0; i--) {
//			for (int j = 1; j >= 4; j++)
//				System.out.println(" ".repeat((j)) + "*".repeat(i));
//		}

//		}

			for (int i = 5; i > 0; i--) {
				for (int j = 5; j > 0; j--) {
					System.out.print(" ");
					if (i >= j) {
						// System.out.println(i + ","+ j);
						System.out.print("*");
					}
				}
				System.out.println();
//		}
			}
		}
	}
}
