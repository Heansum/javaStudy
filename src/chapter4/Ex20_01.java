package chapter4;

public class Ex20_01 {
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		// 1,000,000 (1�鸸)
		numbers.num1 = 1_000_000;
		numbers.num2 = numbers.num1;
		
		// 1�鸸 * 1�鸸 = 1,000,000,000,000 (1��?)
		long var = numbers.num1 * numbers.num2;
		System.out.println(var);
		
		// �����÷ο� �߻�
	}
}
