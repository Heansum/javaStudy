package chapter3;

public class Ex8 {
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1++);
		
		num1 = num1 + 10;
		System.out.println(++num1);
		
		num1 = num1 - 7;
		System.out.println(--num1);
		
		num1 = num1 * 2;
		System.out.println(num1--);
		
		double fNum = num1 / 4.0;
		System.out.println(--fNum);
		
		num1 = num1 % 12;
		System.out.println(++num1);
	}
}
