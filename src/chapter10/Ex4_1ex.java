package chapter10;

public class Ex4_1ex {
	void justPlus() {
		System.out.println(10 + 20);
	}
	
	void intPlus(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	
	void compareHigher(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	
		
	}
	
	// 10 과 11 중 큰 수를 출력하세요.
	void compareInt() {
		int num1 = 11;
		int num2 = 10;
		
		if(num1 > num2 ) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Ex4_1ex ex1 = new Ex4_1ex();
		
		ex1.justPlus();
		ex1.intPlus(10, 20);
		ex1.compareHigher(10, 20);
		ex1.compareInt();
		
		
		
	}
}
