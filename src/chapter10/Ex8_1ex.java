package chapter10;

import java.util.Scanner;

public class Ex8_1ex {
	double div(double num1, double num2){
		double result = num1 % num2;
		
		return result;
	}
	
	// 1 ~ N���� �������� ��ȯ�ϴ� stackAdd �޼���
	// N�� 0�̻� 100����
	int stackAdd(int num) {
		if(num < 0 || num > 100) {
			System.out.println("n�� 0�̻� 100���ϸ� �����մϴ�.");
			
			return -1;
		}
		
		int add = 0;
		
		for(int i=1; i<=num; i++) {
			add += 1;
			
			
		}
		
		return add;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		Ex8_1ex ex8 = new Ex8_1ex();
		
		System.out.println(ex8.div(1,2));
		int num = scanf.nextInt();
		
		System.out.println(ex8.stackAdd(num));
		
	}
}
