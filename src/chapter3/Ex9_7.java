package chapter3;

public class Ex9_7 {
	public static void main(String[] args) {
		int num1 = true ? 1 : 2;
		int num2 = false ? 1 : 2;
		
		System.out.println(num1);
		System.out.println(num2);
		
		boolean button = true;
		
		String status = button ? "���� �������ϴ�" : "���� �������ϴ�";
		
		System.out.println(status);
	}
}
