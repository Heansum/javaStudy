package chapter10;

import java.util.Scanner;

public class Ex4 {
	// simple1 �޼���� ���� 1���� �ʿ��� �޼���
	void simple(int val) {
		int result = val + 1;
		System.out.println(val);
	}
	
	void simple2() {
		System.out.println("Hello World~!");
	}
	
	void simple3(String message) {
		System.out.println(message);
	}
	
	// simple4 �޼���� ���� �ΰ��� �ʿ��� �޼���
	void simple4(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
	
	// simple5 �޼���� ���� �ΰ��� ���� �ϳ��� �ʿ��� �޼���
	void simple5(int var1, int var2, char var3) {
		if(var3 == '+') {
			System.out.println(var1 + var2);
		} else if(var3 == '-') {
			System.out.println(var1 - var2);
		} // ...
	}
	// ���� �޼��� - �ѹ��� �ϳ��� ���۸� �ϴ� �޼���
	void gugudan(int num) {	
		for(int i=1; i<=9; i++) {
			System.out.println( num + "* " + i + " = " + num * i );
			}
		}
		
		
	
	
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
	
		// ȣ��� �ȿ� �ִ� ���ڴ� �� �޼��� �Ű����� �ڷ��� ������ ȣ��Ǿ� ����. -> �׷��������� ȣ����� �ʴ´�
		ex4.simple(0);
		
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		
		ex4.simple3("Hello World~!");
		ex4.simple3("�ȳ��ϼ���");
		
		ex4.simple5(1 , 2, '+');
		
		System.out.println("����� ������(2 ~ 9) : ");
		
		Scanner scanf = new Scanner(System.in);
		
		int gugu = scanf.nextInt();
		int num = gugu;
		
		ex4.gugudan(num);
		
		
	}

}
