package chapter3;

import java.util.Scanner;

public class Ex9_5ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("�÷� : ");
		
		// �÷��� 0.0 ~ 2.0 ���� �ֽ��ϴ�.
		// sight ������ �÷��� ���� �ϰ� �÷��� 0.0 ~ 2.0 �������� Ȯ���ϼ���.
		
		double sight = scanf.nextDouble();
		
		// && �ذ�
		// 0.0 <= sight <= 2.0
		System.out.println(sight >= 0.0 && sight <= 2.0);
		
		// ||�ذ�
		// 0.0 <= sight <= 2.0
		System.out.println(!(sight < 0.0 || sight > 2.0)); 	// sight <= 0.0 or sight >= 2.0
																// if sight = 0.5 
																//	false or false -> !(false) = true --> in AndGate is true
																// In OrGate if outcome is out(result of left sentence)
																// , the calculating of line is over
		
		boolean result1 = sight < 0.0;
		boolean result2 = sight > 2.0;
		boolean result = result1 || result2;
		
		System.out.println(result);		// wrong sentence
		System.out.println(!result);	// right one
	}
}
