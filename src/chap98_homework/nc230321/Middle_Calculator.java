package chap98_homework.nc230321;

public class Middle_Calculator {
	public class Add {
		private int num1;
		private int num2;

		public int getNum1() {
			return num1;
		}

		public void setNum1(int num1) {
			this.num1 = num1;
		}
		
		public int getNum2() {
			return num2;
		}
		public void setNum2(int num2) {
			this.num2 = num2;
		}

		public int add() {
			return num1 + num2;
		}
	}

	public class Substitude {
		private int num3;
		private int num4;

		public int getNum3() {
			return num3;
		}

		public void setNum3(int num3) {
			this.num3 = num3;
		}

		public int getNum4() {
			return num4;
		}

		public void setNum4(int num4) {
			this.num4 = num4;
		}

		public int sub() {
			if (num3 >= num4) {
				return num3 - num4;
			} else {
				return num4 - num3;
			}
		}
	}

	public class Multiply {
		private int num5;
		private int num6;

		public int getNum5() {
			return num5;
		}

		public void setNum5(int num5) {
			this.num5 = num5;
		}

		public int getNum6() {
			return num6;
		}

		public void setNum6(int num6) {
			this.num6 = num6;
		}

		public int mul() {
			return num5 * num6;
		}

	}

	public class Divide {
		private int num7;
		private int num8;
		public int getNum7() {
			return num7;
		}
		public void setNum7(int num7) {
			this.num7 = num7;
		}
		public int getNum8() {
			return num8;
		}
		public void setNum8(int num8) {
			this.num8 = num8;
		}
		public int div() {
			if(num7 >= 8) {
				return num7/num8;
			}else {
				return num8/num7;
			}
		}
	}

}
