package chapter5;

import java.util.Scanner;

public class Ex2_02ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("첫 번째 수를 입력하세요. : ");
		int num1 = scanf.nextInt();
		
		System.out.print("두 번째 수를 입력하세요. : ");
		int num2 = scanf.nextInt();
		
		System.out.print("연산자를 입력하세요. : ");
		String operator = scanf.next();
		
		if(operator.equals("+")) System.out.println(num1 + num2);
		else if(operator.equals("-")) System.out.println(num1 - num2);
		else if(operator.equals("*")) System.out.println(num1 * num2);
		else if(operator.equals("/")) System.out.println(num1 / (double) num2);
		else System.out.println("연산자를 잘못 입력 하셨습니다.");
	
	}
}
