package chapter2;

public class Ex7 {
	public static void main(String[] args) {
		int num1 = 20;
		double num2 = 17.3149;
		
		// 형 변환 시 그 명령을 내린 줄에서만 적용된다
		System.out.println((double)num1);
		System.out.println((int)num2);
		
		double num3 = (double) num1;
		int num4 = (int) num2;
		
		System.out.println(num3);
		System.out.println(num4);
	}
}
