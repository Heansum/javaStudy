package chapter3;

public class Ex9_7 {
	public static void main(String[] args) {
		int num1 = true ? 1 : 2;
		int num2 = false ? 1 : 2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		boolean button = true;
		
		String status = button ? "불이 켜졌습니다" : "불이 꺼졌습니다";
		
		System.out.println(status);
	}
}
