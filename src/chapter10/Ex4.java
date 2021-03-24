package chapter10;

import java.util.Scanner;

public class Ex4 {
	// simple1 메서드는 정수 1개가 필요한 메서드
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
	
	// simple4 메서드는 정수 두개가 필요한 메서드
	void simple4(int num1, int num2) {
		if(num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
	}
	
	// simple5 메서드는 정수 두개와 문자 하나가 필요한 메서드
	void simple5(int var1, int var2, char var3) {
		if(var3 == '+') {
			System.out.println(var1 + var2);
		} else if(var3 == '-') {
			System.out.println(var1 - var2);
		} // ...
	}
	// 좋은 메서드 - 한번에 하나의 동작만 하는 메서드
	void gugudan(int num) {	
		for(int i=1; i<=9; i++) {
			System.out.println( num + "* " + i + " = " + num * i );
			}
		}
		
		
	
	
	public static void main(String[] args) {
		Ex4 ex4 = new Ex4();
	
		// 호출시 안에 있는 인자는 그 메서드 매개변수 자료형 값으로 호출되어 진다. -> 그렇지않으면 호출되지 않는다
		ex4.simple(0);
		
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		ex4.simple2();
		
		ex4.simple3("Hello World~!");
		ex4.simple3("안녕하세요");
		
		ex4.simple5(1 , 2, '+');
		
		System.out.println("출력할 구구단(2 ~ 9) : ");
		
		Scanner scanf = new Scanner(System.in);
		
		int gugu = scanf.nextInt();
		int num = gugu;
		
		ex4.gugudan(num);
		
		
	}

}
