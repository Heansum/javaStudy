package chapter4;

public class Ex20 {
	public static void main(String[] args) {
//		System.out.println(12 / 0);
//		
//		System.out.println(12.0 / 0.0);
		
		// 32,767
		short a = 32_767;
		short b = 1;
		
		int c = a + b;
		System.out.println(c);
	}
}
