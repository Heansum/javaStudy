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
		//int ascii = (int) operator.charAt(0); -> 연산자를 바로 int 값으로 저장할 수 없기에 charAt()메서드를 사용해서 int 값으로 변환 후
		//										그 변환 값을 ascii라는 int 형 변수에 저장한다.
		//										그 ascii 값을 사용을 해서 비교, 대조 후 적용이 가능하다 
		
		if(operator.equals("+")) System.out.println(num1 + num2);
		else if(operator.equals("-")) System.out.println(num1 - num2);
		else if(operator.equals("*")) System.out.println(num1 * num2);
		else if(operator.equals("/")) System.out.println(num1 / (double) num2);
		else System.out.println("연산자를 잘못 입력 하셨습니다.");
	
	}
}
