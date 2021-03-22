package chapter5;

import java.util.Scanner;

public class Ex2_08ex {
	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		int button = scanf.nextInt();
		
		switch(button) {
			case 1: 
			case 2: 
			case 3: 
				System.out.println("콜라");
				break;
			case 4: 
				System.out.println("환타"); 
				break;
			case 5: 
			case 6: 
				System.out.println("사이다");
				break;
			case 7: System.out.println("마운틴듀"); 
				break;
			default: System.out.println("1 ~ 7 번만 누를 수 있습니다.");
		}
	}
}
