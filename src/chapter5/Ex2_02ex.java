package chapter5;

import java.util.Scanner;

public class Ex2_02ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.print("ù ��° ���� �Է��ϼ���. : ");
		int num1 = scanf.nextInt();
		
		System.out.print("�� ��° ���� �Է��ϼ���. : ");
		int num2 = scanf.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ���. : ");
		String operator = scanf.next();
		//int ascii = (int) operator.charAt(0); -> �����ڸ� �ٷ� int ������ ������ �� ���⿡ charAt()�޼��带 ����ؼ� int ������ ��ȯ ��
		//										�� ��ȯ ���� ascii��� int �� ������ �����Ѵ�.
		//										�� ascii ���� ����� �ؼ� ��, ���� �� ������ �����ϴ� 
		
		if(operator.equals("+")) System.out.println(num1 + num2);
		else if(operator.equals("-")) System.out.println(num1 - num2);
		else if(operator.equals("*")) System.out.println(num1 * num2);
		else if(operator.equals("/")) System.out.println(num1 / (double) num2);
		else System.out.println("�����ڸ� �߸� �Է� �ϼ̽��ϴ�.");
	
	}
}
