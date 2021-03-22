package chapter5;

import java.util.Scanner;

public class Ex2_07 {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.println("첫 번째 수 : ");
		int num1 = scanf.nextInt();
		
		System.out.println("두 번째 수 : ");
		int num2 = scanf.nextInt();
		
		System.out.println("연산자 : ");
		String operator = scanf.next();
		
		switch(operator) {
			case "+":
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				break;
			case "-":
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case "*":	
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case "/":	
				System.out.println(num1 + "/ " + num2 + " = " + (num1 / num2));
				break;
			default:
				System.out.println("+, -, *, / 만 입력하실 수 있습니다. ");
			
		}
		
		
		
	}
}
